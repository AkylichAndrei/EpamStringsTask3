package stringsTaskTwo;

import java.util.Scanner;

public class TaskFive {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			 for( j = 0; j < chArray.length  ; j++) {
				if(chArray[j]=='a'||chArray[j]=='�')
					counter++;
			}
	}
	
	void outputNewStr() {
		System.out.println("������ � ����������� : " + counter + " ���� ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskFive myTaskFive = new TaskFive();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������: ");
		myTaskFive.str = in.nextLine ();
		in.close();
		myTaskFive.search();
		myTaskFive.outputNewStr();
	}

}
