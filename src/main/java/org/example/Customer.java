package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: Customer.java

 * Description: this is Customer class, contains name and type as string, the getters for them

 */
public class Customer {
    private final String name;
    private final String type;
    public Customer(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String getName(){return name;}
    public String getType(){return type;}
}
