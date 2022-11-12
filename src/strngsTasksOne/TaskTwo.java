package strngsTasksOne;
import java.util.Arrays;
import java.util.Scanner;
public class TaskTwo {
	String str;
	char[] chArray;
	int j;
	void convert(){
			chArray = str.toCharArray();
			for( j = 0; j < chArray.length ; j++){
				if(chArray[j] == 'w' && chArray[j + 1] == 'o' && chArray[j + 2] == 'r'
						&& chArray[j + 3] == 'd' ){
					chArray = Arrays.copyOf(chArray,chArray.length + 2); 
					shift();
					shift();
					chArray[j]='l';
					chArray[j + 1]='e';
					chArray[j + 2]='t';
					chArray[j + 3]='t';
					chArray[j + 4]='e';
					chArray[j + 5]='r';
			        }	
			}
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = chArray.length - 1; j2 >= j  ; j2--) {
			chArray[ j2 ] =  chArray[j2 - 1];
		}
	}
	void outputNewStr() {
		System.out.println("Обнавлённая трока:" + str);
	}
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку для преобазоования: ");
		myTaskTwo.str = in.nextLine ();
		in.close();
		myTaskTwo.convert();
		myTaskTwo.outputNewStr();
	}
}
