package TEST20181103NEW;

public class TestPet {

	public static void main(String[] args) {

		Cat1 c = new Cat1("小白", "blue");
		Dog1 d = new Dog1("大黄", "yellow");
		
		
		Kids k1 = new Kids("Tom", c);
		Kids k2 = new Kids("Emily", d);
		k1.myPetSounds();
		k2.myPetSounds();

		Bird1 b=new Bird1("开心");
		Kids k3 = new Kids("Rose",b);
		k3.myPetSounds();
		
		//Tom的宠物是一只名叫小白的猫，眼睛颜色是blue

		System.out.println(k1.getMyPet());
		
	}

}
