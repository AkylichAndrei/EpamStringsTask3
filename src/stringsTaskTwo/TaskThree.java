package stringsTaskTwo;

import java.util.Scanner;

public class TaskThree {
	String str,answer;
	char[] chArray;
	int j;
	boolean flag;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			 answer=" ��! ";
			 j=0;
			//���������� ��� �������� �������
			while(j <= ((chArray.length - 1) /2)&&flag!=true) {
				check();
				j++;
			}
	}
	void check() {
		if(chArray[ j ] !=  chArray[chArray.length - j - 1 ])
		{
			flag=true;
			answer=" ���! ";
			
		}
		
	}
	void outputNewStr() {
		System.out.println("�������� �� �������� ����� �����������? :" + answer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ��� ��������������: ");
		myTaskThree.str = in.nextLine ();
		in.close();
		myTaskThree.convert();
		myTaskThree.outputNewStr();
	}

}
