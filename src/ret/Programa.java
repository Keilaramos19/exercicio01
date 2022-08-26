package ret;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		Retangulo ret1= new Retangulo();
		
		System.out.println("Informe a altura:");
		ret1.altura=sc.nextDouble();
		
		System.out.println("Informe a largura:");
		ret1.largura=sc.nextDouble();
		
		
		System.out.printf("Retangulo é:%.2f\n",ret1.areaRet());
		System.out.printf("Perimetro é:%.2f\n",ret1.perimetroRet());
		System.out.printf("Diagonal é:%.2f",ret1.diagonalRet());
		sc.close();
	}

}
