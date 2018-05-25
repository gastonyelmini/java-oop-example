/**
 * Created by gaston on 03/04/17.
 */
public class SocioVip extends Socio {

    //atributos
    private Integer cuotaMensual;


    public SocioVip(String nombre, String apellido, Integer nroIdentificacion, Integer cuotaMensual) {
        super(nombre, apellido, nroIdentificacion);
        super.setMaximaRetirada(15);
        this.cuotaMensual = cuotaMensual;
    }

}
