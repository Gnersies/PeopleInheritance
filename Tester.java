public class Tester {

	public static void main(String[] args) {
		Person Trevor = new Person("Trevor", 2003);
		Student Reece = new Student("Pizza delivery man", "Reece", 2008);
		Instructor Justin = new Instructor(56000, "Justin", 1999);
		System.out.println(Trevor.toString());
		System.out.println(Reece.toString());
		System.out.println(Justin.toString());
	}

}