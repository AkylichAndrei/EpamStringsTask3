package stringsTaskTwo;

import java.util.Scanner;

public class TaskNine {
	String str,str2,finishStr;
	char[] chArray;
	int j,i,smallLetters,capitalLetters;
	void search(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length ; j++){
			        //������� ���������� �������
				if(((chArray[j] >= 'a')&&(chArray[j] <= 'z'))  ) {
					smallLetters++;
			}
				if(((chArray[j] >= 'A')&&(chArray[j] <= 'Z')) ) {
					capitalLetters++;
				}
			}
			//���������� � ������
			str = String.valueOf(chArray);
	}
	void outputNewStr() {
		System.out.println("��������� ���� : " + smallLetters + " || ������� ���� : " + capitalLetters);
	}
	public static void main(String[] args) {
		//��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������.
		// ��������� ������ ���������� �����.
		TaskNine myTaskNine = new TaskNine();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ��� ������: ");
		myTaskNine.str = in.nextLine ();
		in.close();
		myTaskNine.search();
		myTaskNine.outputNewStr();
	}

}
