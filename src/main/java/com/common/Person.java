package com.common;

import java.util.Date;

/**
 * @author jackycheng
 * @date 2017-12-28-上午10:27
 */

public class Person {
    private String name;
    private int age;
    private Date birthday;
    private String address;
    private String email;
    private String phone;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static class Builder{
        private String name="";
        private int age=0;
        private Date birthday=new Date();
        private String address="";
        private String email="";
        private String phone="";

        public Person.Builder name(String name){
            this.name=name;
            return this;
        }
        public Person.Builder age(int age){
            this.age=age;
            return this;
        }
        public Person.Builder birthday(Date birthday){
            this.birthday=birthday;
            return this;
        }
        public Person.Builder address(String address){
            this.address=address;
            return this;
        }
        public Person.Builder email(String email){
            this.email=email;
            return this;
        }
        public Person.Builder phone(String phone){
            this.phone=phone;
            return this;
        }
        public Person build(){

        }
    }

    private Person(Person.Builder builder) {
        name=builder.name;
        age=builder.age;
        birthday=builder.birthday;
        address=builder.address;

    }


}
