
class Address{

    String country;
    String state;
    String city;
    String town;
    String streat;
    int plotNo;
    int pincode;

    Address(String country, String state, String city, String town, String streat, int plotNo, int pincode)
    {
        this.country = country;
        this.state = state;
        this.city = city;
        this.town = town;
        this.streat = streat;
        this.plotNo = plotNo;
        this.pincode = pincode;
    }

    String getAddress()
    {
        return this.plotNo +" streat: "+ this.streat + " "+ this.town + " "+ this.city + " "+ this.state + " "+ this.country + "," + this.pincode;
    }

}

class Employee{

    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display()
    {
        System.out.println("ID: "+ this.id);
        System.out.println("Name: "+ this.name);
        System.out.println("Address: "+ address.getAddress());


    }
}

public class aggrefation {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Abhishek", 
                        new Address("India", "Uttar Pradesh", "Tundla", "Tundla", "New Indra Nagar", 0, 283204));
        
                        emp1.display();
    }
    
}
