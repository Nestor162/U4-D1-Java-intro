package it.epicode.be;

public class Esercizio4 {

	public static void main(String[] args) {
		System.out.println(perimetroRettangolo(5, 10));
		
		System.out.println(pariDispari(8));

	}
	
	public static int perimetroRettangolo(int l1 , int l2) {
		int perimetro = (l1+l2)*2;
		return perimetro;
	}
	
	public static int pariDispari(int n) {
		if (n%2==0) {
			return 0;
		} else {
			return 1;
		}
	}

}
