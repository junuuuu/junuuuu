package ex001start;

public class Practicejava4
{

	public static void main(String[] args)
	{
		//논리형 데이타
		System.out.println(2 < 3); //true
		System.out.println(2 > 3); //false
		
		boolean bMyCheck = (2 > 3);
		System.out.println(bMyCheck);
		
		//조건문 -상수
		if (1 < 2)
		{
			System.out.println("Hello");
		}
		//조건문 -변수
		int num = 3;
		
		if(num < 2)
		{
			System.out.println("Hi~");
		}
		//조건문-연산
		int num2 = 4;
		
		if((num2 % 2) ==1) {
			System.out.println("나머지가 1이면 출력된다.");
		}
		else {
			System.out.println("나머지가 0이면 출력된다.");
		}
		
		if((num2 % 2) == 1 ) 
		{
			System.out.println("나머지가 1 : 홀수");
		}
		else 
		{
			System.out.println("나머지가 0 : 짝수");
		}
	}

}
