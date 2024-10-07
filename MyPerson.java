package module3;
import java.io.*;
import java.util.*;
    class Person implements Serializable {
	int age;
	String name;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("My name is "+name+"\nI am "+age+" years old");
	}
}
    class Employee extends Person {
    	String code;
    	Employee(String name, int age, String code) {
    		super(name,age);
    		this.code = code;
    	}
    	public void display() {
    		super.display();
    		System.out.println("Employee code is "+code);
    	}
    }
	public class MyPerson {		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter employee code: ");
			String code = sc.next();
			Person p = new Person(name, age);
			Employee em = new Employee(name,age,code);
			try {
				FileOutputStream file = new FileOutputStream("person.txt");
				ObjectOutputStream obj = new ObjectOutputStream(file);
				obj.writeObject(p);
				obj.writeObject(em);
				file.close();
				System.out.println("Object serialized");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			// deserilazation
			try {
				FileInputStream fn = new FileInputStream("person.txt");
				ObjectInputStream ob = new ObjectInputStream(fn);
				Person p1 = (Person)ob.readObject();
				Employee em1 = (Employee)ob.readObject();
				System.out.println("Object deserialized");
				//p1.display();
				em1.display();
				fn.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
		

	}

}
