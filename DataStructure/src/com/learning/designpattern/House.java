package com.learning.designpattern;

public class House {

    private int noOfFloors;
    private String materalUsed;
    private String houseType;

    public House(int noOfFloors, String materalUsed, String houseType) {
        this.noOfFloors = noOfFloors;
        this.materalUsed = materalUsed;
        this.houseType = houseType;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public String getMateralUsed() {
        return materalUsed;
    }

    public void setMateralUsed(String materalUsed) {
        this.materalUsed = materalUsed;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public static class HouseBuilder{

        private int noOfFloors;
        private String materalUsed;
        private String houseType;

        public HouseBuilder setNoOfFloors(int noOfFloors) {
            this.noOfFloors = noOfFloors;
            return this;
        }

        public HouseBuilder setMateralUsed(String materalUsed) {
            this.materalUsed = materalUsed;
            return this;
        }

        public HouseBuilder setHouseType(String houseType) {
            this.houseType = houseType;
            return this;
        }

        public House getHouseBuilder(){
            return new House(noOfFloors,materalUsed,houseType);
        }
    }
}


