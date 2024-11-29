package UI;
import java.awt.*;
import javax.swing.*;

public class Canciones extends JFrame {

    String titulo,genero,Artista;
    int duracion;

    public Canciones(String titulo, String genero, String Artista, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.Artista = Artista;
        this.duracion = duracion;

    }
    public String getTitulo() {
        return titulo;
    }
    public void reproducir() {
        System.out.println("Reproduciendo:"+titulo);
    }
    public String obtenerInformacion() {
        return "Titulo: " + titulo + ", Duración: " + duracion + "Género: " + genero + ", Artista: " + artista;
    }

}
