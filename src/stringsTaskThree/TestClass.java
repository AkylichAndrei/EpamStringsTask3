package stringsTaskThree;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� ������������, ����� ����� ������
	      String str = "�������� ���� ��������� � 988 ����! �� ��� ��?";
	      String pattern = "(.*)(\\d+)(.*)";

	      // �������� Pattern �������
	      Pattern r = Pattern.compile(pattern);

	      // �������� matcher �������
	      Matcher m = r.matcher(str);
	      if (m.find( )) {
	         System.out.println("������� ��������: " + m.group(0));
	         System.out.println("������� ��������: " + m.group(1));
	         System.out.println("������� ��������: " + m.group(2));
	      }else {
	         System.out.println("�� ���������");
	      }
	}

}
