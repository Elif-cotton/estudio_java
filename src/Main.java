import Entidades.Empleado;
import Servicio.EmpleadoServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado[] empleados = new Empleado[6];

       // for (int i = 0; i < 6; i++) {
         //   System.out.println("Ingrese el nombre del empleado " + (i+1);
         //   String nombre = leer.next();
          //  System.out.println("Ingrese el salario del empleado " + (i+1);
        //    double salario = leer.nextDouble();
           // empleados[i] = new Empleado(nombre, salario);
       // }

        empleados[0] = new Empleado("Juan", 2500);
        empleados[1] = new Empleado("Luis", 3000);
        empleados[2] = new Empleado("Emma", 2800);
        empleados[3] = new Empleado("María", 3200);
        empleados[4] = new Empleado("Anna", 2700);
        empleados[5] = new Empleado("Esteban", 3500);

        EmpleadoServicio empleadoServicio = new EmpleadoServicio(empleados);
        double salarioPromedio = empleadoServicio.calcularSalarioPromedio();
        empleadoServicio.mostrarEmpleadosConSalarioMayorAlPromedio();

    }
}