

class Person{
    private String name, address;
    private int age;




public void setInfo(){
    name= "Ram";
    address="KTM";
    age=18;
    }


public void showInfo(){
    System.out.println("Name: "+ name);
    System.out.println("Address: "+ address);
    System.out.println("Age: "+ age);


}

}

public class Test {
    public static void main(String[] a  rgs) {
        Person p = new Person();
        p.setInfo();
        p.showInfo();
        
    }
    
}

