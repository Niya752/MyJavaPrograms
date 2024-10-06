package cseb23s3Rollno61;
class Animal {
	void eat() {
		System.out.println("Eating....");
	}
}
// class Dog inherited from parent class Animal
class Dog extends Animal {
	void bark() {
		System.out.println("Barking....");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}
