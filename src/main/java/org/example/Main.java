public class Main {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("Juan Perez", 45, 50000);
        empleado.mostrar();
        Bono bono = new Bono();
        bono.calcularBono(empleado);
        Saludos saludo = new Saludos();
        saludo.imprimirSaludo(empleado);
    }
}