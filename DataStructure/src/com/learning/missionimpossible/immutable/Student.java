package com.learning.missionimpossible.immutable;

final class Student {

    private final int id;
    private final int rollNo;
    private final String name;
    private final Address address;

     Student(int id,int rollNo,String name,Address address){
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {

        Address address = new Address();
        address.setCity(this.address.getCity());
        address.setCountry(this.address.getCountry());
        address.setState(this.address.getState());
        return address;
    }
}
