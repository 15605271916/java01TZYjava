package day081901面向对象04encapsulation封装01;

public class Test2 {
	public static void main(String[] args) {

		Test1 t=new Test1();
		//System.out.println(t.a);【a访问不了，会报错，因为Tset1中的a修饰符是private。只能在他自己的类中使用】
		//b。c。d修饰符分别为（默认）default，protected，public，可在同一个包中使用
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
	}
}
