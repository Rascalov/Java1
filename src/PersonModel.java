import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonModel {
	private Scanner scanner = new Scanner("src/Persons.txt");
	
	public ArrayList<Person> getPersonsByRole(Role role){
		ArrayList<Person> persons = new ArrayList<Person>();
		
		while(scanner.hasNext()) {
			String[] properties = scanner.nextLine().split(";");
			LocalDate dateOfBirth;
			switch (properties[0]) {
			case "STUDENT": 
				if (Role.valueOf(properties[0]) == role) {
					dateOfBirth = LocalDate.parse(properties[4], DateTimeFormatter.ofPattern("MM/dd/yyyy"));
					persons.add(new Student(Integer.parseInt(properties[1]), 
								properties[2], properties[3], 
								dateOfBirth, Role.valueOf(properties[0]), properties[5]));
				}
				break;
			case "TEACHER":
				if (Role.valueOf(properties[0]) == role) {
					dateOfBirth = LocalDate.parse(properties[4], DateTimeFormatter.ofPattern("MM/dd/yyyy"));
					persons.add(new Teacher(Integer.parseInt(properties[1]), 
								properties[2], properties[3], 
								dateOfBirth, Role.valueOf(properties[0]), Float.parseFloat(properties[5])));
				}
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + properties[0]);
			}
		}
		
		
		return persons;
	}
	
}
