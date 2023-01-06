class Patient{
	int patient_id;
	String patient_disease;
	String patient_address;
	static String hospital_name;
}
public class InstanceVariable {

	public static void main(String[] args) {
		Patient ram=new Patient();
		ram.patient_id=56;
		ram.patient_disease="Covid";
		ram.patient_address="Hyderabad";
		Patient.hospital_name="KIMS";
		System.out.println("Patient ID="+ram.patient_id);
		System.out.println("Patient Disease="+ram.patient_disease);
		System.out.println("Patient Address="+ram.patient_address);
		System.out.println("Patient Hospital="+Patient.hospital_name);

	}

}

