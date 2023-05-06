import java.util.Scanner;

/**
 *
 * @author Miguel Alejandro Torruco
 */
public class OdioLaVida2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("¿Cómo te sientes hoy, joder?");
        String estado = scan.nextLine();
        
        boolean odiaLaVida = false;
        
        if (estado.equalsIgnoreCase("bien, bien")) {
            System.out.println("Bien, entonces no odias la vida");
        }
        else if (estado.equalsIgnoreCase("triste como la mierda")) {
            System.out.println("That's exactly what I wanted to hear");
            odiaLaVida = true;
        } 
        else {
            System.out.println("Bueno..., cada quién");
        }
        
        System.out.println("Introduce tu estado de ánimo del 1-10, donde 10 es 'bien, bien'");
        int escala = scan.nextInt();
        
        while (escala < 1 || escala > 10) {
            System.out.println("Introduce el forro bien");
            escala = scan.nextInt();
        }
        
        if (odiaLaVida && escala <= 5) {
            System.out.println("No te desanimes, mañana ni lo recordarás");
        }
            
    }
}