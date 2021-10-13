package ex04ControlStatement;

public class hw 
{

	public static void main(String[] args) 
	
    {
		
		/*
		 for문 : while문과 같은 반복문으로 초기값, 조건식, 증감식이
		 		한 줄에 있어 반복의 횟수를 명시적으로 알 수 있는 반복문이다
		 		형식]
		 			for(초기값 ; 조건식 ; 증감식) {
		 				실행문;
		 			}
		 		실행순서]
		 		 초기값-> 조건식 확인 ->참일때 실행 ->-증감식 
		 		 ->조건식 확인-> 반복실행
		 		 ->조건이 거짓일때 for문 탈출
		 */
		
		/*
		 while문
		 	:반복의 횟수가 정해져 있지 않을 때 주로 사용하는
		 	반복문이다. 반복의 회수가 명확할 때는 주로 for문을
		 	사용한다.
		 	형식]
		 		반복을 위한 변수의 초기값;
		 		while (조건) {
					
					실행문장;
					반드시 증감식; <= 반복문 탈출을 위한 증감
				}
				반복의 조건이 false일 때 while문을 탈출한다. 
				또한 반복문의 처음으로 돌아가면 무조건 조건을 검사한다.
		 */
		
	//1번
		
		for( int i=1; i<=5; i++) 
		{
			//System.out.println(" * " ); 
			
			for( int a=i; a<=5; a++ ) 
			{
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		
		//2번 
		
		 
		
		

	}

}
