package stringsTaskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {
	String str;
	char[] chArray;
	int j,i;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length ; j++)
				for( i = j + 1; i < chArray.length ; i++){
			        //������� ���������� �������
				if(chArray[i] == chArray[j] ){
					//�������� ������ 
					shift();
					//��������� ������ �������
					chArray = Arrays.copyOf(chArray,chArray.length - 1);
					i--;
			        }	
			}
			//���������� � ������
			str = String.valueOf(chArray);
	}
	void shift() {
		for(int j2 = i; j2 < chArray.length - 1  ; j2++) {
			chArray[ j2 ] =  chArray[j2 + 1];
		}
	}
	
	void outputNewStr() {
		System.out.println("���������� ������:" + str);
	}
	public static void main(String[] args) {
		// 7. �������� ������. ��������� ������� �� ��� ������������� ������� � ��� �������. 
		// ��������, ���� ���� ������� "abc cde def", �� ������ ���� �������� "abcdef".
				TaskSeven myTaskSeven = new TaskSeven();
				Scanner in = new Scanner(System.in);
				System.out.println("������� ������ ��� ��������������: ");
				myTaskSeven.str = in.nextLine ();
				in.close();
				myTaskSeven.convert();
				myTaskSeven.outputNewStr();
	}

}
