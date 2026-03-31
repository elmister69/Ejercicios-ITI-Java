import java.util.Scanner;

public class BrawlStarsSimulador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear brawlers
        Brawler shelly = new Brawler("Shelly", 3600, 500);
        Brawler colt = new Brawler("Colt", 2800, 600);
        Brawler bull = new Brawler("Bull", 5000, 400);

        // Mostrar opciones
        System.out.println("Elige tu brawler:");
        System.out.println("1. " + shelly.nombre);
        System.out.println("2. " + colt.nombre);
        System.out.println("3. " + bull.nombre);
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        Brawler elegido;
        switch (opcion) {
            case 1: elegido = shelly; break;
            case 2: elegido = colt; break;
            case 3: elegido = bull; break;
            default: elegido = shelly; System.out.println("Opción inválida, se seleccionó Shelly.");
        }

        // Mostrar estadísticas
        System.out.println("\nHas elegido a " + elegido.nombre);
        System.out.println("Vida: " + elegido.vida);
        System.out.println("Daño: " + elegido.danio);

        // Simular batalla
        System.out.println("\n¡Batalla contra un enemigo!");
        int vidaEnemigo = 3000;
        while (vidaEnemigo > 0) {
            vidaEnemigo -= elegido.danio;
            System.out.println("Atacaste al enemigo. Vida restante del enemigo: " + Math.max(vidaEnemigo, 0));
        }

        System.out.println("¡Ganaste la batalla!");
        sc.close();
    }
}

// Clase Brawler
class Brawler {
    String nombre;
    int vida;
    int danio;

    public Brawler(String nombre, int vida, int danio) {
        this.nombre = nombre;
        this.vida = vida;
        this.danio = danio;
    }
}

