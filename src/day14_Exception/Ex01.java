package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
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

		// 0을 입력해서 나눌 수 없는 경우와 
		// 정수가 아닌 문자 입력하는 경우의 두가지 예외처리 시작

		try {
			// 문제가 발생하지 않으면 try 실행
			x = input.nextInt();
			y = input.nextInt();			
			result = x/y;
			System.out.println("x / y = "+result);
			
		}catch(ArithmeticException e){
		// 문제가 발생하면 catch 실행
		// ArithmeticException = 0을 입력시 0으로 나눌 수 없기 때문에 예외상황 발생
			e.printStackTrace();
			// 어떤 예외처리인지 출력해서 알려줌
		}catch(InputMismatchException e){
		// InputMismatchException = 정수가 아닌 문자(열)을 입력했을 때 예외상황 발생
			System.out.println("문자를 입력할 수 없습니다");
			//e.printStackTrace()를 쓰지 않고 
			// sysout으로 원하는 메시지를 띄울 수도 있음
		}
		// 예외처리 끝
		System.out.println("다음 문장들 실행~");
	}
}
