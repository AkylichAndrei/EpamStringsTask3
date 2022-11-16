package stringsTaskThree;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestClass {
	public static void main(String[] args) {
	      String str = "Крещение Руси произошло в 988 году! Не так ли?";
	      String pattern = "(.*)(\\d+)(.*)";	      
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(str);
	      if (m.find( )) {
	         System.out.println("Найдено значение: " + m.group(0));
	         System.out.println("Найдено значение: " + m.group(1));
	         System.out.println("Найдено значение: " + m.group(2));
	      }else {
	         System.out.println("НЕ СОВПАДАЕТ");
	      }
	}
}
