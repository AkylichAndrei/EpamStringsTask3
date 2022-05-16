package stringsTaskThree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// pattern - шаблон, маска
//  \t	Символ табуляции.
//  \b	Символ возврата в тексте на один шаг назад или удаление одного символа в строке (backspace).
//  \n	Символ перехода на новую строку.
//  \r	Символ возврата каретки.

public class TaskOne {
	String str,str2,finishStr;
	String[] fields;
	String[] fields2;
	char[] chArray;
	int j,i,sentences,x,l,l2,j2;
	String text = "(6 предложений)В одной из отдаленных улиц Москвы. В сером доме. С белыми колоннами. антресолью и покривившимся балконом, жила некогда барыня, вдова, окруженная многочисленною дворней. Сыновья ее служили в Петербурге, дочери вышли замуж; она выезжала редко и уединенно доживала последние годы своей скупой и скучающей старости. День ее, нерадостный и ненастный, давно прошел; но и вечер ее был чернее ночи.\r\n" + 
			"(4 предложения )Из числа всей ее челяди. Cамым замечательным лицом был дворник Герасим. Мужчина двенадцати вершков роста, сложенный богатырем и глухонемой от рожденья. Барыня взяла его из деревни, где он жил один, в небольшой избушке, отдельно от братьев, и считался едва ли не самым исправным тягловым мужиком. \r\n" + 
			"(2 предложения )Одаренный необычайной силой. Он работал за четверых — дело спорилось в его руках, и весело было смотреть на него, когда он либо пахал и, налегая огромными ладонями на соху, казалось, один, без помощи лошаденки, взрезывал упругую грудь земли, либо о Петров день так сокрушительно действовал косой, что хоть бы молодой березовый лесок смахивать с корней долой, либо проворно и безостановочно молотил трехаршинным цепом, и как рычаг опускались и поднимались продолговатые и твердые мышцы его плечей. \r\n" + 
			"(1 предложение ) (ооо(3)буквы) (оооо(4)буквы) (ооооо(5букв) (о(1)буква) (ооооо(6)букв) (ооооооо(7)букв) (оо(2)буквы).\r\n" +//предложение со всеми О для четвертого задания 
			"";
	//В предложении Белка прыгает с ветки на ветку, использовано 5 лексем, и одна из них представлена двумя словоформами: ветки, ветку.
	String lexemes = "Белка прыгает с ветки на ветку";
	static String buf;
	
	void sort(){
		Pattern p = Pattern.compile("\\r\\n");//делим строку на символы
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
			Pattern p = Pattern.compile(" ");//делим строку на символы
			fields2 = p.split(fields[i]);
			//сортировка
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
			       fields2=null; //обнуляем массив
			       System.out.println(" ");
		}
	}
	void sort3() {
		for (i = 0; i < fields.length ; i++) {
			Pattern p = Pattern.compile(" ");//делим строку на символы
			fields2 = p.split(fields[i]);
			//сортировка
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
			       fields2=null; //обнуляем массив
			       System.out.println(" ");
		}
	}
	void outputNewStr() {
		for (int i = 0; i < fields.length; i++)
 		   System.out.println(fields[ i ]);
		System.out.println("длинна массива " + fields.length);
	}
	public static void main(String[] args) {
		// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом 
		// три различных операции: 
		//отсортировать абзацы по количеству предложений; --- 
		//в каждом предложении отсортировать слова по длине; ---
		//отсортировать лексемы в предложении по убыванию количества вхождений 
		// заданного символа, а в случае равенства – по алфавиту. ---
		TaskOne myTaskOne = new TaskOne();
		Scanner in = new Scanner(System.in);
		while (!"5".equals(myTaskOne.str2)){
			System.out.println(" ");
			System.out.println("1. Вывести редактируемый текст ");
            System.out.println("2. Отсортировать абзацы по количеству предложений");
            System.out.println("3. В каждом предложении отсортировать слова по длине");
            System.out.println("4. Отсортировать лексемы в предложении по убыванию количества вхождений "
            		+ "заданного символа, а в случае равенства – по алфавиту");
            System.out.println("5. Для выхода из приложения введите 5");
            myTaskOne.str2 = in.nextLine ();
            try {
            	myTaskOne.x = Integer.parseInt(myTaskOne.str2);
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }
            switch (myTaskOne.x){
                case 1:
                	System.out.println(myTaskOne.text);
                	break;
                case 2:
                    // вызов метода 1 отсортировать абзацы по количеству предложений
                	myTaskOne.sort();
                	myTaskOne.outputNewStr();
                    break;
                case 3:
                    // вызов метода 2 в каждом предложении отсортировать слова по длине
                	myTaskOne.sort();
                	myTaskOne.sort2();
                    break;
                case 4:
                	myTaskOne.sort();
                	System.out.println("Введите символ для поиска (для большей наглядности введите символ "
                			+ "'о'): ");
            		myTaskOne.str = in.nextLine ();
                    // вызов метода 3
            		myTaskOne.sort3();
            }
        }
        System.out.println("Приложение завершено!");
        in.close();
	}

}
