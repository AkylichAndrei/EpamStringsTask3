package stringsTaskTwo;

import java.util.Arrays;
import java.util.Scanner;


public class TaskTwo {
	String str;
	char[] chArray;
	int j;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length ; j++){
			        //������� ����� a
				if(chArray[j] == 'a' ){
					//����������� ������ �������
					chArray = Arrays.copyOf(chArray,chArray.length + 1); 
					//�������� ������ 
					shift();
					//������ 
					chArray[j + 1]='b';
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
		// 2. � ������ �������� ����� ������� ������� 'a' ������ 'b'.
		TaskTwo myTaskTwo = new TaskTwo();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ��� ��������������: ");
		myTaskTwo.str = in.nextLine ();
		in.close();
		myTaskTwo.convert();
		myTaskTwo.outputNewStr();
	}

}
