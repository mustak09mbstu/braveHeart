package com.controlstatement;

import java.util.Objects;

class Student2 implements Cloneable{
     private int roll;
    private String name;

    public Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return roll == student2.roll &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roll, name);
    }
}

public class TestClone {

    public  static void main(String args[]){
        Student2 s1=new Student2(101,"mustak");
        Student2 s2=null;
        try{
                s2= (Student2)s1.clone();
        }catch (CloneNotSupportedException c){}

        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        System.out.println("s1"+s1.hashCode());
        System.out.println("s2"+s2.hashCode());
        System.out.println(s2==s1);
        System.out.println(s2.equals(s1));
    }



}
