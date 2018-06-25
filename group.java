package tangun;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class group extends JFrame{
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public group(){
        this.setTitle("Wybierz grupę");
        this.setBounds(0, 0, WIDTH, HEIGHT);
        int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation((szerokosc-WIDTH)/2, (wysokosc-HEIGHT)/2);  
        
        
        grupa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new grupa1().setVisible(true);
            }
        });
        grupa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new grupa2().setVisible(true);
            }
        });
        panel.add(grupa1);
        panel.add(grupa2);
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
        this.pack();
    }
    
    private JButton grupa1 = new JButton("Grupa Młodsza");
    private JButton grupa2 = new JButton("Grupa Starsza");
    private JPanel panel = new JPanel();
    
}
