package UI;
import java.awt.*;
import javax.swing.*;
import java.util.List;

public class Artista extends JFrame {
    private String nombre,pais,genero;
    List<Canciones> canciones;

    public Artista(String nombre, String pais, String genero) {
        this.nombre = nombre;
        this.pais = pais;
        this.genero = genero;
    }
    public void agregarCancion(Canciones cancion) {
        canciones.add(cancion);
    }
}
