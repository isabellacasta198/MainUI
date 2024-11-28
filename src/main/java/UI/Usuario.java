package UI;
import java.awt.*;
import java.util.List;
import javax.swing.*;


public class Usuario extends JFrame {
    String nombre,email;
    List<Playlist> PlaylistFavorita;


    public Usuario() {
        setTitle("Usuario");
        setSize(500, 500);
        setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel();
        JPanel panelDerecho = new JPanel();
        JPanel panelSuperior = new JPanel();
        JPanel panelInferior = new JPanel();

        add(panelIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.EAST);
        add(panelSuperior, BorderLayout.NORTH);
        add(panelInferior, BorderLayout.SOUTH);
    }


    public void agregarPlaylist(){
        agregarPlaylist();

    }
    public void eliminarPlaylist(){
        eliminarPlaylist();
    }








}
