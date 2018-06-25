package tangun;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class grupa1 extends JFrame{
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;
    
    public grupa1()
    {
        this.setTitle("Tangun");
        this.setBounds(300, 300, WIDTH, HEIGHT);
        int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation((szerokosc-WIDTH)/2, (wysokosc-HEIGHT)/2);  
        String baza = "tangun";
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection polaczenie = DriverManager.getConnection("jdbc:sqlite:" + baza + ".sqlite");
            System.out.println("Połączyłem się z bazą " + baza);
        
            Statement stat = polaczenie.createStatement();

            stat = polaczenie.createStatement();
            ResultSet wynik = stat.executeQuery("SELECT * FROM " + baza);
          
            DefaultListModel listModel = new DefaultListModel();

            while (wynik.next()) {
                listModel.addElement(wynik.getInt("id"));
                listModel.addElement(wynik.getString("imie"));
                listModel.addElement(wynik.getString("nazwisko"));
                listModel.addElement("IX:   " + wynik.getString("ix"));
                listModel.addElement("X:   " + wynik.getString("x"));
                listModel.addElement("XI:   " + wynik.getString("xi"));
                listModel.addElement("XII:   " + wynik.getString("xii"));
                listModel.addElement("I:   " + wynik.getString("i"));
                listModel.addElement("II:   " + wynik.getString("ii"));
                listModel.addElement("III:   " + wynik.getString("iii"));
                listModel.addElement("IV:   " + wynik.getString("iv"));
                listModel.addElement("V:   " + wynik.getString("v"));
                listModel.addElement("VI:   " + wynik.getString("vi"));
            }
            lista = new JList(listModel);
            wynik.close();
            stat.close();
            polaczenie.close();
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        
        panel_up.add(grupa1);

        panel_add.add(dodaj);
        panel_add.add(edytuj);
        panel_add.add(usun);
        
        dodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new add_new().setVisible(true);
            }
        });
        edytuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new edit().setVisible(true);
            }
        });
        usun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new delete().setVisible(true);
            }
        });
        
        
        lista.setPreferredSize(new Dimension(1100, 600));
        lista.setBorder(BorderFactory.createEtchedBorder());
        panel_center.add(lista);
        lista.setVisibleRowCount(-1); //tyle elementów ile się zmieści
        lista.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        this.getContentPane().add(panel_up, BorderLayout.NORTH);
        this.getContentPane().add(panel_center, BorderLayout.CENTER);
        this.getContentPane().add(panel_add, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(3);
    }
    private JButton dodaj = new JButton("Dodaj");
    private JButton edytuj = new JButton("Edytuj");
    private JButton usun = new JButton("Usuń");
    private JPanel panel_add = new JPanel();
    private JPanel panel_up = new JPanel();
    private JPanel panel_center = new JPanel();
    private JList lista = new JList();
    private JLabel grupa1 = new JLabel("Grupa Młodsza");
}
