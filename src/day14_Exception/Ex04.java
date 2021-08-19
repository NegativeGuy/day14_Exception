package day14_Exception;

import java.io.IOException;
class A{
	public void test() throws IOException{	
		// throws = 예외전가
		// IOException = 입출력이 잘못 됐을 때 예외를 받는 클래스
		ProcessBuilder b = new ProcessBuilder("calc111");
		//"calc111"은 없는 기능이므로 예외상황임
		//원래는 "calc"입력 시 계산기 기능 실행
		b.start();
	}
	public void display() throws IOException {
		test();
		// 부모(상속을 주는)에서 예외전가를 하면 자식도 예외전가를 해줘야 함
		// 부모에서 만약 try/catch를 했다면 자식은 그냥 상속 받아서 사용하면 됨
	}
}
public class Ex04 {
	public static void main(String[] args) throws IOException{
		//예외전가(throws) 
		//내부 코드 내에서가 아닌 외부에서 처리(던지기) 하겠다
		//대신 내부 코드는 더이상 실행되지 않음
		//오류가 나는 코드가 다음 코드들에 영향을 준다면 프로그램을 멈추기 외해 사용 
		
		A a = new A();	// 객체 생성
		a.display();	// 매서드 실행
		
		// 예외 전가를 하면 예외상황 이후의 코드는 실행되지 않음
		System.out.println("다음 코드들 실행");
	}
}
