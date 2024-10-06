package cseb23s3Rollno61;
class ramapethecous {
	void father() {
		System.out.println("Ramapethecous was our first ancestor");
	}	
}
class chimpanzee extends ramapethecous {
	void newfather() {
		System.out.println("chipanzee is our nearest descendent");
	}
	
}
class homosapien extends ramapethecous {
	void newgen() {
		System.out.println("Homo sapiens are the new man of this era");
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		homosapien ob = new homosapien();
		ob.newgen();
		ob.father();
	}

}
