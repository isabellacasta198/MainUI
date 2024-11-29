package UI;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Playlist extends JFrame {
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
    public void agregarCanciones(){
        agregarCanciones();

    }
    public void eliminarCanciones(){
        eliminarCanciones();
    }
    public String obtenerInformacion (){
        return  "nombre:" +Nombre+"descripcion:" +descripcion+"canciones:" +canciones;
    }
}
