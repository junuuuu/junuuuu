package ex02variable;

public class E03CharBooleanType
{

	public static void main(String[] args) 
	{
		
		/*
		char형 : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할때
		   (single quotation)으로 감싸서 표현한다.
		   만약 "(double quotation)"으로 감싸면 문자열로 인식하므로
		   string으로 선언해야 한다. 
		 */
	   char ch1 = '가';
	   //char chStr = '가나다라'; // 에러발생. 문자열이므로 char로 선언불가능.
	  
	   String chStr = "가나다라"; // string으로 선언해야함.
	   System.out.println("ch=1"+ ch1);
	   System.out.println("chStr="+ chStr);
	   
	   /* 
	    아스키코드 :1byte로 표현할 수 있는 문자(영문, 숫자)를 십진수로
	         정의한 것을 말한다.
	         Ex) A => 65로 표현됨. a => 97로 표현됨.
	    
	    유니코드 : 1byte로 표현할 수 없는 문자(한글, 한자, 일본어 등)를 
	         2byte로 표현한 것을 말한다. 주로 16진수로 표현한다.      
	    
	   */
	   
	   char ch2 = 'A'; //65로 저장됨.
	   int num1 = 2; 
	   int num2 = ch2 + num1; //65+2=67
	   System.out.println("num=2"+ num2); //67 출력됨
	   System.out.println("(char)num2="+ (char)num2); //C로 출력됨
	   
	   char ch3 = (char)(ch2+num1); //(char형변환)(char+int=>int) =>char로 변환됨
	   System.out.println("ch3(문자출력)=>"+ ch3); //C 출력됨
	   System.out.println("ch3(아스키코드출력)=>"+ (int)ch3); //67 출력됨
	   
	  
	   
	   
	   char ch4 = '1';   // '1'=>문자 1=>숫자 
	   char ch4_1 = '1' + 1; // 싱글쿼테이션으로 감쌋으므로 문자1이 할당됨
	                         // 49+1
	   System.out.println("ch="+ ch4 
			   +", ch=4_1="+ ch4_1
			   +", ch_4="+ (int)ch4_1); //숫자50, 문자2가 출력됨
	   
	  /*
	   boolean형 : true 혹든 false 두가지의 값만 가질 수 있는 자료형으로
	      산술연산(+,-)이나 비교연산(<,<=)에서는 사용할 수 없고,
	      논리연산에서 사용할 수 있다.
	   */
	   
	   boolean bn1 = true;
	   boolean bn2 = false;
	   System.out.println("bn1="+ bn1 +", bn2="+ bn2);
	   
	   /*
	    &&(논리And) :엠퍼센트. 양쪽 모두 참일때만 참을 반환하는 연산자. 
	        그 외에는 모두 거짓을 반환한다. 
	    
	    ||(논리Or) : 파이프. 둘중 하나만 참이어도 참을 반환하는 연산자.
	        둘 다 거짓일때만 거짓을 반환한다.
	    */
	   
	   boolean bn3 = bn1 && bn2;
	   System.out.println("bn3(And)="+ bn3);
	   bn3 = bn1 || bn2;
	   System.out.println("bn3(Or)="+ bn3);

	   //'가'는 유니코드 44032로 표현되므로 true가 반환된다.
	   bn3 = '가' >30000; 
	   System.out.println("bn3="+ bn3);
	 
		  
	 			   
	}

}
