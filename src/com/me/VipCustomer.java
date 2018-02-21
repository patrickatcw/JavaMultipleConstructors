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

public class VipCustomer {          //step 1 new class created through com.me

    private String name;            //step 2 3 fields created
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {

        //step 3 created 3rd constructor with all fields, empty parameter
        this("Default Name", 50000.00, "default@email.com");

    }

    // step 3 2nd constructor created through menu with 2 value parameters
    // and add a default value for the 3rd
    public VipCustomer(String name, double creditLimit) {
        //this.name = name;             remove these because we do not want to set values
       //this.creditLimit = creditLimit;
        this(name, creditLimit, "unknown@email.com"); //referencing parameters with default value for 3rd
    }

    //step 3 first constructor created through menu with 3 parameters w/default values
    public VipCustomer(String name, double creditLimit, String emailAddress) {  //
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
