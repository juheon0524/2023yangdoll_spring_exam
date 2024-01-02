package iocbase;

public class FrontService {
	MyForLoopThree three;
	
	public FrontService(MyForLoopThree three) {
		this.three = three;
	}
	
	public void work() {
		System.out.println(this.getClass()+"는 서비스 클래스 입니다.");
		int result = three.froLoop();
		System.out.println(result);
		System.out.println("안녕~~~~");
	}
}
