package fju.com.car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainpanel;
    private JButton button1;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().button1);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
