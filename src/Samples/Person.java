package Samples;

public class Person {

	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	public Person() {
		this.FirstName ="Matam";
		this.LastName = "Bhaskar";
		this.Age = 24;
		this.Gender = "Male";
	}
	public Person(String firstName, String lastName, int age, String gender) {
		
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Gender = gender;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Gender=" + Gender
				+ "]";
	}
}
