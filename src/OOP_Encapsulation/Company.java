package OOP_Encapsulation;

public class Company {

	public String name;
	public int empCount;
	private String financialData;

	// setter and getter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getFinancialData() {
		finalFinancialData();
		return financialData;
	}
	
	private void finalFinancialData(){
		
	}

	public void setFinancialData(String financialData) {
		this.financialData = financialData;
	}

	

}
