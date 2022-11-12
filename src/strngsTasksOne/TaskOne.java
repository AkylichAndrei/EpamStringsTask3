package strngsTasksOne;
import java.util.Arrays;
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
			char[] chArray = str.toCharArray();
			char temp;
			for(int j = 0; j < chArray.length ; j++){
				if(chArray[j] == Character.toUpperCase(chArray[j])  ){
					chArray = Arrays.copyOf(chArray,chArray.length + 1); 
					temp = chArray[j];
					chArray[j] = '_';
					for(int j2 = chArray.length - 1; j2 > j + 1; j2--) {
						chArray[ j2 ] =  chArray[j2 - 1];
					}
			        temp  += 32;
					chArray[ j + 1 ] = temp;
			        }	
			}
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
