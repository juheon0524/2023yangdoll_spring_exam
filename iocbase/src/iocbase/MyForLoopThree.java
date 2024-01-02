package iocbase;

public class MyForLoopThree {
	int start; public void setStart(int start) {this.start = start;}
	int end; public void setEnd(int end) {this.end = end;}
	int incre; public void setIncre(int incre) {this.incre = incre;}
	
	public int froLoop() {
		int sum = 0;
		/* end = end+1; 설정정보에 의해 생성된 객체에 필드값이 변경된다. 이후에는 변경된 값들이 계속 사용되며 수정되어진다.*/
		for(int i = start; i < end+1; i=i+incre) {
			sum = sum + i;
		}
		return sum;
	}
}
