import java.util.Scanner;
public class mibombo2 {
	public mibombo2() {
	
	}
	public static void main(String[] pikachu) {
		Scanner dato2 = new Scanner(System.in);
		System.out.println("ingrese una opción ");
		int opcion=dato2.nextInt();
		if (opcion==1) {
		System.out.println("Seleccionaste opcion 1");
			
		}else if(opcion<1){
			System.out.println("Ingreso erroneo");
		}
		if (opcion==2) {
			System.out.println("Seleccionaste opcion 2");
				
			}
		if (opcion==3) {
			System.out.println("Seleccionaste opcion 3");
		
			}else if(opcion>3){
				System.out.println("Ingreso erroneo");
				
		
			}
			
	}
}

