package TEST20181104;

import org.junit.Test;

public class TestPerson {

	@Test
	public void test() {
		Student s = new Student();
		s.run();
		s.sing();
		Teacher t = new Teacher();
		t.sing();
	}

}
