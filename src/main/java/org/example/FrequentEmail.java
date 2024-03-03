package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: FrequentEmail.java

 * Description: this is FrequentEmail class, extended from EmailGenerator and returns Frequent template

 */
public class FrequentEmail extends EmailGenerator{
    public String generateTemplate(Customer customer){
       return header()+ frequentBody(customer)+ footer();
    }
    public static String frequentBody(Customer customer){
        return "Dear " + customer.getName()+"," +
                "\n" +
                "\n" +
                "Your frequent visits are what make Yujun.co great! As a token of our appreciation for your loyalty, we’ve added 500 bonus points to your rewards account. Don't forget to check out our latest collection.\n"+
                "\n";
    }
}
