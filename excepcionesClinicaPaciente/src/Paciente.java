import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;

//Before es antes y after después//


    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException {
        Date hoy= new Date();

        this.nombre = nombre;
        this.apellido = apellido;
        this.historiaClinica = historiaClinica;
        this.fechaAlta = null;
        if(fechaInternacion.after(hoy)) {
            throw new PacienteException("La fecha ingresada " + fechaInternacion + "es posterior al día de " + hoy);
        }
        this.fechaInternacion = fechaInternacion;
        System.out.println(fechaInternacion);

    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException{

        if(fechaAlta.before(fechaInternacion)) {
            throw new PacienteException("La fecha de alta no puede ser antes de la de la fecha de internación");
        }
        this.fechaAlta = fechaAlta;
        System.out.println(fechaAlta);
    }
}
