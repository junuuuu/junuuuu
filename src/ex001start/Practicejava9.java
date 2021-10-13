package ex001start;

public class Practicejava9
{

	public static void main(String[] args)
	{
		for ( int num = 0; num < 20 ; num = num +1 ) 
		{
				num = num+1;
				
				if( num % 2 == 0) 
				{
					continue;
				}
				
				if (num > 10) 
				{
					break; 
				}
				
				System.out.println(num);
		}
		System.out.println("for문 종료");
	}
}
