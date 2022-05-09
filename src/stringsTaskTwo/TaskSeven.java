package stringsTaskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {
	String str;
	char[] chArray;
	int j,i;
	void convert(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length ; j++)
				for( i = j + 1; i < chArray.length ; i++){
			        //находим одинаковый элемент
				if(chArray[i] == chArray[j] ){
					//сдвигаем массив 
					shift();
					//уменьшаем длинну массива
					chArray = Arrays.copyOf(chArray,chArray.length - 1);
					i--;
			        }	
			}
			//запихиваем в строку
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = i; j2 < chArray.length - 1  ; j2++) {
			chArray[ j2 ] =  chArray[j2 + 1];
		}
	}
	
	void outputNewStr() {
		System.out.println("Обнавлённая строка:" + str);
	}
	public static void main(String[] args) {
		// 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
		// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
				TaskSeven myTaskSeven = new TaskSeven();
				Scanner in = new Scanner(System.in);
				System.out.println("Введите строку для преобазоования: ");
				myTaskSeven.str = in.nextLine ();
				in.close();
				myTaskSeven.convert();
				myTaskSeven.outputNewStr();
	}

}
