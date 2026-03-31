

package actividad4;
import java.util.Scanner;
public class trabajo4 {
	public static void main(String[]into) {
		System.out.print("Ingrese su nombre ");	
		Scanner valor=new Scanner(System.in);
		String nombre=valor.next();
		System.out.println("Bienvenido:" + nombre);
		Scanner dato=new Scanner (System.in);
		System.out.println("ingrese un valor");
		float valor1=dato.nextInt();
		System.out.println("ingrese operación +,-,*,/");
		String operacion=dato.next();
		System.out.println("otro valor");
		float valor2=dato.nextInt();
		float resultado=0;
		if (operacion.equals("/")) {
		    if (valor2 == 0) {
		        System.out.println("Error: No se puede dividir entre cero.");
		    } else {
		        resultado = valor1 / valor2;
		        System.out.println("El resultado es " + resultado + " gracias por usar nuestra calculadora, tenga un buen día");
		    }
		}
		
		if (operacion.equals("+")) {
				resultado=valor1 + valor2;
				System.out.println("El resultado es "+ resultado + " gracias por usar nuestra calculadora, tengaun buen dia");
			}
		
		 if (operacion.equals("-")) {
				resultado=valor1 - valor2;
				System.out.println("El resultado es "+ resultado + " gracias por usar nuestra calculadora, tengaun buen dia");
			}
		
		 if (operacion.equals("*")) {
				resultado=valor1 * valor2;
				System.out.println("El resultado es "+ resultado + " gracias por usar nuestra calculadora, tengaun buen dia");
			}
	
		
				}
			
					
	
				
			
			
		}
	
		
	
	

