import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaston on 03/04/17.
 */
public class Biblioteca {

    //atributos
    private List<Libro> libros = new ArrayList<>();
    private List<Socio> socios = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    //metodos
    public void agregarListaLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public void prestarLibro(Integer codigoIsbn, Integer nroIdentificacion) {
        Libro libroAPrestar = null;
        for(Libro unLibro: libros) {
            if(codigoIsbn.equals(unLibro.getCodigoIsbn())) {
                libroAPrestar = unLibro;
            }
        }

        Socio socioAPrestar = null;
        for(Socio unSocio: socios) {
            if(nroIdentificacion.equals(unSocio.getNroIdentificacion())) {
                socioAPrestar = unSocio;
            }
        }

        if(socioAPrestar.tieneCupoDisponible() && libroAPrestar.tieneEjemplares()) {
            Ejemplar ejemplarAPrestar = libroAPrestar.prestarEjemplar();
            socioAPrestar.tomarPrestadoUnEjemplar(ejemplarAPrestar);
            Prestamo unPrestamo = new Prestamo(socioAPrestar, ejemplarAPrestar);
            System.out.println("Nuevo prestamo a socio: " + socioAPrestar.getNombre() + ". Libro prestado nro: " + ejemplarAPrestar.getNroEdicion());
        } else {
            System.out.println("No se puede realizar el prestamo.");
        }

    }

    public void devolverUnEjemplar(Ejemplar unEjemplar, Integer nroDeIdentificacion) {
        for(Socio unSocio: socios) {
            if(nroDeIdentificacion.equals(unSocio.getNroIdentificacion())) {
                unSocio.devolverEjemplar(unEjemplar);
            }
        }

        for(Libro unLibro: libros) {
            if(unEjemplar.getLibro().equals(unLibro)) {
                unLibro.reingresarEjemplar(unEjemplar);
            }
        }

        System.out.println("El socio nro: " + nroDeIdentificacion + " devolvio el libro nro: " + unEjemplar.getNroEdicion());

    }

    public void prestar(List<Integer> unaListaDeISBN, Integer unNumeroDeIdentificacion) {
        for(Integer unIsbn: unaListaDeISBN) {
            prestarLibro(unIsbn, unNumeroDeIdentificacion);
        }
    }

    public void devolver(List<Ejemplar> ejemplares, Integer unNumeroDeIdentificacion) {
        for(Ejemplar unEjemplar: ejemplares) {
            devolverUnEjemplar(unEjemplar, unNumeroDeIdentificacion);
        }
    }

}
