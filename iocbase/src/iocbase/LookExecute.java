package iocbase;

import java.io.File;
import java.util.Scanner;

public class LookExecute {

	public static void main(String[] args) throws Exception {
		MyForLoopOne one = new MyForLoopOne();
		int result = one.froLoop();
		System.out.println("실행 결과 => " + result);
		System.out.println("===================");
		MyForLoopTwo two = new MyForLoopTwo();
		int resultTwo = two.froLoop(1, 9, 1);
		System.out.println("실행 결과 => " + resultTwo);
		System.out.println("===================");
		
		Scanner scan = new Scanner(new File("loopData.txt"));
		String readData = scan.nextLine();
		System.out.println(readData);
		String[] dataArr = readData.split(",");
		int twoResul = two.froLoop(
				Integer.parseInt(dataArr[0]), 
				Integer.parseInt(dataArr[1]), 
				Integer.parseInt(dataArr[2]));
		System.out.println(twoResul);
		
	}

}
