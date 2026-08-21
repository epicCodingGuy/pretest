package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		String input = "";
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		input = console.nextLine();
		int result = countVowelSequences(input);
        System.out.println(result);
		
		
		
				

	}
	public static int countVowelSequences(String str) {
		int index = 0;
		int vCount = 0;
		int adjVowel = 0;
		while(index < str.length()) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'A' || 
				    str.charAt(index) == 'e' || str.charAt(index) == 'E' || 
				    str.charAt(index) == 'i' || str.charAt(index) == 'I' || 
				    str.charAt(index) == 'o' || str.charAt(index) == 'O' || 
				    str.charAt(index) == 'u' || str.charAt(index) == 'U')  
				vCount += 1;
				else {
					vCount = 0;
			
				}
				
				if (vCount == 2) {
					adjVowel += 1;
					vCount = 0;
				}
			index +=1;
					
			
		}
		return adjVowel;
	}

}
