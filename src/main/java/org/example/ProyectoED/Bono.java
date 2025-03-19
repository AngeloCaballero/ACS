package ProyectoED;
/**
 * clase para el metodo calcularBono
 */
class Bono {
    /**
     * metodo para dar un bono u otro al empleado en funcion de su edad
     */
    public void calcularBono(Empleado empleadoEj) {
        double bono;

        if (empleadoEj.getEdad() > 50) {
            bono = empleadoEj.getSalario() * 0.10;
        } else {
            bono = empleadoEj.getSalario() * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
