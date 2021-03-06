//Directions
/*
1) create a new class VipCustomer
2) it should have 3 fields; name, credit limit, and email address
3) create 3 constructors
- 1st constructor empty should call the constructor with 3 parameters
with default value
- 2nd constructor should pass on the 2 values it receives and add a
default value for the 3rd
- 3rd constructor should save all fields
4) create getters only for this using generation of intellij as setter
won't be needed
5) confirm it works
*/

package com.me;

public class Main {

    public static void main(String[] args) {

        //step 5 creating instances with constructors and println
        VipCustomer customer1 = new VipCustomer(); //with no parameters
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);  //cust2 w/2 parameters
        System.out.println(customer2.getName());

        //cust3 with 3 parameters
        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());

    }
}

//printout
//Default Name
//Bob
//Tim
//tim@email.com
