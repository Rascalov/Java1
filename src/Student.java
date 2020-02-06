import java.time.LocalDate;

public class Student extends Person{
	public String Group;
	public Student(int Id, String Fname, String LName, LocalDate DateOfBirth, Role Role, String Group) {
		super(Id, Fname, LName, DateOfBirth, Role);
		this.Group = Group;
	}
}
