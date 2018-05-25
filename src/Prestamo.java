import java.util.Date;

/**
 * Created by gaston on 03/04/17.
 */
public class Prestamo {

    //atributos
    private Socio socio;
    private Ejemplar ejemplar;
    private Date fecha;

    //metodos
    public Prestamo(Socio socio, Ejemplar ejemplar) {
        this.socio = socio;
        this.ejemplar = ejemplar;
        this.fecha = new Date();
    }

}
