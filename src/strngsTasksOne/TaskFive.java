package strngsTasksOne;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
	String str;
	char[] chArray;
	int j;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length - 1 ; j++){
			        //������� ����� word
				if(chArray[j] == ' ' && chArray[j + 1] == ' ' ){
					//�������� ������ 
					shift();
					//��������� ������ �������
					chArray = Arrays.copyOf(chArray,chArray.length - 1);
					j--;
			        }	
			}
			j=chArray.length - 1;
			while(chArray[j]==' ') {
				//��������� ������ �������
				chArray = Arrays.copyOf(chArray,chArray.length - 1);
				j--;
			}
			//���������� � ������
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = j + 1; j2 < chArray.length - 1  ; j2++) {
			chArray[ j2 ] =  chArray[j2 + 1];
		}
	}
	void outputNewStr() {
		System.out.println("���������� �����:" + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		TaskFive myTaskFive = new TaskFive();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ : ");
		myTaskFive.str = in.nextLine ();
		in.close();
		myTaskFive.convert();
		myTaskFive.outputNewStr();
	}

}
