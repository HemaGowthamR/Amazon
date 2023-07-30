package org.company;

public class CompanyInfo {
	
	public void companyName(int a) {
		
		System.out.println("company rank number is "+a);

	}
	
	public void companyName(String b, int c) {
		
		System.out.println("Company name is "+b+"\ncompany id is "+c);

	}

	public static void main(String[] args) {
		
		CompanyInfo ci = new CompanyInfo();
		
		ci.companyName(7);
		ci.companyName("wipro", 2566);
	}

}
