package ex04ControlStatement;

public class Qu_04_09
{

	public static void main(String[] args) 
	{
		int dan = 2;  //단을 표현한 변수
		while(dan<=9) 
		{   //단에 대한 조건(2~9단까지)
			int su = 1;   //수를 표현한 변수
			while(su<=9) { //단이 고정된 상태에서 1~9까지 증가
				//서식에 맞춰 출력할 때는 prinf문이 좀더 유리하다.
				
				
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				//print()를 통해 출력하면 정렬이 약간 틀어지게 된다.
				//System.out.print(dan+"*"+su+"="+ (dan*su));
				
				
				System.out.print(" "); //스페이스(공백) 출력
				su++;
				
				System.out.println(); //줄바꿈
			}
			//System.out.println(); //줄바꿈
			dan++;
		

		}

	}
}
