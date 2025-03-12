class Bono {

    public void calcularBono(Empleado empleadoEj) {
        double bono = 0;

        if (empleadoEj.getEdad() > 50) {
            bono = empleadoEj.getSalario() * 0.10;
        } else {
            bono = empleadoEj.getSalario() * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
