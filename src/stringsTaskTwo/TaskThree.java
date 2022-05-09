package stringsTaskTwo;

import java.util.Scanner;

public class TaskThree {
	String str,answer;
	char[] chArray;
	int j;
	boolean flag;
	void convert(){
			//преобразовываем строку в массив
			 chArray = str.toCharArray();
			 answer=" да! ";
			 j=0;
			//перебираем все элементы массива
			while(j <= ((chArray.length - 1) /2)&&flag!=true) {
				check();
				j++;
			}
	}
	void check() {
		if(chArray[ j ] !=  chArray[chArray.length - j - 1 ])
		{
			flag=true;
			answer=" нет! ";
			
		}
		
	}
	void outputNewStr() {
		System.out.println("явл€етс€ ли введЄнное слово полиндромом? :" + answer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите строку дл€ преобазоовани€: ");
		myTaskThree.str = in.nextLine ();
		in.close();
		myTaskThree.convert();
		myTaskThree.outputNewStr();
	}

}
