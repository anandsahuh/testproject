
public class Student {

	int id;
	String name;
	String branch;

	public Student() {
	}

	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public Student(int id) {
		this.id = id;
	}

	public String toString() {
		String str = "(" + id + "," + name + "," + branch + ")";
		return str;
	}

	public static void main(String[] args) {
		Student e1 = new Student();
		e1.id = 101;
		e1.name = "anand";
		e1.branch = "sadkk";
		System.out.println(e1.toString());
		Student e2 = new Student(101, "anand", "sadkk");
		System.out.println(e2.toString());

	}

}
