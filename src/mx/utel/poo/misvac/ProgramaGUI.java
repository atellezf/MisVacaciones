package mx.utel.poo.misvac;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaGUI {

    private JPanel rootPanel;
    private JTextArea cmpDetalle;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextField cmpOrigen;
    private JTextField cmpDestino;
    private JComboBox cmbElementos;
    private JTextField cmpFecha;

    public ProgramaGUI() {

    }



    public static void main(String[] args) {
        cargarTema();
        JFrame frame = new JFrame("Mis próximas vacaciones");
        frame.setContentPane(new ProgramaGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void cargarTema() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
