package strngsTasksOne;

import java.util.Arrays;

//import java.util.Scanner;

public class TaskOne {
	String[] camelCase  = new String[4];
	String[] snake_case  = new String[4];
	
	int n;
	void inputCamelCase()
	{
		camelCase[0] = "zeroZero"; 
		camelCase[1] = "oneOneOne"; 
		camelCase[2] = "twoTwo"; 
		camelCase[3] = "threeThree";
	}
	void convert(){
		for (int i = 0; i < 4; i++) {
			
			String str = camelCase[i];
			//преобразовываем строку в массив
			char[] chArray = str.toCharArray();
			//перебираем все элементы массива
			char temp;
			for(int j = 0; j < chArray.length ; j++){
			        //находим верхний регистр
				if(chArray[j] == Character.toUpperCase(chArray[j])  ){
					//увеличиваем длинну массива
					chArray = Arrays.copyOf(chArray,chArray.length + 1); 
					temp = chArray[j];
					chArray[j] = '_';
					//сдвигаем массивы на один 
					for(int j2 = chArray.length - 1; j2 > j + 1; j2--) {
						chArray[ j2 ] =  chArray[j2 - 1];
					}
			        temp  += 32;
					chArray[ j + 1 ] = temp;
			        }	
			}
			//запихиваем в новый массив
			snake_case[i] = String.valueOf(chArray);
		}
		System.out.println("Значение переменных в массиве camel case:");
		for (int i = 0; i < 4; i++) {
			System.out.println(camelCase[i]);
		}
	}
	void outputSnake_case() {
		System.out.println("Значение переменных в массиве snake case:");
		for (int i = 0; i < 4; i++) {
			System.out.println(snake_case[i]);
			}
	}
	public static void main(String[] args) {
		TaskOne myTaskOne = new TaskOne();
		myTaskOne.inputCamelCase();
		myTaskOne.convert();
		myTaskOne.outputSnake_case();
		
		
	}

}
