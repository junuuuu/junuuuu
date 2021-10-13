package ex001start;

public class Practicejava8
{

	public static void main(String[] args)
	{
		int num = 0;
		
		while (true) 
		{
			num = num+1;
			
			
			if( num % 2 == 0) 
			{
				continue;
			}
			
			if (num > 10) 
			{
				break; //while문 중괄호 빠져나가게 됨
			}
			
			System.out.println(num); // =< 홀수일때만 출력
		}
		
		System.out.println("while문 종료");
	}

}
