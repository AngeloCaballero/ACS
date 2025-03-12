/**
 * clase para el metodo imprimirSaludo
 */
class Saludos {
    /**
     * metodo para dar un saludo u otro al empleado en funcion de su edad
     */
    void imprimirSaludo(Empleado empleadoEj) {
        if (empleadoEj.getEdad() < 18) {
            System.out.println("Hola, joven " + empleadoEj.getNombre());
        } else {
            System.out.println("Hola, señor/a " + empleadoEj.getNombre());
        }
    }
}
