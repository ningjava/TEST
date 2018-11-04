package TEST20181104;

public class Student implements Runnable,Singble{

	public void run() {
		System.out.println("学生"+canRun);
	}

	public void sing() {
		System.out.println("学生"+canSing);
		
	}
}
