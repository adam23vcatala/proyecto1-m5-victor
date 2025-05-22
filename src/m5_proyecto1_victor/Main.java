package m5_proyecto1_victor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String msg = "¿Hola, que tal?";
        
        for (int i = 0; i <= msg.length(); i++) {
            System.out.println(msg.substring(0, i));
            Thread.sleep(800);
        }
    }
    
}
