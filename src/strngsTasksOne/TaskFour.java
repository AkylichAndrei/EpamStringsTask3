package strngsTasksOne;

import java.util.Scanner;

public class TaskFour {
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
					//чЄтчик
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
		// TODO Auto-generated method stub
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку: ");
		myTaskFour.str = in.nextLine ();
		in.close();
		myTaskFour.search();
		myTaskFour.output();
	}

}
