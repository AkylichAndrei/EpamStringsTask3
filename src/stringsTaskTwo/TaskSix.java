package stringsTaskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
	String str;
	char[] chArray;
	int j;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length ; j++){
			        //������� �� ������ �������
				if(chArray[j] != ' ' ){
					//����������� ������ �������
					chArray = Arrays.copyOf(chArray,chArray.length + 1); 
					//�������� ������ 
					shift();
					//������ 
					chArray[j + 1]=chArray[j];
					j++;
			        }	
			}
			//���������� � ������
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = chArray.length - 1; j2 >= j + 1  ; j2--) {
			chArray[ j2 ] =  chArray[j2 - 1];
		}
	}
	void outputNewStr() {
		System.out.println("���������� ������:" + str);
	}
	public static void main(String[] args) {
		// 6. �� �������� ������ �������� �����, �������� ������ ������ ������.
		TaskSix myTaskSix = new TaskSix();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ��� ��������������: ");
		myTaskSix.str = in.nextLine ();
		in.close();
		myTaskSix.convert();
		myTaskSix.outputNewStr();
	}

}
