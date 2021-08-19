package day14_Exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("나이 입력");
		age = input.nextInt();
//		try{			
//			age = input.nextInt();
//			if(age<0) {
//				throw new Exception("그런 나이는 없다");
//				// throw = 강제 예외
//			}
//			System.out.println("당신의 나이는 : "+age);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());	
//			// e.getMessage에 "그런 나이는 없다"가 들어옴
//		}
//		
		if(age<0) {
			System.out.println("그런 나이는 없다");
		}
		else {
			System.out.println("당신의 나이는 : "+age);
		}
	}
}
