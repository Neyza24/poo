import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345", new Date(121, 9, 15));
            paciente.darAlta(new Date(121, 10, 15));
        } catch (PacienteException e) {
            e.printStackTrace();
        }

    }
}
