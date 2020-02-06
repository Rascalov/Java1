import java.time.LocalDate;
import java.time.Period;

public class Person {
	public int Id;
	public String FName, LName;
	public LocalDate DateOfBirth;
	public Role Role;
	public Person(int Id, String Fname, String LName, LocalDate DateOfBirth, Role Role) {
		this.Id = Id;
		this.FName = Fname;
		this.LName = LName;
		this.DateOfBirth = DateOfBirth;
		this.Role = Role;
	}
	public int Age() {
        return Period.between(this.DateOfBirth, (LocalDate.now())).getYears();
	}
}
