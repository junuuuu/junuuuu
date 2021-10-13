package ex08class;
/*
밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

메인메소드 샘플코드]
public static void main(String[] args)
{
	Triangle t = new Triangle();
	t.init(10, 17); //밑변10, 높이17로 초기화
	System.out.println("삼각형의 넓이 : " + t.getArea());
	t.setBottom(50);//밑변 50으로 변경
	t.setHeight(14);//높이 14로 변경
	System.out.println("삼각형의 넓이 : " + t.getArea());
}


 */

class Triangle {
	
	//멤버변수
	int bottom; 
	int height;
	
	
	//밑변과 높이를 초기화
	void init(int bootom, int height) {
		this.bottom = bottom;  //좌 멤버변수 우 매개변수
		this.height = height;  //좌 멤버변수 우 매개변수
	}
	//밑변을 변경
	void setBottom(int bottom) {
		this.bottom = bottom;
	}
	
	//높이를 변경
	void setHeight(int height) {
		this.height = height;
		
	}
	//삼각형의 넓이를 계산 후 반환(호출한 지점이 프린트문 안이라 반환값잇음)
	double getArea() {
		return (bottom * height * 0.5);
	}
}
public class QuTriangle2
{

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		
		t.setBottom(10);//밑변 50으로 변경
		t.setHeight(20);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
// 85 350
