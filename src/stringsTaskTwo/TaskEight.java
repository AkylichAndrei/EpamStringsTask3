package stringsTaskTwo;

import java.util.Scanner;

public class TaskEight {
	String str,str2,finishStr;
	char[] chArray;
	int j,i,lengthFinish,length,startStr;
	void convert(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length ; j++){
			        //находим одинаковый элемент
				if(chArray[j] != ' ' ) {
					i=j;
					length=0;
					startStr = j;
					while(chArray[i] != ' '&& i < chArray.length - 1) {
						i++;
						length++;
					}	     
					if(length>lengthFinish) {
						finishStr="";
						lengthFinish=length;
						for(j = startStr; j < i + 1 ; j++) {
							str2 = String.valueOf(chArray[ j ]);
							finishStr = finishStr + str2;
						}
						j = i;
					}
			}
			}
			//запихиваем в строку
			str = String.valueOf(chArray);
	}
	
	void outputNewStr() {
		System.out.println("Самое длинное слово : " + finishStr + " его длинна : " + lengthFinish);
	}
	public static void main(String[] args) {
		// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
		//Случай, когда самых длинных слов может быть несколько, не обрабатывать.
		//Привет Андрей! как поспал браток Братишка!
		TaskEight myTaskEight = new TaskEight();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку для преобазоования: ");
		myTaskEight.str = in.nextLine ();
		in.close();
		myTaskEight.convert();
		myTaskEight.outputNewStr();
	}

}
