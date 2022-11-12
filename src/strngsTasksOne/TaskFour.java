package strngsTasksOne;
import java.util.Scanner;
public class TaskFour {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
		chArray = str.toCharArray();
		for( j = 0; j < chArray.length ; j++){
			if(Character.isDigit(chArray[j])==true  ){
				counter++;
				while(Character.isDigit(chArray[j])==true && j < chArray.length - 1) 
					j++;
			}	
		}
	}
	void output() {
		System.out.println("количество чисел в строке:" + counter);
	}
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		myTaskFour.str = in.nextLine ();
		in.close();
		myTaskFour.search();
		myTaskFour.output();
	}
}
