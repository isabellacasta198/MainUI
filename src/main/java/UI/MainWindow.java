package UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setSize(800, 600);
        setTitle("gestor de colecciones de música");

        Usuario usuario = new Usuario();
        JPanel panelIzquierdo = new JPanel();
        JPanel panelDerecho = new JPanel();
        JPanel panelSuperior = new JPanel();
        JPanel panelInferior = new JPanel();

        add(panelIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.EAST);
        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.SOUTH);

        }
        public static void main(String [] args){
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);

        }
}
