package stringsTaskTwo;

import java.util.Scanner;


public class TaskOne {
	String str;
	char[] chArray;
	char[] chArray2;
	char[] chArray3;
	int j,counter,counterFinish;
	void search(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			for( j = 0; j < chArray.length - 1  ; j++){
			        //находим пробел
				if(chArray[j] == ' '){
					//—читываем наибольшее количество пробелов
					counter();    
			}
			if(counter>counterFinish)
				counterFinish=counter;
			counter=0;
			}
	}
	void counter() {
		 while(chArray[j] == ' ' && j < chArray.length - 1 ) {
		  counter++;
		  j++;
		 }
	}
	void outputNewStr() {
		System.out.println("Ќаибольшее количество подр€д идущих пробелов:" + counterFinish);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskOne myTaskOne = new TaskOne();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку : ");
		myTaskOne.str = in.nextLine ();
		in.close();
		myTaskOne.search();
		myTaskOne.outputNewStr();
	}

}
