package PracticaLab4;

import java.util.Scanner;

public class AppEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 2; i++) {
            System.out.println("Empleado a tiempo completo" + (i+1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Su salario anual es ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }
        for (int i = 2; i < 5; i++) {
            System.out.println("Empleado que trabaja por horas" + (i-1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Horas trabajadas ");
            double horas = sc.nextDouble();
            System.out.println("Sueldo por hora ");
            double tarifa = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }
        System.out.println("\n------ Lista de Empleados ------");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }
        sc.close();
    }
}
