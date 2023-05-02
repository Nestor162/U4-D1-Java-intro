package it.epicode.be;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		System.out.println("Enter your name");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		strArray[0] = name;
		
		System.out.println("Enter your surname");
		String surname = in.nextLine();
		strArray[1] = surname;
		
		System.out.println("Enter your city's name");
		String city = in.nextLine();
		strArray[2] = city;
		
		
		in.close();
		System.out.println("Ordine di inserimento: " + Arrays.toString(strArray));
		
		Collections.reverse(Arrays.asList(strArray));
		System.out.println("Ordine inverso: " + Arrays.toString(strArray));

	}

}
