package day14_Exception;

import java.util.*;
class Auth{
	private String age;	//인스턴스 변수
	public String getAge(){	// 매서드 
		return age; 
		}
	public boolean check(int age){	//매서드
		this.age = age+"";
		if(this.age.length() == 6){
			if(this.age.charAt(0)<'9'){ // 90년생보다 이전 일 때
				System.out.println("가입 가능");
				return true;
				// '가입 가능' 조건에 만족하면 true를 return해서
				// 반복문이 종료됨
			}else{
				System.out.println("가입 불가");
			}
		}else{	// 입력 길이가 6(자리)이 아닐 경우
			System.out.println("길이가 틀렸습니다.");
		}
		return false;
		// '가입 불가'이거나 '길이가 틀렸습니다'의 경우 false가 return되서
		// 반복문이 계속 반복됨
	}
	public int inputAge(){	//매서드
		Scanner input = new Scanner(System.in);
		int age;
		String chkAge;
		System.out.print("나이 입력 : ");
		try{
			age=input.nextInt();
			return age;
		}catch(InputMismatchException e){	
			// 입력값이 숫자(정수)가 아닌경우
			System.err.println("숫자를 입력 하세요!!!");
			return -1;	
		}
	}
	public void display(){
		boolean boo=false;
		System.out.println("인증 프로그램 입니다.");
		int age=-1;
		while(boo != true){		// 인증 성공될 때까지 반복
			age = inputAge();	
			// inputAge() 매서드 실행하고 return값을 age에 대입
			if(age != -1)	
			// inputAge()에서 문자를 입력 받으면 -1이 return되서
			// if를 무시하고 반복 실행 다시 inputAge를 실행하게 됨
				boo=check(age);
				// 숫자를 입력 받으면 age값이 check()으로 보내
				// check()에서 가입 여부에 따라 true와 false로 
				// return되서 반복문이 끝날지 계속 될지 결정됨
		}
	}
}
public class Quiz01 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Auth au = new Auth();	//객체 생성
		au.display();	// 매서드 호출
	}
}

