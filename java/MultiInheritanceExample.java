

class Person{
    private String name, address;
    private int age;
    public void setName(String name){
        this.name= name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setAge(int age){
        this.age=age;
    }


    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }

    public int getAGE(){

        return age;
    }

}

class Employee extends Person{
    private int salary;

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}


class GovEmployee extends Employee{
    private int pf;
    public void setPf (int pf){
        this.pf=pf;
    }
    public int getPf(){
        return pf;
    }
}



public class MultiInheritanceExample {
    public static void main(String[] args) {
        GovEmployee e2=new GovEmployee();
        e2.setName("Ram");
        e2.setAddress("bkt");
        e2.setAge(25);
        e2.setSalary(2500);
        e2.setPf(5000);
        System.out.println("Name= "+e2.getName());
        System.out.println("Address= "+e2.getAddress());
        System.out.println("Age= "+e2.getAGE());
        System.out.println("Salary= "+e2.getSalary());
        System.out.println("provison fund = "+e2.getPf());
        

        
    }
    
}