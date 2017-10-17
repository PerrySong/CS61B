package note;

import java.util.ArrayList;

public class Exam {
	String a;
	
	public Exam() {
		
	}
	public String areturn(){
		return a;
	}
	
	public static void add1(String a) {
		a = "Hey";
	}
	
	public void absoluteValues(int[] numbers) {

		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				numbers[i] = numbers[i] * -1;
			}
		}
	}
	
	public static boolean isPalindrome(String word){

		for(int i = 0; i < word.length() / 2; i++) {
			
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
				return false;
			}
		}
		return true;
	} 

	public static String firstChars(String sentance) {
		String[] words = sentance.split("\\s+");
		String result = "";
		for(String word: words) {
			result = result + word.charAt(0);
		}
		return result;
	}
	
	public static void main(String[] args) {
			String x = "racecar";
			String y = "heyyou";
			System.out.println(Exam.isPalindrome(x));		
			System.out.println(Exam.isPalindrome(y));
			System.out.println(Exam.firstChars("Hello cool dog"));
	}
}
	
	
	

