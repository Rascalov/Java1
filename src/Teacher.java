import java.time.LocalDate;

public class Teacher extends Person {

	public Float Salary;
	public Teacher(int Id, String Fname, String LName, LocalDate DateOfBirth,Role Role, Float Salary) {
		super(Id, Fname, LName, DateOfBirth, Role);
		this.Salary = Salary;
	}
	
}
