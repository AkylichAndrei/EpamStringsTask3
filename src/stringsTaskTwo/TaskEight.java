package stringsTaskTwo;

import java.util.Scanner;

public class TaskEight {
	String str,str2,finishStr;
	char[] chArray;
	int j,i,lengthFinish,length,startStr;
	void convert(){
			//��������������� ������ � ������
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			for( j = 0; j < chArray.length ; j++){
			        //������� ���������� �������
				if(chArray[j] != ' ' ) {
					i=j;
					length=0;
					startStr = j;
					while(chArray[i] != ' '&& i < chArray.length - 1) {
						i++;
						length++;
					}	     
					if(length>lengthFinish) {
						finishStr="";
						lengthFinish=length;
						for(j = startStr; j < i + 1 ; j++) {
							str2 = String.valueOf(chArray[ j ]);
							finishStr = finishStr + str2;
						}
						j = i;
					}
			}
			}
			//���������� � ������
			str = String.valueOf(chArray);
	}
	
	void outputNewStr() {
		System.out.println("����� ������� ����� : " + finishStr + " ��� ������ : " + lengthFinish);
	}
	public static void main(String[] args) {
		// �������� ������ ����, ����������� ���������. ����� ����� ������� ����� � ������� ��� �� �����.
		//������, ����� ����� ������� ���� ����� ���� ���������, �� ������������.
		//������ ������! ��� ������ ������ ��������!
		TaskEight myTaskEight = new TaskEight();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ��� ��������������: ");
		myTaskEight.str = in.nextLine ();
		in.close();
		myTaskEight.convert();
		myTaskEight.outputNewStr();
	}

}
