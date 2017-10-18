package note;

import java.util.ArrayList;

public class Exam {
	String a;
	private int[][] row;
	
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
	
	//2017/10/18
	//n^3 algorithm: O(n^3);
	public boolean checkRows() {
		for(int i = 0; i < 9; i++) { // for every row
			for(int j = 0; i < 9; j++) {
				boolean found = false;
				for(int k = 0; k < 9; k++) { //for every column
					if(this.row[i][k] == j) {
						found = true;
						break;
					}
				}
				if(!found) return false; 
			}
		}
		return true;
	}
	
	public boolean checkCols() {
		
		for(int i = 0; i < 9; i++) { // for every column
			for(int j = 0; i < 9; j++) {
				boolean found = false;
				for(int k = 0; k < 9; k++) { // for every row
					if(this.row[k][i] == j) {
						found = true;
						break;
					}
				}
				if(!found) return false; 
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
			String x = "racecar";
			String y = "heyyou";
			System.out.println(Exam.isPalindrome(x));		
			System.out.println(Exam.isPalindrome(y));
			System.out.println(Exam.firstChars("Hello cool dog"));
	}
}
	
	
	

