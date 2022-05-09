package strngsTasksOne;
import java.util.Scanner;

public class TaskThree {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
			 chArray = str.toCharArray();//преобразовываем строку в массив
			for( j = 0; j < chArray.length ; j++){//перебираем все элементы массива
				if(Character.isDigit(chArray[j])==true  ){//находим цифры
					counter++;//cчЄтчик
			        }	
			}
	}
	void output() {
		System.out.println("количество цифр в строке:" + counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку: ");
		myTaskThree.str = in.nextLine ();
		in.close();
		myTaskThree.search();
		myTaskThree.output();
	}

}
