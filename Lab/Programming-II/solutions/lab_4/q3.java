import java.util.Scanner;
class Person{
	String name = "ccer",address = "Lekhnath";
}

class Faculty_member extends Person{
	String Facult = "Department of Science and Techonology",af = "Department of Business Administration";
}

class Staff extends Person{
	String position = "H.O.D";
}

class Student extends Person{
	int studentcount = 50;
}

class Part_time extends Faculty_member{
	String time = "Part time employee";
}

class Full_time extends Faculty_member{
	String time = "Full time employee";
}

class q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Person p = new Person();
		Faculty_member f = new Faculty_member();
		Staff s = new Staff();
		Student s1 = new Student();
		Part_time p1 = new Part_time();
		Full_time f1 = new Full_time();
		if(q == 1){
			System.out.println("This is "+p.name+" from "+p.address+" working as "+s.position+" in "+f.Facult+" as "+p1.time);
		}else{
			System.out.println("This is "+p.name+" from "+p.address+" working as "+s.position+" in "+f.af+" as "+f1.time);
		}
	}
}