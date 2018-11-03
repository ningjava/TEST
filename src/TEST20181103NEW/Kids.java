package TEST20181103NEW;

public class Kids {
	private String name;
	private Animal1 pet;

	public Kids(String name, Animal1 pet) {
		this.name = name;
		this.pet = pet;
	}

	public void myPetSounds() {
		pet.Sounds();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal1 getPet() {
		return pet;
	}

	public void setPet(Animal1 pet) {
		this.pet = pet;
	}

	public String getMyPet() {
		return pet.getDetail(name);
	}
	
}
