package org.csu.domain;

public class Account {
    private int age;
    private String id;
    private String password;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void print(){
        System.out.println(this.age+" "+this.id+""+this.password);
    }
}
