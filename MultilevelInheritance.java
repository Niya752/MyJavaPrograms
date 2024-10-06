package cseb23s3Rollno61;
class Animaliae {
	void kingdom() {
		System.out.println("I am animaliae");
	}
}
class Birds extends Animaliae {
	void phyllum() {
		System.out.println("I am ave");
	}
}
class Peacock extends Birds {
	void Species() {
		System.out.println("I am the national bird of India");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Peacock p = new Peacock();
		p.phyllum();
		p.Species();
		p.kingdom();
	}

}

