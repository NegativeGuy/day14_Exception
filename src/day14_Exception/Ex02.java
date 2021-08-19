package day14_Exception;
class BBB {	// [부모]
	public int aaa;
}
class AAA extends BBB{	// [자식]
	public void catch1(Object a) {
		System.out.println("오브젝트 : "+a);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		Object ss = "test";
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		//Object는 모든 유형을 다 받을 수 있다.
		//(정수, 문자열, 실수, 문자)
	}
}
