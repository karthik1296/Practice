package Assisted;

class students {
	private String Name;
	private int RollNo;
	private int Age;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
}

public class Encapsulation {
	
public static void main(String[] args) {
	students obj = new students();
	obj.setName("Pradeep");
	obj.setRollNo(105);
	obj.setAge(23);
     System.out.println("My Name is " + obj.getName());
     System.out.println("My Roll No is " + obj.getRollNo());
     System.out.println("My Age is " + obj.getAge());
	}


}

