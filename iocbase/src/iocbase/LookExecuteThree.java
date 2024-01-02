package iocbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LookExecuteThree {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("appbean.xml");
		MyForLoopThree loopThree = (MyForLoopThree)context.getBean("myForLoopThree");
		int result = loopThree.froLoop();
		System.out.println(result);
		
		System.out.println("한 단계 더 거치는 예제");
		FrontService ser = (FrontService)context.getBean("service");
		ser.work();
		
	}
}
