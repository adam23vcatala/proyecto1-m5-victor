package m5_proyecto1_victor;

public class Calculadora {

    private EntradaSalidaDatos esd;
    
    public Calculadora() {
        esd = new EntradaSalidaDatos();
    }
    
    public void menu() {
        boolean salir = false;
        do {
            esd.mostrarCadena("MENÚ\n"
                    + "\t1. Sumar\n"
                    + "\t2. Restar\n"
                    + "\t3. Multiplicar\n"
                    + "\t4. Dividir\n"
                    + "\t5. Raíz cuadrada\n"
                    + "\t6. Factorial\n"
                    + "\t99. Salir\n"
                    + "Introduce una opción: ");
            int opcion = esd.introducirValorEnteroPositivo();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    raizCuadrada();
                    break;
                case 6:
                    factorial();
                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    esd.mostrarCadena("¡Opción no válida!");
            }
        } while (!salir);
    }
    
    private void sumar() {
        esd.mostrarCadena("Introduce el primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce el segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    
    private void restar() {
        esd.mostrarCadena("Introduce el primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce el segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    
    private void multiplicar() {
        esd.mostrarCadena("Introduce el primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce el segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    
    private void dividir() {
        esd.mostrarCadena("Introduce el primer número: ");
        int num1 = esd.introducirValorEnteroPositivo();
        esd.mostrarCadena("Introduce el segundo número: ");
        int num2 = esd.introducirValorEnteroPositivo();
        if (num2 == 0) {
            esd.mostrarCadena("¡No se puede dividir entre cero!");
        } else {
            esd.mostrarCadena(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    private void raizCuadrada() {
        esd.mostrarCadena("Introduce un número: ");
        int num = esd.introducirValorEnteroPositivo();
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
    }

    private void factorial() {
        esd.mostrarCadena("Introduce un número: ");
        int num = esd.introducirValorEnteroPositivo();
        long resultado = 1L;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        esd.mostrarCadena("Factorial de " + num + ": " + resultado);
    }
}
