package m5_proyecto1_victor;

public class Main {

    public static void main(String[] args) {
        EntradaSalidaDatos esd = new EntradaSalidaDatos();
        esd.mostrarCadena("Introduce un número: ");
        int a = esd.introducirValorEnteroPositivo();
        
        if (a % 2 == 0) {
            esd.mostrarCadena(a + " es un número par");
        } else {
            esd.mostrarCadena(a + " es un número impar");
        }
    }

}
