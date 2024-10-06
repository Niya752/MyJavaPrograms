package cseb23s3Rollno61;
class Human {
	void eat() {
		System.out.println("Eating....");
	}
}
class Girl extends Human {
	String myName;
	Girl(String Girlname) {
		myName = Girlname;
	}
	void dance() {
		System.out.println(myName + " is dancing");
	}
}

public class SingleInheritanceConstuctor {

	public static void main(String[] args) {
		Girl d = new Girl("Laila");
		d.dance();
		d.eat();
	}

}
