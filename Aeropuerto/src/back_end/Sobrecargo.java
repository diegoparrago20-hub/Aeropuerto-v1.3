/*
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
public class Sobrecargo extends Empleado{
    private String id;//primario
    private String aerolinea;
    private boolean jefaCabina;

    public Sobrecargo() {//C vacio
    }

    public Sobrecargo(String id, boolean jefaCabina,String codigo, String areaTrabajo, double sueldo, String turno, String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(codigo, areaTrabajo, sueldo, turno, CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.id = id;
        this.jefaCabina = jefaCabina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID de sobrecargo es obligatorio.");
        }
        this.id = id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        if (aerolinea == null || aerolinea.trim().isEmpty()) {
            throw new IllegalArgumentException("La aerolínea es obligatoria.");
        }
        this.aerolinea = aerolinea;
    }

    public boolean isjefaCabina() {
        return jefaCabina;
    }

    public void setjefaCabina(boolean jefaCabina) {
        this.jefaCabina = jefaCabina;
    }

    @Override
    public String toString() {
        return "==========================================\n" +
               "          DETALLES DEL EMPLEADO           \n" +
               "==========================================\n" +
               "• Código Empleado   : " + codigo + "\n" +
               "• Área de Trabajo   : " + areaTrabajo + "\n" +
               "• Sueldo            : $" + String.format("%.2f", sueldo) + "\n" +
               "• Turno             : " + turno + "\n" +
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
               "==========================================";
    }
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.id = ""; // Limpia lo propio de Sobrecargo
        this.aerolinea = "";
        this.jefaCabina = false;
    }
}//Final
