package repeticion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class gogo{
   public static void main(String[] args) {
   	Scanner sc = new Scanner(System.in);
   	
   	        System.out.print("¿Cuántos corazones tiene Link?: ");
   	        int cant = sc.nextInt();
   	        boolean[] corazones = new boolean[cant];
   	        Arrays.fill(corazones, true);
   	        System.out.print("¿Cuántos golpes recibió?: ");
   	        int golpes = sc.nextInt();
   	        for (int i = 0; i < golpes && i < cant; i++) {
   	            corazones[i] = false;
   	        }
   	        ArrayList<Integer> pociones = new ArrayList<>();
   	        System.out.print("¿Cuántas pociones tiene?: ");
   	        int n = sc.nextInt();
   	        for (int i = 0; i < n; i++) {
   	            System.out.print("Ingrese valor de curación de la poción " + (i+1) + ": ");
   	            pociones.add(sc.nextInt());
   	        }
   	        // sumatoria de curación
   	        int totalCura = 0;
   	        for (int p : pociones) {
   	            totalCura += p;
   	        }
   	        System.out.println("Curación total posible: " + totalCura);
   	        // usar una poción
   	        if (!pociones.isEmpty()) {
   	            int cura = pociones.remove(0);
   	            boolean curado = false;
   	            for (int i = 0; i < corazones.length && cura > 0; i++) {
   	                if (!corazones[i]) {
   	                    corazones[i] = true;
   	                    cura--;
   	                    curado = true;
   	                }
   	            }
   	            if (!curado) {
   	                System.out.println("La poción no tuvo efecto.");
   	            }
   	        }
   	        // mostrar corazones finales
   	        System.out.println("\nCorazones al final:");
   	        for (int i = 0; i < corazones.length; i++) {
   	            System.out.println("Corazón " + (i+1) + ": " + (corazones[i] ? "♥" : "X"));
   	        }
   	    }
   	}

