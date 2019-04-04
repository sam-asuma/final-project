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
		// TODO Auto-generated constructor stub
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
		LastName = lastName;
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
	









}
