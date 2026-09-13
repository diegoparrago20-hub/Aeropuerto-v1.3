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
public class Empleado{
    private String codigo;// primario
    private String areaTrabajo;
    private double sueldo;
    private String turno;
    private String estado;  
    private String rutaImagen;
    private String CURPemp;
    private String nombresemp;
    private String apellidosemp;
    private Date nacimientoemp;
    private int pesoemp;
    private String generoemp;

    public Empleado() {
    }

    public Empleado(String codigo, String areaTrabajo, double sueldo, String turno, String estado, String rutaImagen,String CURPemp, String nombresemp, String apellidosemp, Date nacimientoemp, int pesoemp, String generoemp) {
        this.codigo = codigo;
        this.areaTrabajo = areaTrabajo;
        this.sueldo = sueldo;
        this.turno = turno;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.CURPemp = CURPemp;
        this.nombresemp = nombresemp;
        this.apellidosemp = apellidosemp;
        this.nacimientoemp = nacimientoemp;
        this.pesoemp = pesoemp;
        this.generoemp = generoemp;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de empleado es obligatorio.");
        }
        this.codigo = codigo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        if (areaTrabajo == null || areaTrabajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El área de trabajo es obligatoria.");
        }
        this.areaTrabajo = areaTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor a $0.0.");
        }
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.trim().isEmpty()) {
            throw new IllegalArgumentException("El turno es obligatorio.");
        }
        this.turno = turno;
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
    
    public String getCURPemp(){
        return CURPemp;
    }
    public void setCURPemp(String CURPemp) {
        if (CURPemp == null || CURPemp.trim().isEmpty()) {
            throw new IllegalArgumentException("La CURP es obligatoria.");
        }
        String limpia = CURPemp.trim().toUpperCase();
        if (limpia.length() != 18) {
            throw new IllegalArgumentException("La CURP debe contener exactamente 18 caracteres.");
        }
        this.CURPemp = limpia;
    }

    public String getNombresemp() {
        return nombresemp;
    }

    public void setNombresemp(String nombresemp) {
        if (nombresemp == null || nombresemp.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombresemp = nombresemp;
    }

    public String getApellidosemp() {
        return apellidosemp;
    }

    public void setApellidosemp(String apellidosemp) {
        if (apellidosemp == null || apellidosemp.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios.");
        }
        this.apellidosemp = apellidosemp;
    }

    public Date getNacimientoemp() {
        return nacimientoemp;
    }

    public void setNacimientoemp(Date nacimientoemp) {
        if (nacimientoemp == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        this.nacimientoemp = nacimientoemp;
    }

    public int getPesoemp() {
        return pesoemp;
    }

    public void setPesoemp(int pesoemp) {
        if (pesoemp <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
        }
        this.pesoemp = pesoemp;
    }

    public String getGeneroemp() {
        return generoemp;
    }

    public void setGeneroemp(String generoemp) {
        if (generoemp == null || generoemp.trim().isEmpty()) {
            throw new IllegalArgumentException("El género es obligatorio.");
        }
        this.generoemp = generoemp;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    @Override
    public String toString() {
        return ("==========================================\n" +
               "          DETALLES DEL EMPLEADO           \n" +
               "==========================================\n" +
               "• Código Empleado   : " + codigo + "\n" +
               "• Área de Trabajo   : " + areaTrabajo + "\n" +
               "• Sueldo            : $" + String.format("%.2f", sueldo) + "\n" +
               "• Turno             : " + turno + "\n" +
               "------------------------------------------\n") +
               "==========================================\n" +
               "            DATOS PERSONALES           \n" +
               "==========================================\n" +
               "• CURP              : " + CURPemp + "\n" +
               "• Nombre Completo   : " + nombresemp + " " + apellidosemp + "\n" +
               "• Fecha Nacimiento  : " + nacimientoemp + "\n" +
               "• Peso              : " + pesoemp + " kg\n" +
               "• Género            : " + generoemp + "\n" +
               "==========================================";
    }
    public void borrarDatos() {
        this.codigo = ""; // Limpia 
        this.areaTrabajo = "";
        this.sueldo = 0;
        this.turno = "";
        this.estado = "";
        this.rutaImagen = "";
        this.CURPemp = "";
        this.nombresemp = "";
        this.apellidosemp = "";
        this.nacimientoemp = null;
        this.pesoemp = 0;
        this.generoemp = "";
    }
}//Final
