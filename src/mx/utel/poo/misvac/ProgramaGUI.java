package mx.utel.poo.misvac;

import javax.swing.*;

public class ProgramaGUI {
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ProgramaGUI");
        frame.setContentPane(new ProgramaGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
