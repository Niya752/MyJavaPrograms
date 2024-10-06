package oopj24cseb61;
abstract class Animal {
	protected int legs;
	Animal(int legs) {
		this.legs = legs;
	}
	abstract void eat();
	void walk() {
		if (legs == 0) {
			System.out.println("Fish has no legs.");
		} else {
			System.out.println("This animal walks by "+legs+" legs.");		
		}		
	}	
}
class Spider extends Animal {
	Spider(int legs) {
		super(legs);
	}
	void eat() {
		System.out.println("Spider eats insects");
	}
}
interface Pet {
	abstract void getName();
	abstract void setName(String name);
	abstract void play();
}
class Cat extends Animal implements Pet {
	String name;
	Cat(String name, int legs) {
		super(legs);
		this.name = name;	
	}
	public void getName() {
		System.out.println("This cat's name is "+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("Cats play with rats");
	}
	void eat() {
		System.out.println("Cat eat fishes");
	}
}
class Fish extends Animal implements Pet {
	String name;
	Fish(String name, int legs) {
		super(legs);
		this.name = name;		
	}
	public void getName() {
		System.out.println("This fish's name is "+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		
	}
	public void eat() {
		System.out.println("Fish eat plants");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Fish f = new Fish("Mimi",0);
		System.out.println("FISH");
		f.getName();
		f.eat();
		f.walk();
		f.setName("Momo");
		f.getName();
		
		Cat c = new Cat("Fluffy", 4);
		System.out.println("\nCAT");
		c.getName();
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		c.getName();
		
		Spider s = new Spider(8);
		System.out.println("\nSPIDER");
		s.eat();
		s.walk();
	}

}
