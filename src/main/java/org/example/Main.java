public class Main {
    /**
     * @author Angelo Caballero
     */
    public static void main(String[] args) {
        /**
         * En toda la clase se prueban los metodos creados
         */
        Empleado empleado=new Empleado("Juan Perez", 45, 50000);
        empleado.mostrar();
        Bono bono = new Bono();
        bono.calcularBono(empleado);
        Saludos saludo = new Saludos();
        saludo.imprimirSaludo(empleado);
    }
}