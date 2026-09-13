/*
 Equipo #2
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
public final class Piloto{
    private String noLicencia; // A primario 
    private int horasVuelo;
    private String estado;  
    private String rutaImagen;
    private String codigopi;
    private String areaTrabajopi;
    private double sueldopi;
    private String turnopi;
    private String CURPpi;
    private String nombrespi;
    private String apellidospi;
    private Date nacimientopi;
    private int pesopi;
    private String generopi;

    public Piloto() {// constructor vacio
    }

    public Piloto(String noLicencia, int horasVuelo, String estado, String rutaImagen, String codigopi, String areaTrabajopi, double sueldopi, String turnopi,String CURPpi, String nombrespi, String apellidospi, Date nacimientopi, int pesopi, String generopi) {
        this.noLicencia = noLicencia;
        this.horasVuelo = horasVuelo;
        this.codigopi = codigopi;
        this.areaTrabajopi = areaTrabajopi;
        this.sueldopi = sueldopi;
        this.turnopi = turnopi;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.CURPpi = CURPpi;
        this.nombrespi = nombrespi;
        this.apellidospi = apellidospi;
        this.nacimientopi = nacimientopi;
        this.pesopi = pesopi;
        this.generopi = generopi;
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
    
    public String getCodigopi() {
        return codigopi;
    }

    public void setCodigopi(String codigopi) {
        if (codigopi == null || codigopi.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de empleado es obligatorio.");
        }
        this.codigopi = codigopi;
    }

    public String getAreaTrabajopi() {
        return areaTrabajopi;
    }

    public void setAreaTrabajopi(String areaTrabajopi) {
        if (areaTrabajopi == null || areaTrabajopi.trim().isEmpty()) {
            throw new IllegalArgumentException("El área de trabajo es obligatoria.");
        }
        this.areaTrabajopi = areaTrabajopi;
    }

    public double getSueldopi() {
        return sueldopi;
    }

    public void setSueldopi(double sueldopi) {
        if (sueldopi <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor a $0.0.");
        }
        this.sueldopi = sueldopi;
    }

    public String getTurnopi() {
        return turnopi;
    }

    public void setTurnopi(String turnopi) {
        if (turnopi == null || turnopi.trim().isEmpty()) {
            throw new IllegalArgumentException("El turno es obligatorio.");
        }
        this.turnopi = turnopi;
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
    
    public String getCURPpi(){
        return CURPpi;
    }
    public void setCURPpi(String CURPpi) {
        if (CURPpi == null || CURPpi.trim().isEmpty()) {
            throw new IllegalArgumentException("La CURP es obligatoria.");
        }
        String limpia = CURPpi.trim().toUpperCase();
        if (limpia.length() != 18) {
            throw new IllegalArgumentException("La CURP debe contener exactamente 18 caracteres.");
        }
        this.CURPpi = limpia;
    }

    public String getNombrespi() {
        return nombrespi;
    }

    public void setNombrespi(String nombrespi) {
        if (nombrespi == null || nombrespi.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombrespi = nombrespi;
    }

    public String getApellidospi() {
        return apellidospi;
    }

    public void setApellidospi(String apellidospi) {
        if (apellidospi == null || apellidospi.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios.");
        }
        this.apellidospi = apellidospi;
    }

    public Date getNacimientopi() {
        return nacimientopi;
    }

    public void setNacimientopi(Date nacimientopi) {
        if (nacimientopi == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        this.nacimientopi = nacimientopi;
    }

    public int getPesopi() {
        return pesopi;
    }

    public void setPesopi(int pesopi) {
        if (pesopi <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
        }
        this.pesopi = pesopi;
    }

    public String getGeneropi() {
        return generopi;
    }

    public void setGeneropi(String generopi) {
        if (generopi == null || generopi.trim().isEmpty()) {
            throw new IllegalArgumentException("El género es obligatorio.");
        }
        this.generopi = generopi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.noLicencia);
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
        final Piloto other = (Piloto) obj;
        return Objects.equals(this.noLicencia, other.noLicencia);
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
           "==========================================\n" +
           "          DETALLES DEL EMPLEADO           \n" +
           "==========================================\n" +
           "• Código Empleado   : " + codigopi + "\n" +
           "• Área de Trabajo   : " + areaTrabajopi + "\n" +
           "• Sueldo            : $" + String.format("%.2f", sueldopi) + "\n" +
           "• Turno             : " + turnopi + "\n" +
           "==========================================\n" +
           "            DATOS PERSONALES           \n" +
           "==========================================\n" +
           "• CURP              : " + CURPpi + "\n" +
           "• Nombre Completo   : " + nombrespi + " " + apellidospi + "\n" +
           "• Fecha Nacimiento  : " + nacimientopi + "\n" +
           "• Peso              : " + pesopi + " kg\n" +
           "• Género            : " + generopi + "\n" +
           "==========================================";
    }
    public void borrarDatos() {
        this.noLicencia = ""; // Limpia 
        this.horasVuelo = 0;
        this.estado = "";
        this.rutaImagen = "";
        this.codigopi = "";
        this.areaTrabajopi = "";
        this.sueldopi = 0;
        this.turnopi = "";
        this.CURPpi = "";
        this.nombrespi = "";
        this.apellidospi = "";
        this.nacimientopi = null;
        this.pesopi = 0;
        this.generopi = "";
    }
}//Final
