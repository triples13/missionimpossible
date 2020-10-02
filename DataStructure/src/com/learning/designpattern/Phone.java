package com.learning.designpattern;

public class Phone {

    private String phoneName;
    private String memory;
    private String phoneSize;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {   // not needed as already being done in builder
        this.phoneName = phoneName;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }

    public Phone(String phoneName, String memory, String phoneSize) {

        this.phoneName = phoneName;
        this.memory = memory;
        this.phoneSize = phoneSize;
    }



    public static class PhoneBuilder{

        private String phoneName;
        private String memory;
        private String phoneSize;

        public PhoneBuilder setPhoneName(String phoneName) {
            this.phoneName = phoneName;
            return this;
        }

        public PhoneBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public PhoneBuilder setPhoneSize(String phoneSize) {
            this.phoneSize = phoneSize;
            return this;
        }

        public Phone buildphone(){
            return new Phone(phoneName,memory,phoneSize);
        }
    }
}
