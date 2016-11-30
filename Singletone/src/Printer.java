
public class Printer {
	private int page=0;
	// 각 객체들끼리 모두 사용해야 하므로 static(클래스의 변수)로 선언해줘야 함.
	private static Printer printer = null;
	
	// 생성자를 private 으로
	private Printer(){}
	
	// 객체를 처음이면 생성하고 아니면 생성된 객체를 넘겨주는 method
	// 객체 생성이 안되어 있는데 method 를 호출하게 되므로 static(클래스의 method) 으로 선언해줘야 함.
	// 여러 Thread 에서 동시에 접근하지 않게 하도록 임계영역으로 설정해줘야한다 ( Synchronized )
	// 다른 Thread 가 사용하고 있으면 기다렸다가 수행이 종료 된 후 사용한다.  ( Synchronized )
	public static synchronized Printer getInstance(){	
		// 처음이면
		if(printer == null) printer = new Printer();
		// 아니면 그냥 return
		return printer; 
	}
	
	// 출력
	// 여러 Thread 에서 동시에 접근하지 않게 하도록 임계영역으로 설정해줘야한다. ( Synchronized ) 
	// 다른 Thread 가 사용하고 있으면 기다렸다가 수행이 종료 된 후 사용한다.  ( Synchronized )
	public synchronized void print(String msg){
		System.out.println();
		System.out.println("*****************");
		System.out.println("*****************");
		
		
		System.out.println(msg);
		page++;
		
		System.out.println("********"+page+"********");
		System.out.println("*****************");
	}

}
