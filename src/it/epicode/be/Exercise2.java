package it.epicode.be;
import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		
		System.out.println(multiplication(5, 8)); 
		
		System.out.println(concat("Hello", 50));
		
		String[] myArray = {"uno", "due", "tre", "quattro", "cinque"};
		
		String[] newArray = insertArray(myArray, "sei");
		System.out.println(Arrays.toString(newArray));

	}
	
		// Moltiplica
		public static int multiplication(int a, int b) 
		{
			return a * b;
		}
		
		// Concatena
		public static String concat(String str, int integer) {
			return str + integer;
		}
		
		// InserisciInArray
		public static String[] insertArray(String[] elementsArray, String word) {
			String[] newArray = new String [6];
			
		
			for (int i = 0; i < newArray.length; i++) {
				if(i<2) {
					newArray[i] = elementsArray[i];
				} else if (i==2) {
					newArray[i] = word;
				} else {
					newArray[i] = elementsArray[i-1];
				}
				
			}
			
//			 newArray[0] = elementsArray[0];
//			 newArray[1] = elementsArray[1];
//			  
//			 newArray[2] = word;
//			
//			 newArray[3] = elementsArray[2];
//			 newArray[4] = elementsArray[3];
//			 newArray[5] = elementsArray[4];

			return newArray;
		}


}
