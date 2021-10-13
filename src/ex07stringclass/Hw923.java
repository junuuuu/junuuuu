package ex07stringclass;

public class Hw923
{

	public static void main(String[] args)
	{
	//클래스 주요 매소드
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자";
		
	int num1 = 10, num2 = 20;
	String numResult = (num1==num2) ? "데이터가 같다" : "데이터가 다르다";
		System.out.println("비교결과:"+ numResult);
		
	String str4 = new String("HELLO JAVA");
		
	String str3 = "KOSMO";
		
	//시나리오] 주민등록번호를 indexOf를 사용하여 성별을 구분하는
	//프로그램을 작성하시오.
	
	String juminNum = "123123-1231231";
	juminNum = "120123-1231231";
	int index = juminNum.indexOf("-")+1;
	if(juminNum.charAt(index)=='3') {
		System.out.println("남자");
	}
	else {
		System.out.println("여자");
	}
	
	//Int index = juminNum.IndexOf("-")+1;
	}
}
