package com.company;

public class Main {
    public static void main(String[] args) {
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empresa empresa = new Empresa("SA");

        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-EXT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-INT"));

        System.out.println(empresa.calcularSueldoTotal(30));

    }
}
