package lolo;
import java.util.Scanner;
public class algo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int num;
int i;
int j;
int k;
System.out.println("Ingrese un numero");
num=sc.nextInt();
for (i=num;i<8;i++) {
	System.out.println(i);
}
System.out.println("Ingrese otro numero");
num=sc.nextInt();
for (j=num;j<10;j++){
	num= num*i;
	System.out.println(j);
}
System.out.println("Ingrese otro numero");
num=sc.nextInt();
for(k=num;k<10;k++){
	num=k/2;
	System.out.println("Los pares son: " + k);
	k++;
}
	}
	}

