package stringsTaskThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// �������� ����������, ����������� ��������������� ���������� ���������� ����� xml-��������� � ��� ��� 
//1.����������� ���,
//2.����������� ���,
//3.���������� ����, 
// ����������: ������������ �������� ��������� XML ��� ������� ������ ������ ������.
public class TaskTwo {
	String str,str2,finishStr;
	char[] chArray;
	char[] strToArray;
	char chTemp;
	String strTemp,strTemp2,textSubString;
	int j,i,sentences,x,i2,start,end;
	String[] fields;
	String text = "<notes>"
			+ " <note id = \"1\"> "
			+ "<to>����</to> "
			+ "<from>�����</from> "
			+ "<heading>�����������</heading>"
			+ " <body>������� ��� ������!</body>"
			+ " </note> "
			+ "<note id = \"2\"> "
			+ "<to>����</to> "
			+ "<from>����</from>"
			+ " <heading>������ �����������</heading>"
			+ " </body> </note>"
			+ " </notes>";
	
	void find(){
		strToArray = text.toCharArray(); // ����������� ������ text � ������ �������� (char)
		i2=0;
		 Pattern pattern = Pattern.compile("<\\w.+?>");
		    Matcher matcher = pattern.matcher(text);
		    while (matcher.find()) {
		    	start = matcher.start();
		        end = matcher.end();
		    	i2++; j=0;
		    	System.out.println("");
		    	 System.out.println("������ ���� � " + i2 + ".\r\n" + 
		    	 		"����������� ���:" + 
		    	 		"");
		    	//����� ������������ ����
		    	 strTemp=text.substring(matcher.start(), matcher.end());
		        System.out.println(strTemp);
		        
		        //����� ������������ ����
		        strToArray = strTemp.toCharArray();
		        System.out.println( "����������� ���:" );
		        System.out.print("</");
		        i=1; 
		        do {
		        	System.out.print(strToArray[i]);
		        	if(i==1)
		        	strTemp2 = strToArray[i]+"" ;
		        	if(i!=1)
		        		strTemp2 += strToArray[i] ;
		        	i++;
		        }while((strToArray[i]!='>')&&(strToArray[i]!=' ')&&(strToArray.length!=i));
		        System.out.println(">");
		        i=0;
		        
		        //�������� ����� �� ������� ��� �����
		        textSubString = text.substring(matcher.start(), text.length());
		        //����� ����������� ����
		        System.out.println( "����� ����������� : " + strTemp2 );
		        Pattern p = Pattern.compile("(<"+strTemp2+").+?(/"+strTemp2+">)");  
		        Matcher m = p.matcher(textSubString);  
		        if(m.find()){  
		            System.out.println(m.group());  
		        }  
		    }		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskTwo myTaskTwo = new TaskTwo();
		myTaskTwo.find();
	}
}