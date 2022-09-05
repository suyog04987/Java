

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



public class SingleInheritanceExample {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("Ram");
        e1.setAddress("bkt");
        e1.setAge(25);
        e1.setSalary(2500);
        System.out.println("Name= "+e1.getName());
        System.out.println("Address= "+e1.getAddress());
        System.out.println("Age= "+e1.getAGE());
        System.out.println("Salary= "+e1.getSalary());

        
    }
    
}
