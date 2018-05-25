import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaston on 03/04/17.
 */
public class Main {
    public static void main(String[] args) {
        //nueva biblio
        Biblioteca biblioteca1 = new Biblioteca();
        //nuevos libros
        Libro libro1 = new Libro("Harry Potter", 1, "J. K. Rowling");
        Ejemplar ejemplar1 = new Ejemplar(libro1,1,1);
        libro1.agregarEjemplar(ejemplar1);
        Libro libro2 = new Libro("Guerra y Paz", 2, "Leon Tolstoi");
        Libro libro3 = new Libro("El Extranjero",3, "Albert Camu");
        Libro libro4 = new Libro("El Conde de Montecristo", 4 , "1845");
        Libro libro5 = new Libro("Orgullo y Prejuicio",5,"Jane Austen");
        Libro libro6 = new Libro("El Nombre de la Rosa", 6, "Humberto Eco");
        Libro libro7 = new Libro("El retrato de Dorain Gray", 7, "Oscar Wilde");
        Libro libro8 = new Libro("Las Aventuras de Hucklever", 8 , "Mark Twain");
        Libro libro9 = new Libro("Los Miserables", 9 , "Victor Hugo");
        Libro libro10 = new Libro("Grandes Esperanzas", 10 , "Charles Dick");
        List<Libro> listaDeLibros = new ArrayList<>();
        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);
        listaDeLibros.add(libro3);
        listaDeLibros.add(libro4);
        listaDeLibros.add(libro5);
        listaDeLibros.add(libro6);
        listaDeLibros.add(libro7);
        listaDeLibros.add(libro8);
        listaDeLibros.add(libro9);
        listaDeLibros.add(libro10);
        biblioteca1.agregarListaLibros(listaDeLibros);

        //nuevos socios
        Socio socio1 = new Socio("Gaston", "Yelmini", 00001);
        Socio socio2 = new Socio("Matias", "Sendon", 00002);
        Socio socio3 = new Socio("Marcelo", "Catasegna", 00003);
        Socio socio4 = new Socio("Santiago", "Acosta", 00004);
        Socio socio5 = new Socio("Catalina", "Gonzales", 00005);
        List<Socio> listaDeSocios = new ArrayList<>();
        listaDeSocios.add(socio1);
        listaDeSocios.add(socio2);
        listaDeSocios.add(socio3);
        listaDeSocios.add(socio4);
        listaDeSocios.add(socio5);
        biblioteca1.agregarSocios(listaDeSocios);

        biblioteca1.prestarLibro(1, 00001);
        biblioteca1.prestarLibro(2, 00002);
        biblioteca1.prestarLibro(3, 00003);
    }
}
