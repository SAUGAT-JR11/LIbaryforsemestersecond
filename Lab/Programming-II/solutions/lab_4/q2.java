class Box{
	int l,b,h;
	Box(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	int printvol(){
		return l*b*h;
	}	
}

class Subbox1 extends Box{
	int weight;
	Subbox1(int l,int b,int h,int weight){
		super(l,b,h);
		this.weight = weight;
	}
	void displayweight(){
		System.out.println("The weight of box is "+weight+ " & its volume is "+printvol());
	}
}

class Subbox2 extends Box{
	int price = 500;
	Subbox2(int l,int b,int h,int price){
		super(l,b,h);	
		this.price = price;
	}
	void display(){
		System.out.println("The price of Box with " +printvol()+ " volume is rs."+price);
	}
}

class q2{
	public static void main(String[] args){
		Subbox1 s1 = new Subbox1(1,4,3,45);
		Subbox2 s2 = new Subbox2(3,4,5,34);
		s1.displayweight();
		s2.display();
	}
}