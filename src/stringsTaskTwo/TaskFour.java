package stringsTaskTwo;
import java.util.Scanner;

public class TaskFour {
	String str,str2,finishStr;
	char[] chArray;
	String[] chArray2  = new String[3];
	int j,counter;
	void convert(){
			//преобразовываем строку в массив
		     finishStr="";
		     counter++;
			 chArray = str.toCharArray();
			//перебираем все элементы массива
			 for( j = 0; j < chArray.length - 1  ; j++) {
				past();
			}
	}
	void past() {
		if( (chArray[ j ] == 'т' && counter==1)||(chArray[ j ] == 'т' && counter==4))
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
		if( chArray[ j ] == 'о' && counter==2)
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
		if( chArray[ j ] == 'р' && counter==3)
		{
			str2 = String.valueOf(chArray[ j ]);
			finishStr = finishStr+str2;
			 counter++;
			 j = 0;
		}
	}
	void outputNewStr() {
		System.out.println("Вот что получилось :" + finishStr);
	}
	public static void main(String[] args) {
		TaskFour myTaskFour = new TaskFour();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку: ");
		myTaskFour.str = in.nextLine ();
		in.close();
		myTaskFour.convert();
		myTaskFour.outputNewStr();
	}
}
