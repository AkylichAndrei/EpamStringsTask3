package stringsTaskTwo;
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
			        //находим букву a
				if(chArray[j] == 'a' ){
					//увеличиваем длинну массива
					chArray = Arrays.copyOf(chArray,chArray.length + 1); 
					//сдвигаем массив 
					shift();
					//меняем 
					chArray[j + 1]='b';
			        }	
			}
			//запихиваем в строку
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = chArray.length - 1; j2 >= j + 1  ; j2--) {
			chArray[ j2 ] =  chArray[j2 - 1];
		}
	}
	void outputNewStr() {
		System.out.println("Обнавлённая строка:" + str);
	}
	public static void main(String[] args) {
		// 2. В строке вставить после каждого символа 'a' символ 'b'.
		TaskTwo myTaskTwo = new TaskTwo();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку для преобазоования: ");
		myTaskTwo.str = in.nextLine ();
		in.close();
		myTaskTwo.convert();
		myTaskTwo.outputNewStr();
	}
}
