class Teacher{
    String name= "Bhawana Poudel",schoolname="Diamond Secondary School";
    int age=20;
}

class ComputerTeacher extends Teacher{
    int id =5;
    String sname = this.schoolname;
    void display(){
        System.out.println("Name:"+this.name+" Schoolname"+sname+" age:"+this.age+" Id:"+id);
    }
}

class Info{
    public static void main(String args[]){
        ComputerTeacher ct = new ComputerTeacher();
        ct.display();
    }
}