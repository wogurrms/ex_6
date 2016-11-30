
public class Printer {
	private int page=0;
	// �� ��ü�鳢�� ��� ����ؾ� �ϹǷ� static(Ŭ������ ����)�� ��������� ��.
	private static Printer printer = null;
	
	// �����ڸ� private ����
	private Printer(){}
	
	// ��ü�� ó���̸� �����ϰ� �ƴϸ� ������ ��ü�� �Ѱ��ִ� method
	// ��ü ������ �ȵǾ� �ִµ� method �� ȣ���ϰ� �ǹǷ� static(Ŭ������ method) ���� ��������� ��.
	// ���� Thread ���� ���ÿ� �������� �ʰ� �ϵ��� �Ӱ迵������ ����������Ѵ� ( Synchronized )
	// �ٸ� Thread �� ����ϰ� ������ ��ٷȴٰ� ������ ���� �� �� ����Ѵ�.  ( Synchronized )
	public static synchronized Printer getInstance(){	
		// ó���̸�
		if(printer == null) printer = new Printer();
		// �ƴϸ� �׳� return
		return printer; 
	}
	
	// ���
	// ���� Thread ���� ���ÿ� �������� �ʰ� �ϵ��� �Ӱ迵������ ����������Ѵ�. ( Synchronized ) 
	// �ٸ� Thread �� ����ϰ� ������ ��ٷȴٰ� ������ ���� �� �� ����Ѵ�.  ( Synchronized )
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
