package com.company;

public class BankAccount {

    public void PersonalAcct(double ammount) {
        double ammount1= ammount;
        double finalammount;
        //To determine what the final balance of the bank account is after all the deductions
        if (ammount1<100)
        {
            //If the deposit is under 100 then the account will be charged with an additional $2.00
            System.out.println("Your account balance falls under the required ammount which cost a fee of $2.00");
            finalammount = ammount1 - 2.00;  
            //Deduction calculation takes place

        }
        else
            finalammount= ammount1;
        //If thge ammount meets the requirment than nothing will be deducted
        System.out.println ("Final Balanace: $" + finalammount);
        //Balance is displayed

    }

    public void BussinessAcct(double ammount) {
        double ammount1= ammount;
        double finalammount;
        //To determine what the final balance of the bank account is after all the deductions
        if (ammount1<500)
        {
            //If the deposit is under 500 then the account will be charged with an additional $10.00
            System.out.println("Your account balance falls under the required ammount which cost a fee of $10.00");
            finalammount = ammount1 - 10.00;
            //Deduction calculation takes place

        }
        else
            finalammount= ammount1;
        //If thge ammount meets the requirment than nothing will be deducted
        System.out.println ("Final Balanace: $" + finalammount);
        //Balance is displayed

    }
}
