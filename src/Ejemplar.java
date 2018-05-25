/**
 * Created by gaston on 03/04/17.
 */
public class Ejemplar {

    //atributos
    private Libro libro;
    private Integer nroEdicion;
    private Integer ubicacion;

    //metodos
    public Ejemplar(Libro libro, Integer nroEdicion, Integer ubicacion) {
        this.libro = libro;
        this.nroEdicion = nroEdicion;
        this.ubicacion = ubicacion;
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public Libro getLibro() {
        return libro;
    }

}
