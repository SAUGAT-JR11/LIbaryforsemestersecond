class bank{
	String bankname = "Agricultural Development Bank";
}

class bankDepartment extends bank{
	String bankDepartName = "Loan Depart";
}

class Post extends bankDepartment{
	String employeePost = "Manager";
}

class q1{
	public static void main(String[] args){
		Post p = new Post();
		System.out.println("This is "+p.employeePost+" from "+p.bankname+" "+p.bankDepartName);
	}
}