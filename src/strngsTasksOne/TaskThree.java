package strngsTasksOne;
import java.util.Scanner;

public class TaskThree {
	String str;
	char[] chArray;
	int j,counter;
	void search(){
			 chArray = str.toCharArray();//��������������� ������ � ������
			for( j = 0; j < chArray.length ; j++){//���������� ��� �������� �������
				if(Character.isDigit(chArray[j])==true  ){//������� �����
					counter++;//c������
			        }	
			}
	}
	void output() {
		System.out.println("���������� ���� � ������:" + counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskThree myTaskThree = new TaskThree();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������: ");
		myTaskThree.str = in.nextLine ();
		in.close();
		myTaskThree.search();
		myTaskThree.output();
	}

}
