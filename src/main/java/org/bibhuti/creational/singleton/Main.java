package org.bibhuti.creational.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getData());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getData());
    }
}