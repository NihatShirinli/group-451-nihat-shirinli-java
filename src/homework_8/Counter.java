package homework_8;

public class Counter {
	static int totalCount;
	int instanceCount;
	
	public Counter(){
		totalCount++;
		instanceCount++;
	}
	
	public static void main(String[] args) {
		Counter n1 = new Counter();
		Counter n2 = new Counter();
		Counter n3 = new Counter();
		
		System.out.println("n1 totalCount = " + n1.totalCount + "; instanceCount = " + n1.instanceCount );
		System.out.println("n2 totalCount = " + n2.totalCount + "; instanceCount = " + n2.instanceCount );
		System.out.println("n3 totalCount = " + n3.totalCount + "; instanceCount = " + n3.instanceCount );
	}
}
