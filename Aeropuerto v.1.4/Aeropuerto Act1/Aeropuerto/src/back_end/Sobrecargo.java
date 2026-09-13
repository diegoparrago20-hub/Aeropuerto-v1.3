/*
 CONTRERAS RODRIGUEZ JANIS ISABEL
 LIRA DOMINGUEZ BRYANT 
 PARRA GONZALEZ DIEGO ALBERTO
 */
package back_end;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author coter
 */
public class Sobrecargo{
    private String id;//primario
    private String aerolinea;
    private boolean jefaCabina;
    private String estado;  
    private String rutaImagen;
    private String codigoso;
    private String areaTrabajoso;
    private double sueldoso;
    private String turnoso;
    private String CURPso;
    private String nombresso;
    private String apellidosso;
    private Date nacimientoso;
    private int pesoso;
    private String generoso;

    public Sobrecargo() {//C vacio
    }

    public Sobrecargo(String id, boolean jefaCabina,String aerolinea, String estado, String rutaImagen, String codigoso, String areaTrabajoso, double sueldoso, String turnoso,String CURPso, String nombresso, String apellidosso, Date nacimientoso, int pesoso, String generoso) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.jefaCabina = jefaCabina;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.codigoso = codigoso;
        this.areaTrabajoso = areaTrabajoso;
        this.sueldoso = sueldoso;
        this.turnoso = turnoso;
        this.CURPso = CURPso;
        this.nombresso = nombresso;
        this.apellidosso = apellidosso;
        this.nacimientoso = nacimientoso;
        this.pesoso = pesoso;
        this.generoso = generoso;
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

    public boolean isJefaCabina() {
        return jefaCabina;
    }

    public void setJefaCabina(boolean jefaCabina) {
        this.jefaCabina = jefaCabina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado es obligatorio.");
        }
        this.estado = estado;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
public String getCodigoso() {
        return codigoso;
    }

    public void setCodigoso(String codigoso) {
        if (codigoso == null || codigoso.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de empleado es obligatorio.");
        }
        this.codigoso = codigoso;
    }

    public String getAreaTrabajoso() {
        return areaTrabajoso;
    }

    public void setAreaTrabajoso(String areaTrabajoso) {
        if (areaTrabajoso == null || areaTrabajoso.trim().isEmpty()) {
            throw new IllegalArgumentException("El área de trabajo es obligatoria.");
        }
        this.areaTrabajoso = areaTrabajoso;
    }

    public double getSueldoso() {
        return sueldoso;
    }

    public void setSueldoso(double sueldoso) {
        if (sueldoso <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor a $0.0.");
        }
        this.sueldoso = sueldoso;
    }

    public String getTurnoso() {
        return turnoso;
    }

    public void setTurnoso(String turnoso) {
        if (turnoso == null || turnoso.trim().isEmpty()) {
            throw new IllegalArgumentException("El turno es obligatorio.");
        }
        this.turnoso = turnoso;
    }
    
    public String getCURPso(){
        return CURPso;
    }
    public void setCURPso(String CURPso) {
        if (CURPso == null || CURPso.trim().isEmpty()) {
            throw new IllegalArgumentException("La CURP es obligatoria.");
        }
        String limpia = CURPso.trim().toUpperCase();
        if (limpia.length() != 18) {
            throw new IllegalArgumentException("La CURP debe contener exactamente 18 caracteres.");
        }
        this.CURPso = limpia;
    }

    public String getNombresso() {
        return nombresso;
    }

    public void setNombresso(String nombresso) {
        if (nombresso == null || nombresso.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombresso = nombresso;
    }

    public String getApellidosso() {
        return apellidosso;
    }

    public void setApellidosso(String apellidosso) {
        if (apellidosso == null || apellidosso.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios.");
        }
        this.apellidosso = apellidosso;
    }

    public Date getNacimientoso() {
        return nacimientoso;
    }

    public void setNacimientoso(Date nacimientoso) {
        if (nacimientoso == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        this.nacimientoso = nacimientoso;
    }

    public int getPesoso() {
        return pesoso;
    }

    public void setPesoso(int pesoso) {
        if (pesoso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
        }
        this.pesoso = pesoso;
    }

    public String getGeneroso() {
        return generoso;
    }

    public void setGeneroso(String generoso) {
        if (generoso == null || generoso.trim().isEmpty()) {
            throw new IllegalArgumentException("El género es obligatorio.");
        }
        this.generoso = generoso;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sobrecargo other = (Sobrecargo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
               "          DETALLES DE LA SOBRECARGO       \n" +
               "==========================================\n" +
               "• ID:            : " + id + "\n" +
               "• Aerolinea      : " + aerolinea + "\n" +
               "• Jefa de Cabina : " + jefaCabina + "\n" +
               "• Estado         : " + estado + "\n" +
               "• Ruta de Imagen : " + rutaImagen + "\n" +
               "------------------------------------------\n" +
               "          DETALLES DEL EMPLEADO           \n" +
               "==========================================\n" +
               "• Código Empleado   : " + codigoso + "\n" +
               "• Área de Trabajo   : " + areaTrabajoso + "\n" +
               "• Sueldo            : $" + String.format("%.2f", sueldoso) + "\n" +
               "• Turno             : " + turnoso + "\n" +
               "==========================================\n" +
               "            DATOS PERSONALES           \n" +
               "==========================================\n" +
               "• CURP              : " + CURPso + "\n" +
               "• Nombre Completo   : " + nombresso + " " + apellidosso + "\n" +
               "• Fecha Nacimiento  : " + nacimientoso + "\n" +
               "• Peso              : " + pesoso + " kg\n" +
               "• Género            : " + generoso + "\n" +
               "==========================================";
    }
    
    public void borrarDatos() {
        this.id = ""; // Limpia lo propio de Sobrecargo
        this.aerolinea = "";
        this.jefaCabina = false;
        this.estado = "";
        this.rutaImagen = "";
        this.codigoso = "";
        this.areaTrabajoso = "";
        this.sueldoso = 0;
        this.turnoso = "";
        this.CURPso = "";
        this.nombresso = "";
        this.apellidosso = "";
        this.nacimientoso = null;
        this.pesoso = 0;
        this.generoso = "";
    }
}//Final
