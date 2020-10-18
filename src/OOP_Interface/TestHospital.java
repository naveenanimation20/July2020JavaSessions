package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		
		FortisHospital fh = new FortisHospital();
		fh.cancerServices();
		fh.cardioServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.OPTServices();
		fh.medicalKits();
		fh.pathologyServices();
		USMedical.medicalDisplay();
		//USMedical.min_fee = 20;
		System.out.println(USMedical.min_fee);
		
		//top casting:
		USMedical us = new FortisHospital();//child class object can  be referred by parent interface ref variable
		
		us.cardioServices();
		us.physioServices();
		us.emergencyServices();
		us.polioServices();
		
		UKMedical uk = new FortisHospital();
		
		
		
		
	}

}
