package stringsTaskTwo;

import java.util.Scanner;

public class TaskNine {
	String str,str2,finishStr;
	char[] chArray;
	int j,i,smallLetters,capitalLetters;
	void search(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length ; j++){
			        //находим одинаковый элемент
				if(((chArray[j] >= 'a')&&(chArray[j] <= 'z'))  ) {
					smallLetters++;
			}
				if(((chArray[j] >= 'A')&&(chArray[j] <= 'Z')) ) {
					capitalLetters++;
				}
			}
			//запихиваем в строку
			str = String.valueOf(chArray);
	}
	void outputNewStr() {
		System.out.println("Маленьких букв : " + smallLetters + " || Больших букв : " + capitalLetters);
	}
	public static void main(String[] args) {
		//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
		// Учитывать только английские буквы.
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку для поиска: ");
		myTaskNine.str = in.nextLine ();
		in.close();
		myTaskNine.search();
		myTaskNine.outputNewStr();
	}

}
