package nurse.pals;

public class Doctor extends User {
	public Doctor() {
		super();
	}
	
	public String toString()
	{
		return new String("User") + super.toString();
	}
}
