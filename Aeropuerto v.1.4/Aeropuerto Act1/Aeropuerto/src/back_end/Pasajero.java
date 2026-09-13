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
public final class Pasajero{
    private String noPasaporte;//primario
    private String asiento;
    private String nacionalidad;
    private String estado;  
    private String rutaImagen;
    private String CURPpsj;
    private String nombrespsj;
    private String apellidospsj;
    private Date nacimientopsj;
    private int pesopsj;
    private String generopsj;
    
    public Pasajero() {//Constrcutor vacio 
    }

    public Pasajero(String noPasaporte,String asiento,String nacionalidad, String estado, String rutaImagen, String CURPpsj, String nombrespsj, String apellidospsj, Date nacimientopsj, int pesopsj, String generopsj) {
        this.noPasaporte = noPasaporte;
        this.asiento = asiento;
        this.nacionalidad = nacionalidad;
        this.CURPpsj = CURPpsj;
        this.nombrespsj = nombrespsj;
        this.apellidospsj = apellidospsj;
        this.nacimientopsj = nacimientopsj;
        this.pesopsj = pesopsj;
        this.generopsj = generopsj;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
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
        if (asiento == null || asiento.trim().isEmpty()) {
        throw new IllegalArgumentException("El número de asiento es obligatorio.");
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
    public String getCURPpsj() {
        return CURPpsj;
    }

    public void setCURPpsj(String CURPpsj) {
        if (CURPpsj == null || CURPpsj.trim().isEmpty()) {
            throw new IllegalArgumentException("La CURP es obligatoria.");
        }
        String limpia = CURPpsj.trim().toUpperCase();
        if (limpia.length() != 18) {
            throw new IllegalArgumentException("La CURP debe contener exactamente 18 caracteres.");
        }
        this.CURPpsj = limpia;
    }

    public String getNombrespsj() {
        return nombrespsj;
    }

    public void setNombrespsj(String nombrespsj) {
        if (nombrespsj == null || nombrespsj.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombrespsj = nombrespsj;
    }

    public String getApellidospsj() {
        return apellidospsj;
    }

    public void setApellidospsj(String apellidospsj) {
        if (apellidospsj == null || apellidospsj.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios.");
        }
        this.apellidospsj = apellidospsj;
    }

    public Date getNacimientopsj() {
        return nacimientopsj;
    }

    public void setNacimientopsj(Date nacimientopsj) {
        if (nacimientopsj == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        this.nacimientopsj = nacimientopsj;
    }

    public int getPesopsj() {
        return pesopsj;
    }

    public void setPesopsj(int pesopsj) {
        if (pesopsj <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
        }
        this.pesopsj = pesopsj;
    }

    public String getGeneropsj() {
        return generopsj;
    }

    public void setGeneropsj(String generopsj) {
        if (generopsj == null || generopsj.trim().isEmpty()) {
            throw new IllegalArgumentException("El género es obligatorio.");
        }
        this.generopsj = generopsj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.noPasaporte);
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
        final Pasajero other = (Pasajero) obj;
        return Objects.equals(this.noPasaporte, other.noPasaporte);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
               "          DETALLES DEL PASAJERO           \n" +
               "==========================================\n" +
               "• Núm. Pasaporte    : " + noPasaporte + "\n" +
               "• Nacionalidad      : " + nacionalidad + "\n" +
               "• Asiento Asignado  : " + asiento + "\n" +
               "==========================================\n" +
               "            DATOS PERSONALES           \n" +
               "==========================================\n" +
               "• CURP              : " + CURPpsj + "\n" +
               "• Nombre Completo   : " + nombrespsj + " " + apellidospsj + "\n" +
               "• Fecha Nacimiento  : " + nacimientopsj + "\n" +
               "• Peso              : " + pesopsj + " kg\n" +
               "• Género            : " + generopsj + "\n" +
               "==========================================";
    }

    public void borrarDatos() {
        this.noPasaporte = ""; // Limpia de Pasajero
        this.asiento = "";
        this.nacionalidad = "";
        this.estado = "";
        this.rutaImagen = "";
        this.CURPpsj = "";
        this.nombrespsj = "";
        this.apellidospsj = "";
        this.nacimientopsj = null;
        this.pesopsj = 0;
        this.generopsj = "";
    }
}//Final
