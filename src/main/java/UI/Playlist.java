package UI;
import java.awt.*;
import javax.swing.*;


import java.util.ArrayList;
import java.util.List;

public abstract class Playlist extends JFrame {
    String Nombre;
    String descripcion;
    List<Canciones> canciones;
    public Playlist(String nombre , String descripcion) {
        this.Nombre = nombre;
        this.descripcion = descripcion;

    }
    public ArrayList<Canciones> getCanciones() {
        ArrayList<Canciones> canciones = new ArrayList<>();
        return canciones;
    }
    public abstract void agregarCanciones(Canciones cancion);
    public abstract void eliminarCanciones(Canciones cancion);

}
