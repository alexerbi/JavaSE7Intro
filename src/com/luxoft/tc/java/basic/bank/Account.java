package com.luxoft.tc.java.basic.bank;

import com.luxoft.tc.java.basic.furniture.Person;

/**
 * Created by alexjd on 12.04.2017.
 */
public class Account {

    private Person person;
    private int bill;
    private int overdraft;

    public Account(Person person, int bill, int overdraft) {
        this.person = person;
        this.bill = bill;
        this.overdraft = overdraft;
    }


}
