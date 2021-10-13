package ex12inheritance;
/*
static(정적) 타입의 멤버도 상속의 되고, 하위클래스에서 접근 시에는
멤버변수의 이름만으로 접근이 가능하다.
단, 클래스 외부에서 접근할 경우 객체생성없이 클래스명을 통해서도
접근할 수 있다. 즉 static이 가진 기본적인 규칙을 따른다.
 */
class Adder {
	
	public static  int val = 0;
	
	/*
	static으로 선언된 멤버변수는 실제로는 외부(메서드영역)에 생성되어
	있으므로 클래스명을 통한 접근이 허용된다.
	코드 레벨에서 보면 해당 클래스의 멤버변수이므로 변수명만으로
	접근하는 것도 가능하다. 즉 둘다 허용된다.
	 */
	public void add(int num) {
		val += num; //변수명
		Adder.val +=num; //클래스명
	}
}
//자식클래스의 멤버메서드는 모두 실행가능한 코드임.
class AdderFriend extends Adder{
	public void firendAdd(int num){
		val+= num;
		Adder.val += num;
	}
	public void showVal() {
		System.out.println("val="+ val);
		System.out.println("val="+ Adder.val);
	}
}

public class E03StaticInheritance
{

	public static void main(String[] args)
	{  
		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		/*
		멤버변수 val은 static이므로 프로그램 시작시 하나만
		생성되어 메서드영역에 로드된다. 따라서 아래에서의 모든
		연산은 val에 모두 더해지게 된다.
		 */
		ad.add(1);				// 1+1=2   참조변수.메서드
		adFriend.firendAdd(3);  //2+3+3=8
		Adder.val += 5;			// 8+5=13	클래스,멤버변수
		AdderFriend.val += 7;   //13+7=20
		
		adFriend.showVal(); //1+3+5+7의 결과: 16 출력됨
		
	}

}