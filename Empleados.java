/**
 * Clase que gestiona el listado de empleados y sus operaciones.
 */
public class Empleados {
    /**
     * Array que almacena la lista de empleados.
     */
    public Empleado[] lista;
    
    private int contador;

    /**
     * Constructor de la clase Empleados.
     * @param capacidad Número máximo de empleados que puede almacenar.
     */
    public Empleados(int capacidad) {
        lista = new Empleado[capacidad];
        contador = 0;
    }

    /**
     * Añade un empleado a la lista si hay espacio disponible.
     * @param empleado Objeto empleado a añadir.
     */
    public void darAltaEmpleado(Empleado empleado) {
        if (contador < lista.length) {
            lista[contador] = empleado;
            contador++;
        } else {
            System.out.println(Mensajes.NO_MAS_EMPLEADOS);
        }
    }

    /**
     * Incrementa el salario de todos los empleados en la lista por el porcentaje indicado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    /**
     * Muestra el listado de empleados en la consola.
     */
    public void mostrarListado() {
        System.out.println(Mensajes.LISTA_INICIAL);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }
}