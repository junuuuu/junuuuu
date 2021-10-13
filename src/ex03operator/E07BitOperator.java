package ex03operator;

public class E07BitOperator 
{

	public static void main(String[] args) 
	{
		/*
		 비트연산자: 자료를 bit단위로 논리 연산 한다.
		 & : 비트And. 좌우가 둘다 1일때만 1을 반환한다.
		 | : 비트Or. 좌우 둘중 하나만 1이면 1을 반환한다.
		 ^ : 비트xXOR. 둘이 같을때 0을 반환, 다를때 1을 반환한다.
		 ~ : 비트Not. 비트를 반전시켜 반환한다. 0이면 1, 1이면 0.
		 */
		
		int num1 = 5;                 //0101
		int num2 = 3;				  //0011
		int num3 = -1;                //1111
		
		/*
		 num3의 값이 -1인 이유는 1을 더했을때 0이 되기 때문읻나.
		 양수 1을 2의 보수를 취하면 -1이 된다
		 1의보수: 기존값을 반전시킨 값
		 2의보수: 1의보수에 1을 더한 값
		 */
										
		
		
		System.out.println("비트ADN:"+ (num1 & num2));//1
		System.out.println("비트OR:"+ (num1 | num2));//7
		System.out.println("비트XOR:"+ (num1 ^ num2));//6
		System.out.println("비트Not:"+ (~num3));//0
	 
	}

}
