package ProyectoED;
/**
 * clase para crear instancias de los emplados con sus nombres, edad y salarioo
 */
class Empleado {
    /**
     * parametros del empleado
     */
    private String nombre;
    private int edad;
    private double salario;
    /**
     * @param nombre string que espera el nombre del empleado
     * @param edad int que espera la edad del empleado
     * @param salario double que espera el salario del empleado
     */
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    /**
     * getters de los parametros del empleado
     */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }
    /**
     * metodo para mostrar los paramentros del empleado
     */
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
