package stringsTaskTwo;
import java.util.Scanner;

public class TaskFive {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			 for( j = 0; j < chArray.length  ; j++) {
				if(chArray[j]=='a'||chArray[j]=='а')
					counter++;
			}
	}
	void outputNewStr() {
		System.out.println("Символ а встречается : " + counter + " раза ");
	}
	public static void main(String[] args) {
		TaskFive myTaskFive = new TaskFive();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		myTaskFive.str = in.nextLine ();
		in.close();
		myTaskFive.search();
		myTaskFive.outputNewStr();
	}
}
