package nurse.pals;

public class Patient {
	
	private long id;
	private String firstName;
	private String lastName;
	private char middleInitial;
	private int SSN;
	private int DOB;
	private double height;
	private double weight;
	private char sex;
	private String address;
	private String primaryDoctor;
	private String pharmacy;
	private String emergencyContact;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int SSN) {
		this.SSN = SSN;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int DOB) {
		this.DOB = DOB;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryDoctor() {
		return primaryDoctor;
	}
	public void setPrimaryDoctor(String primaryDoctor) {
		this.primaryDoctor = primaryDoctor;
	}
	public String getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(String pharmacy) {
		this.pharmacy = pharmacy;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
}