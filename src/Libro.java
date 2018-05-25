import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaston on 03/04/17.
 */
public class Libro {

    //atributos
    private String nombre;
    private Integer codigoIsbn;
    private String autor;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    //metodos
    public Libro(String nombre, Integer codigoIsbn, String autor) {
        this.nombre = nombre;
        this.codigoIsbn = codigoIsbn;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoIsbn() {
        return codigoIsbn;
    }

    public String getAutor() {
        return autor;
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public Boolean tieneEjemplares() {
        return ejemplares.size() > 0;
    }

    public Ejemplar prestarEjemplar() {
        Ejemplar libroPrestado = null;
        libroPrestado = ejemplares.remove(0);
        return libroPrestado;
    }

    public void reingresarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

}
