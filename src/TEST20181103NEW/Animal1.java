package TEST20181103NEW;

//�̳У����ද��
public class Animal1 {
//	private boolean isAnimal = true;
//	int legs=4;
	private String name;

	public Animal1(String name) {
		this.name = name;
	}

	public void doRun() {
		System.out.println("���ܣ�");
	}

	public void doEat() {
		System.out.println("��ԣ�");
	}

	public void Sounds() {
		System.out.println("��У�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDetail(String kidsName) {
		return null;
	}
	
}
