package m5_proyecto1_victor;

import java.util.Scanner;

public class EntradaSalidaDatos {
    private final Scanner sc;

    public EntradaSalidaDatos() {
        this.sc = new Scanner(System.in);
    }
    
    public void mostrarCadena(String str) {
        System.out.println(str);
    }
    
    public String introducirCadena() {
        String str = sc.nextLine();
        return str;
    }
    
    public int introducirValorEnteroPositivo() {
        int valor = 0;
        boolean valido = false;
        do {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor < 0) {
                    sc.nextLine();
                    mostrarCadena("¡Tiene que ser un valor positivo!");
                } else {
                    valido = true;
                }
            } else {
                sc.nextLine();
                mostrarCadena("¡Tiene que ser un valor entero!");
            }
        } while (!valido);
        return valor;
    }
}
