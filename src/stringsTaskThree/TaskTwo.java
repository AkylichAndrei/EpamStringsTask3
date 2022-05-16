package stringsTaskThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа 
// и его тип 
//1.открывающий тег,
//2.закрывающий тег,
//3.содержимое тега, 
// примечание: Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
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
			+ "<to>Вася</to> "
			+ "<from>Света</from> "
			+ "<heading>Напоминание</heading>"
			+ " <body>Позвони мне завтра!</body>"
			+ " </note> "
			+ "<note id = \"2\"> "
			+ "<to>Петя</to> "
			+ "<from>Маша</from>"
			+ " <heading>Важное напоминание</heading>"
			+ " </body> </note>"
			+ " </notes>";
	
	void find(){
		strToArray = text.toCharArray(); // Преобразуем строку text в массив символов (char)
		i2=0;
		 Pattern pattern = Pattern.compile("<\\w.+?>");
		    Matcher matcher = pattern.matcher(text);
		    while (matcher.find()) {
		    	start = matcher.start();
		        end = matcher.end();
		    	i2++; j=0;
		    	System.out.println("");
		    	 System.out.println("Найден узел № " + i2 + ".\r\n" + 
		    	 		"Открывающий тег:" + 
		    	 		"");
		    	//поиск открывающего тега
		    	 strTemp=text.substring(matcher.start(), matcher.end());
		        System.out.println(strTemp);
		        
		        //поиск закрывающего тега
		        strToArray = strTemp.toCharArray();
		        System.out.println( "Закрывающий тег:" );
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
		        
		        //начинаем поиск из нужного нам места
		        textSubString = text.substring(matcher.start(), text.length());
		        //поиск содержимого тега
		        System.out.println( "Содержимое тега " + strTemp2 + " : " );
		        Pattern p = Pattern.compile("(<"+strTemp2+").+?(/"+strTemp2+">)");  
		        Matcher m = p.matcher(textSubString);  
		        if(m.find()){  
		            System.out.println(m.group());  
		        }  
		    }		    
	}
	public static void main(String[] args) {
		TaskTwo myTaskTwo = new TaskTwo();
		myTaskTwo.find();
	}
}