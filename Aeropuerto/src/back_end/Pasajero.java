/*
 Equipo #2
 CONTRERAS RODRIGUEZ JANIS ISABEL
 LIRA DOMINGUEZ BRYANT 
 PARRA GONZALEZ DIEGO ALBERTO
 */
package back_end;
import java.util.Date;
/**
 *
 * @author coter
 */
public final class Pasajero extends Persona{
    private String noPasaporte;//primario
    private String asiento;
    private String nacionalidad;
    
    public Pasajero() {//Constrcutor vacio 
    }

    public Pasajero(String noPasaporte,String asiento,String nacionalidad, String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.noPasaporte = noPasaporte;
        this.asiento = asiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNoPasaporte() {
        return noPasaporte;
    }

    public void setNoPasaporte(String noPasaporte) {
        if (noPasaporte == null || noPasaporte.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de pasaporte es obligatorio.");
        }
        this.noPasaporte = noPasaporte;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        if (noPasaporte == null || noPasaporte.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de pasaporte es obligatorio.");
        }
        this.asiento = asiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La nacionalidad es obligatoria.");
        }
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "==========================================\n" +
               "          DETALLES DEL PASAJERO           \n" +
               "==========================================\n" +
               "• Núm. Pasaporte    : " + noPasaporte + "\n" +
               "• Nacionalidad      : " + nacionalidad + "\n" +
               "• Asiento Asignado  : " + asiento + "\n" +
               "------------------------------------------\n" +
               "          DATOS PERSONALES                \n" +
               "------------------------------------------\n" +
               "• CURP              : " + getCURP() + "\n" +
               "• Nombre Completo   : " + getNombres() + " " + getApellidos() + "\n" +
               "• Fecha Nacimiento  : " + getNacimiento() + "\n" +
               "• Peso              : " + getPeso() + " kg\n" +
               "• Género            : " + getGenero() + "\n" +
               "• Estado            : " + getEstado() + "\n" +
               "• Ruta de Imagen    : " + getRutaImagen() + "\n" +
               "==========================================";}
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.noPasaporte = ""; // Limpia de Pasajero
        this.asiento = "";
        this.nacionalidad = "";
    }
}//Final
