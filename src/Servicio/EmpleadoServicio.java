package Servicio;
import Entidades.Empleado;

public class EmpleadoServicio {
    Empleado[] empleados;

    public EmpleadoServicio(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public double calcularSalarioPromedio() {
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.getSalario();
        }
            return totalSalarios / empleados.length;
    }

    public String[] empleadosConSalarioMayorAlPromedio() {
        double salarioPromedio = calcularSalarioPromedio();
        int count = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > salarioPromedio) {
                count++;
            }
        }

        String[] nombresEmpleados = new String[count];
        int index = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > salarioPromedio) {
                nombresEmpleados[index] = empleado.getNombre();
                index++;
            }
        }
        return nombresEmpleados;
    }

    public void mostrarEmpleadosConSalarioMayorAlPromedio() {
        String[] nombresEmpleados = empleadosConSalarioMayorAlPromedio();
        double salarioPromedio = calcularSalarioPromedio();

        System.out.println("Salario promedio de todos los empleados: " + Math.round(salarioPromedio));
        System.out.println("Empleados con salario mayor al promedio:");

        for (String nombre : nombresEmpleados) {
            System.out.println(nombre);
        }
    }
}
