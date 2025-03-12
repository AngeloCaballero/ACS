class Saludos {
    void imprimirSaludo(Empleado empleadoEj) {
        if (empleadoEj.getEdad() < 18) {
            System.out.println("Hola, joven " + empleadoEj.getNombre());
        } else {
            System.out.println("Hola, señor/a " + empleadoEj.getNombre());
        }
    }
}
