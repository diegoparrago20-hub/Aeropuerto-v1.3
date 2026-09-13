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
public final class Piloto extends Empleado {
    private String noLicencia; // A primario 
    private int horasVuelo;

    public Piloto() {// constructor vacio
    }

    public Piloto(String noLicencia, int horasVuelo,String codigo, String areaTrabajo, double sueldo, String turno,String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(codigo, areaTrabajo, sueldo, turno, CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.noLicencia = noLicencia;
        this.horasVuelo = horasVuelo;
    }

    public String getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(String noLicencia) {
        if (noLicencia == null || noLicencia.trim().isEmpty()) {
            throw new IllegalArgumentException("La licencia de piloto es obligatoria.");
        }
        this.noLicencia = noLicencia;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        if (horasVuelo < 0) {
            throw new IllegalArgumentException("Las horas de vuelo no pueden ser negativas.");
        }
        this.horasVuelo = horasVuelo;
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "           DETALLES DEL PILOTO            \n" +
           "==========================================\n" +
           "• Licencia          : " + noLicencia + "\n" +
           "• Horas de Vuelo    : " + horasVuelo + " hrs\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.noLicencia = ""; // Limpia lo propio de Pasajero
        this.horasVuelo = 0;
    }
}//Final
