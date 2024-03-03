package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: NewCusEmail.java

 * Description: this is NewCusEmail class, extended from EmailGenerator and returns new customer template

 */
public class NewCusEmail extends EmailGenerator{
    public String generateTemplate(Customer customer){
        return header()+ newcusBody(customer)+ footer();
    }
    public static String newcusBody(Customer customer){
        return "Dear " + customer.getName()+"," +
                "\n" +
                "\n" +
                "Welcome aboard! We're excited to have you explore our offerings. As a new member of the Yujun.co family, enjoy a 10% discount on your first order. Just use code NEWFRIEND at checkout.\n";
    }
}
