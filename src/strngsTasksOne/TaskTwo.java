package strngsTasksOne;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
	String str;
	char[] chArray;
	int j;
	void convert(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length ; j++){
			        //находим слово word
				if(chArray[j] == 'w' && chArray[j + 1] == 'o' && chArray[j + 2] == 'r'
						&& chArray[j + 3] == 'd' ){
					//увеличиваем длинну массива
					chArray = Arrays.copyOf(chArray,chArray.length + 2); 
					//сдвигаем массив (на два увеличили, два раза сдвинули)
					shift();
					shift();
					//меняем на 'letter'
					chArray[j]='l';
					chArray[j + 1]='e';
					chArray[j + 2]='t';
					chArray[j + 3]='t';
					chArray[j + 4]='e';
					chArray[j + 5]='r';
			        }	
			}
			//запихиваем в строку
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
