package com.company;

public class Paciente {
    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private String primeraConsulta;

    public Paciente(Consulta consulta, String fechaNacimiento, String nombre, String apellido, String primeraConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
    }

    public Boolean permitirEvaluacionInicial() {
        if(this.primeraConsulta == "SI") {
            System.out.println("Permitir evaluación inicial");
            return true;
        }
        System.out.println("No, ya que no es su primera consulta");
        return false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Consulta getConsulta() {
        return this.consulta;
    }

    public String getPrimeraConsulta() {
        return this.primeraConsulta;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
}
