package strngsTasksOne;

import java.util.Scanner;

public class TaskThree {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length ; j++){
			        //находим цифры
				if(Character.isDigit(chArray[j])==true  ){
					//чётчик
					counter++;
			        }	
			}
	}
	void output() {
		System.out.println("количество цифр в строке:" + counter);
	}
	public static void main(String[] args) {
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		myTaskThree.str = in.nextLine ();
		in.close();
		myTaskThree.search();
		myTaskThree.output();
	}
}
