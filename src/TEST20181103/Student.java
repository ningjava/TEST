package TEST20181103;

public class Student extends Person {

	private int id;//ѧ��

	/**
	 * �޲ι��췽��
	 */
	public Student() {
		//TODO ϵͳĬ�ϻ���ø����޲ι��췽��
		System.out.println("�����޲ι��췽��");
	}
	
	/**
	 * �вι��췽��
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student(int id,String name,int age) {
		super(name,age);//���ø����вι��췽��������name��age����ȥ
		System.out.println("�����вι��췽��");
		this.id=id;
	}
	
	/**
	 * ��д���෽��
	 */
	public String getMessage() {
		return this.id+","+super.getMessage();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		/*Student s1 = new Student();//ʵ�����޲ζ���
		s1.getMessage();*/
		Student s2 = new Student(1,"����",20);//ʵ�����޲ζ���
		System.out.println(s2.getMessage());
	}
}
