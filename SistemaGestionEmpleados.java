import java.util.Scanner;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
 
         System.out.println(Mensajes.BIENVENIDA);

        Empleados empleados = new Empleados(3);

        // Dar de alta empleados
        empleados.darAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        // Mostrar lista inicial
        System.out.println(Mensajes.LISTA_INICIAL);
        empleados.mostrarListado();

        // Solicitar aumento de salario
        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUCIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        // Aplicar aumento
        empleados.aumentarSalario(porcentaje);

        // Mostrar lista actualizada
        System.out.println("\n" + Mensajes.LISTA_ACTUALIZADA);
        empleados.mostrarListado();

        scanner.close();
    }
}