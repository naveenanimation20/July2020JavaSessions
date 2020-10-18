package OOP_Interface;

public class FortisHospital extends HospitalTrust implements USMedical, UKMedical, IndianMedical {

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");

	}

	@Override
	public void cosmeticServices() {
		System.out.println("FH - cosmeticServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH - ENTServices");

	}

	@Override
	public void cancerServices() {
		System.out.println("FH - cancerServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");

	}

	@Override
	public void pediatricServices() {
		System.out.println("FH - pediatricServices");

	}

	@Override
	public void polioServices() {
		System.out.println("FH - polioServices");		
	}

	
	public void medicalInsurance(){
		System.out.println("FH -- medicalInsurance");
	}
	
	public void OPTServices(){
		System.out.println("FH -- OPTServices");
	}

	@Override
	public void covid19Test() {
		System.out.println("FH -- covid19Test");
	}
	
	@Override
	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");

	}
	
	@Override
	public void admin(){
		System.out.println("FH -- admin");
	}
	

}
