package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		예외상황
		- 프로그램의 의도(개발자의 의도)와 다르게 동작하는 것들
		
		예외의 종류
		- 강제예외 : throw
		- 예외전가 : throws
		- 예외처리 : try, catch
		*/
		
		Scanner input = new Scanner(System.in);
		int x, y, result;
		System.out.println("수 입력");
		// 문자를 입력했을 경우 예외처리 시작
		// 0으로 나눴을 경우의 예외처리 시작

		try {
			// 문제가 발생하지 않으면 try 실행
			x = input.nextInt();
			y = input.nextInt();			
		
		
			result = x/y;
			System.out.println("x / y = "+result);
			return; // 문제가 없으면 return으로 끝냄
			
		}catch(Exception e){ 
			// 문제가 발생하면 catch 실행
			// Exception은 모든 catch의 최상위 부모 클래스이기 때문에 
			// 한번의 catch로 모든 예외상황을 커버 가능
			e.printStackTrace();
			// 모든 예외상황을 다 받기 때문에 
			// 어떤 예외상황인지 알려주어 확인을 하는 것이 좋음
			return;
			
		// 예외처리 끝
		}finally {	
			// 위에서 return을 썼기 때문에 finally를 써주지 않으면 
			// 아래코드들이 실행되지 않아서
			// return을 만나도 무조건 아래코드를 실행하게끔 finally를 써줌
			System.out.println("다음 문장들 실행~");	
		}	
	}
}
