package tangun;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame{
    
    public static final int WIDTH = 500;
    public static final int HEIGHT = 100;
    public static String tangun = "tangun";
     
    public Main()
    {
       
        this.setTitle("Zaloguj");
        this.setBounds(300, 300, WIDTH, HEIGHT);
        int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation((szerokosc-WIDTH)/2, (wysokosc-HEIGHT)/2);  
        
        panel.add(text);
        panel.add(haslo);
        panel.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pass = haslo.getText();
                if(pass.equals(tangun))
                    new group().setVisible(true);
                else
                    System.out.println("Złe hasło!");
            }
        });

        
        
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
    }

    private JLabel text = new JLabel("Podaj hasło: ");
    private JTextField haslo = new JTextField(15);
    private JButton button = new JButton("Zaloguj");
    private JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
  
}
