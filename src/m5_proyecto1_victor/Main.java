package m5_proyecto1_victor;

public class Main {

    public static void main(String[] args) {
        EntradaSalidaDatos esd = new EntradaSalidaDatos();
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
