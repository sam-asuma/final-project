package nurse.pals;

public class Nurse extends User {

	private String firstName;
	private String LastName;
	private String[] education;
	private String[] certification;
	private String[] license;
	private String level;
	private boolean access;

	public Nurse() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String[] getEducation() {
		return education;
	}

	public void setEducation(String[] education) {
		this.education = education;
	}

	public String[] getCertification() {
		return certification;
	}

	public void setCertification(String[] certification) {
		this.certification = certification;
	}

	public String[] getLicense() {
		return license;
	}

	public void setLicense(String[] license) {
		this.license = license;
	}
	
	public String getLevel()
	{
		return level;
	}
	
	public void setLevel(String level)
	{
		this.level = level;
	}
	
	public String toString()
	{
		return new String("First Name: ") + new String("Last Name: ") +
		new String("Education: ") + new String("Certification: ") +
		new String("License: ") + new String("Level: ") + super.toString();
	}
}