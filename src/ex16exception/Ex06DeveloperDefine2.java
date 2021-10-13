package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자정의 예외클래스
 1.Exception 클래스를 상속한다.
 2.생성자에서 예외발생 시 출력할 메세지를 super()를 통해 입력한다.
 3.예외 발생 지점에서 if문으로 감싼 후 예외객체를 생성하고 throw한다.
 4.catch문에서 예외객체를 받아 처리한다.
 */

class AgeErrorException2 extends Exception {
	public AgeErrorException2() {
		super("나이 입력이 개잘못 되었어요");
	}
}
public class Ex06DeveloperDefine2
{

	public static void main(String[] args) throws AgeErrorException
	{
		System.out.println("나이를 입력하세요 : ");
		
			int age = readAge();
			System.out.println("당신의 나이는 "+ age + " 입니다.");
	}
	
	public static int readAge() throws AgeErrorException 
	{
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		try {
			if(inputAge<0) {
			AgeErrorException2 ex = new AgeErrorException2();
				throw ex;
			}
		}
		catch(AgeErrorException2 e) {
			/*
			나이는 음수가 없으므로 예외가 발생된 경우에는 0으로
			강제 초기화 한다.
			 */
			inputAge = 0;
			System.out.println(e.getMessage());
		
		}
		
		return inputAge;
	}
}
