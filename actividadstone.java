package defecto;
import java.util.Scanner;
public class Class {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);	
	String salida = "";
		Scanner sc = new Scanner(System.in);
	 System.out.print("Ingrese su nombre: "); // Muestra mensaje para pedir el nombre
	 String Jugador = teclado.nextLine();
	
	 System.out.println("Cuantos pedazos de piedra ust tiene?");
	 int piedras = teclado.nextInt();
	
	 System.out.println("Cuantos pedazos de madera ust tiene?");
	 int madera = teclado.nextInt();
	
	 System.out.println("Cuantos pedazos de cuerda ust tiene?");
	 int cuerdas = teclado.nextInt();
	
	
while (piedras > 0 && madera> 0 && cuerdas > 0) {
	
	 System.out.println("Ahora, en funcion a sus recursos, elija entre las siguientes opciones, que tipo de herramienta quiere craftear.\nOpcion 1: En este caso, la opcion se refiere a el crafteo de una espada. Se necesitan 2 piedras, 1 madera y 1 cuerda.\nOpcion 2: En este caso, la opcion se refiere a el crafteo de un pico. Se necesitan 2 maderas, 1 cuerda y 2 piedras.\nOpcion 3: En este caso, la opcion se refiere a el crafteo de un hacha. Se necesitan 3 piedras, 2 maderas y 2 cuerdas.");
	 String opcion = sc.nextLine();
	
	 switch (opcion) {
	
	 case "1":
		 System.out.println("Eligio espada, tiene los recursos? 2 piedras, 1 de madera y 1 cuerda");
		 if (piedras >= 2 && madera >= 1 && cuerdas>= 1) {
		 System.out.println("Espada pudo ser crafted");
		 
		 piedras = piedras-2;
		 madera = madera-1;
		 cuerdas = cuerdas-1;
		
		 System.out.println("Te quedaron estos recursos para gastar:\nPiedras:"+piedras+"\nMadera:"+madera+"\ncuerdas"+cuerdas);
		
		 }
		 else{
			 System.out.println("No se crafteo, elija de nuevo");

		 }
		 break;
		
	case "2":
			 System.out.println("Eligio el pico, tiene los recursos, 2 piedras, 2 de madera y 1 cuerda");
			 if (piedras >= 2 && madera >= 2 && cuerdas>= 1) {
			 System.out.println("Pico pudo ser crafted");
			
			 piedras = piedras-2;
			 madera = madera-2;
			 cuerdas = cuerdas-1;
			
			 System.out.println("Te quedaron estos recursos para gastar:\nPiedras:"+piedras+"\nMadera:"+madera+"\ncuerdas"+cuerdas);
			
			 }
			 else{
				 System.out.println("No se crafteo, elija de nuevo");
				
			 }
			  break;
	case "3":
		 System.out.println("Eligio hacha, tiene los recursos, 3 piedras, 2 de madera y 2 cuerdas");
		 if (piedras >= 3 && madera >= 2 && cuerdas>= 2) {
		 System.out.println("Hacha  pudo ser crafted");
		
		 piedras = piedras-3;
		 madera = madera-2;
		 cuerdas = cuerdas-2;
		
		 System.out.println("Te quedaron estos recursos para gastar:\nPiedras:"+piedras+"\nMadera:"+madera+"\ncuerdas"+cuerdas);
		
		 }
		 else{
			 System.out.println("No se crafteo, elija de nuevo");
			 
			 }
		break;// del case	
		 }

		
		
	
	
	
	 }
	
}}
