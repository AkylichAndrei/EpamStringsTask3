package stringsTaskTwo;

import java.util.Scanner;

public class TaskFour {
	String str,str2,finishStr;
	char[] chArray;
	String[] chArray2  = new String[3];
	int j,counter;
	void convert(){
			//��������������� ������ � ������
		     finishStr="";
		     counter++;
			 chArray = str.toCharArray();
			//���������� ��� �������� �������
			 for( j = 0; j < chArray.length - 1  ; j++) {
				past();
			}
	}
	void past() {
		if( (chArray[ j ] == '�' && counter==1)||(chArray[ j ] == '�' && counter==4))
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
		if( chArray[ j ] == '�' && counter==2)
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
		if( chArray[ j ] == '�' && counter==3)
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
	}
	void outputNewStr() {
		System.out.println("��� ��� ���������� :" + finishStr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������: ");
		myTaskFour.str = in.nextLine ();
		in.close();
		myTaskFour.convert();
		myTaskFour.outputNewStr();
	}

}
