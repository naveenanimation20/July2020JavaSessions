package JavaSessions;

import java.util.ArrayList;

public class EmployeeData {

	String name;
	int empId;
	ArrayList<String> devicesList;

	public EmployeeData(String name, int empId, ArrayList<String> devicesList) {
		this.name = name;
		this.empId = empId;
		this.devicesList = devicesList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public ArrayList<String> getDevicesList() {
		return devicesList;
	}

	public void setDevicesList(ArrayList<String> devicesList) {
		this.devicesList = devicesList;
	}

	public static void main(String[] args) {

		ArrayList<String> devListPriya = new ArrayList<String>();
		devListPriya.add("MAC Book Pro");
		devListPriya.add("Windows 10 Lenovo");
		devListPriya.add("Samsung 10");
		devListPriya.add("iPhone XR");

		EmployeeData e1 = new EmployeeData("Priya", 101, devListPriya);

		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.devicesList);
		System.out.println(e1.devicesList.get(0));
		
		e1.setName("Naveen");
		
		System.out.println(e1.name);
		System.out.println(e1.getName());
		
		

	}

}
