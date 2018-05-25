import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaston on 03/04/17.
 */
public class Socio {

    //atributos
    private String nombre;
    private String apellido;
    private Integer nroIdentificacion;
    private Integer maximaRetirada;
    private List<Ejemplar> ejemplaresPresatados = new ArrayList<>();

    //metodos
    public Socio(String nombre, String apellido, Integer nroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroIdentificacion = nroIdentificacion;
        this.maximaRetirada = 3;
    }

    protected void setMaximaRetirada(Integer maximaRetirada) {
        this.maximaRetirada = maximaRetirada;
    }

    public String getNombre() {
        return nombre + " " + apellido;
    }

    public Integer getNroIdentificacion() {
        return nroIdentificacion;
    }

    public Boolean tieneCupoDisponible() {
        return ejemplaresPresatados.size() < maximaRetirada;
    }

    public void tomarPrestadoUnEjemplar(Ejemplar ejemplar) {
        ejemplaresPresatados.add(ejemplar);
    }

    public void devolverEjemplar(Ejemplar ejemplar) {
        ejemplaresPresatados.remove(ejemplar);
    }

}
