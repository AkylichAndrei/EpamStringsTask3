package stringsTaskThree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// pattern - ������, �����
//  \t	������ ���������.
//  \b	������ �������� � ������ �� ���� ��� ����� ��� �������� ������ ������� � ������ (backspace).
//  \n	������ �������� �� ����� ������.
//  \r	������ �������� �������.

public class TaskOne {
	
	String str,str2,finishStr;
	String[] fields;
	String[] fields2;
	char[] chArray;
	int j,i,sentences,x,l,l2,j2;
	String text = "(6 �����������)� ����� �� ���������� ���� ������. � ����� ����. � ������ ���������. ���������� � ������������� ��������, ���� ������� ������, �����, ���������� �������������� �������. ������� �� ������� � ����������, ������ ����� �����; ��� �������� ����� � ��������� �������� ��������� ���� ����� ������ � ��������� ��������. ���� ��, ����������� � ���������, ����� ������; �� � ����� �� ��� ������ ����.\r\n" + 
			"(4 ����������� )�� ����� ���� �� ������. C���� ������������� ����� ��� ������� �������. ������� ���������� ������� �����, ��������� ��������� � ���������� �� ��������. ������ ����� ��� �� �������, ��� �� ��� ����, � ��������� �������, �������� �� �������, � �������� ���� �� �� ����� ��������� �������� �������. \r\n" + 
			"(2 ����������� )��������� ����������� �����. �� ������� �� �������� � ���� ��������� � ��� �����, � ������ ���� �������� �� ����, ����� �� ���� ����� �, ������� ��������� �������� �� ����, ��������, ����, ��� ������ ���������, ��������� ������� ����� �����, ���� � ������ ���� ��� ������������� ���������� �����, ��� ���� �� ������� ��������� ����� ��������� � ������ �����, ���� �������� � �������������� ������� ������������ �����, � ��� ����� ���������� � ����������� ������������� � ������� ����� ��� ������. \r\n" + 
			"(1 ����������� ) (���(3)�����) (����(4)�����) (�����(5����) (�(1)�����) (�����(6)����) (�������(7)����) (��(2)�����).\r\n" +//����������� �� ����� � ��� ���������� ������� 
			"";
	//� ����������� ����� ������� � ����� �� �����, ������������ 5 ������, � ���� �� ��� ������������ ����� ������������: �����, �����.
	String lexemes = "����� ������� � ����� �� �����";
	static String buf;
	
	void sort(){
		Pattern p = Pattern.compile("\\r\\n");//����� ������ �� �������
    	fields = p.split(text);//
    	boolean isSorted = false;
    	int f1,f2;
    	while(!isSorted) {
    		isSorted = true;
		for (i = 0; i < fields.length - 1; i++) {
				f1 = 0;
				f2 = 0;
			Pattern pattern1 = Pattern.compile("[.]");
		    Matcher matcher1 = pattern1.matcher( fields[ i ]);
			    while (matcher1.find()) {
			      f1++;
			    }    
				Pattern pattern2 = Pattern.compile("[.]");
			    Matcher matcher2 = pattern2.matcher(fields[ i + 1]);
				    while (matcher2.find()) {
				      f2++;
				    }  
				if(f1 > f2)
				{
					isSorted = false;
					TaskOne.buf = fields[ i ];
					fields[ i ] = fields[ i + 1 ];
					fields[ i + 1 ] = TaskOne.buf;
				}
			}
		}
	}
	void sort2() {
		for (i = 0; i < fields.length ; i++) {
			Pattern p = Pattern.compile(" ");//����� ������ �� �������
			fields2 = p.split(fields[i]);
			//����������
			boolean isSorted2 = false;
			while(!isSorted2) {
				isSorted2 = true;
				for (int i = 0; i < fields2.length-1; i++)
				if(fields2[ i ].length() > fields2[i + 1].length())
				{
					isSorted2 = false;
					TaskOne.buf = fields2[ i ];
					fields2[ i ] = fields2[ i + 1 ];
					fields2[ i + 1 ] = TaskOne.buf;
				}
	    		
			}
			
			for (int i = 0; i < fields2.length; i++)
		 		   System.out.print(" "+fields2[ i ]);
			       fields2=null; //�������� ������
			       System.out.println(" ");
		}
	}
	void sort3() {
		for (i = 0; i < fields.length ; i++) {
			Pattern p = Pattern.compile(" ");//����� ������ �� �������
			fields2 = p.split(fields[i]);
			//����������
			
				for (int i2 = 0; i2 < fields2.length - 1; i2++) 
					for (j2 = i2; j2 < fields2.length ; j2++){
					Pattern pattern1 = Pattern.compile("[" + str + "]");
				    Matcher matcher1 = pattern1.matcher(fields2[i2]);
					    while (matcher1.find()) {
					      l++;
					    }  
					    Pattern pattern2 = Pattern.compile("[" + str + "]");
					    Matcher matcher2 = pattern2.matcher(fields2[j2]);
						    while (matcher2.find()) {
						      l2++;
						    }  
				if(l > l2)
				{
					TaskOne.buf = fields2[ i2 ];
					fields2[ i2 ] = fields2[ j2 ];
					fields2[ j2 ] = TaskOne.buf;
				}	
				l=0;l2=0;
			}
			for (int i2 = 0; i2 < fields2.length; i2++)
		 		   System.out.print(" "+fields2[ i2 ]);
			       fields2=null; //�������� ������
			       System.out.println(" ");
		
		}
	}
	void outputNewStr() {
		for (int i = 0; i < fields.length; i++)
 		   System.out.println(fields[ i ]);
		System.out.println("������ ������� " + fields.length);
	}
	public static void main(String[] args) {
		// C������ ����������, ����������� ����� (����� �������� � ������) � ����������� ��������� � ������� 
		// ��� ��������� ��������: 
		//������������� ������ �� ���������� �����������; --- 
		//� ������ ����������� ������������� ����� �� �����; ---
		//������������� ������� � ����������� �� �������� ���������� ��������� 
		// ��������� �������, � � ������ ��������� � �� ��������. ---
		TaskOne myTaskOne = new TaskOne();
		Scanner in = new Scanner(System.in);
		while (!"5".equals(myTaskOne.str2)){
			System.out.println(" ");
			System.out.println("1. ������� ������������� ����� ");
            System.out.println("2. ������������� ������ �� ���������� �����������");
            System.out.println("3. � ������ ����������� ������������� ����� �� �����");
            System.out.println("4. ������������� ������� � ����������� �� �������� ���������� ��������� "
            		+ "��������� �������, � � ������ ��������� � �� ��������");
            System.out.println("5. ��� ������ �� ���������� ������� 5");
            myTaskOne.str2 = in.nextLine ();
            try {
            	myTaskOne.x = Integer.parseInt(myTaskOne.str2);
            } catch (NumberFormatException e){
                System.out.println("�������� ����");
            }
            switch (myTaskOne.x){
                case 1:
                	System.out.println(myTaskOne.text);
                	break;
                case 2:
                    // ����� ������ 1 ������������� ������ �� ���������� �����������
                	myTaskOne.sort();
                	myTaskOne.outputNewStr();
                	//chText = text.myTaskOne.toCharArray();
                	//String[] fields = myTaskOne.text.split("\\r\\n");
                    break;
                case 3:
                    // ����� ������ 2 � ������ ����������� ������������� ����� �� �����
                	myTaskOne.sort();
                	myTaskOne.sort2();
                    break;
                case 4:
                	myTaskOne.sort();
                	System.out.println("������� ������ ��� ������ (��� ������� ����������� ������� ������ "
                			+ "'�'): ");
            		myTaskOne.str = in.nextLine ();
                    // ����� ������ 3
            		myTaskOne.sort3();
            }
        }
        System.out.println("���������� ���������!");
        in.close();
	}

}
