package day082402核心类库03自定义异常01;

public class LoginException  extends Exception{

	@Override
	public String getMessage() {
		
		System.out.println("登录发生错误了");
		System.out.println("登录发生错误了2");
		System.out.println("登录发生错误了3");
		System.out.println("登录发生错误了4");
		System.out.println("登录发生错误了5");
		System.out.println("登录发生错误了6");
		System.out.println("登录发生错误了7");
		
		return "登录发生错误了";
	}

	
	
}
