package it.epicode.be;
import java.lang.Math; 

public class Esercizio4 {

	public static void main(String[] args) {
		System.out.println(perimetroRettangolo(5, 10));
		
		System.out.println(pariDispari(8));
		
		System.out.println(areaTriangolo(5, 7, 6));

	}
	
	
	public static int perimetroRettangolo(int l1 , int l2) {
		int perimetro = (l1+l2)*2;
		return perimetro;
	}
	
	public static int pariDispari(int n) {

		
		 int result = (n%2==0) ? 0 : 1;
		 return result;
		
	}
	
	public static double areaTriangolo(float l1, float l2, float l3) {
		float perimetro = l1 + l2 + l3;
		float semiperimetro = perimetro/2;
		
		float x = semiperimetro - l1;
		float y = semiperimetro - l2;
		float z = semiperimetro - l3;
		
		double risultato = Math.sqrt(semiperimetro * x * y * z);
		return risultato;
	}

}
