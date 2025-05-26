package m5_proyecto1_victor;

public class Juegos {

    private EntradaSalidaDatos esd;

    public Juegos() {
        esd = new EntradaSalidaDatos();
    }

    public void menu() {
        boolean salir = false;
        do {
            esd.mostrarCadena("MENÚ\n"
                    + "\t1. Diagrama mental\n"
                    + "\t99. Salir\n"
                    + "Introduce una opción: ");
            int opcion = esd.introducirValorEnteroPositivo();
            switch (opcion) {
                case 1:
                    diagramaMental();
                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    esd.mostrarCadena("¡Opción no válida!");
            }
        } while (!salir);
    }
    
    public void diagramaMental() {
        esd.mostrarCadena("Introduce primer número: ");
        int a = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce segundo número: ");
        int b = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce tercer número: ");
        int c = esd.introducirValorEnteroPositivo();

        if (a > b && b > c) {
            esd.mostrarCadena(c + " es mayor que " + a);
            if (a < b) {
                esd.mostrarCadena(a + " es menor que " + b);
            } else {
                esd.mostrarCadena(a + " es mayor que " + b);
            }
        } else {
            esd.mostrarCadena(c + " es menor que " + a);
            if (b < c) {
                esd.mostrarCadena(b + " es menor que " + c);
            } else {
                esd.mostrarCadena(b + " es mayor que " + c);
            }
        }
    }
}
