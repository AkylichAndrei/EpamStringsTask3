package stringsTaskTwo;

import java.util.Scanner;


public class TaskOne {
	String str;
	char[] chArray;
	char[] chArray2;
	char[] chArray3;
	int j,counter,counterFinish;
	void search(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length - 1  ; j++){
			        //������� ������
				if(chArray[j] == ' '){
					//��������� ���������� ���������� ��������
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
		System.out.println("���������� ���������� ������ ������ ��������:" + counterFinish);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskOne myTaskOne = new TaskOne();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ : ");
		myTaskOne.str = in.nextLine ();
		in.close();
		myTaskOne.search();
		myTaskOne.outputNewStr();
	}

}
