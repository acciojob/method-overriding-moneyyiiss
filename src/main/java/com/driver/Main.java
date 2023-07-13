package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{

}
public class Main {
  public static void main(String[] args) {
    B b = new B();
    String ans = b.meth();
    System.out.println(ans); 
  }
}