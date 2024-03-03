package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: ReturnEmail.java

 * Description: this is ReturnEmail class, extended from EmailGenerator and returns the returning template

 */
public class ReturnEmail extends EmailGenerator{
    public String generateTemplate(Customer customer){
            return header()+ returnBody(customer)+ footer();
    }
    public static String returnBody(Customer customer){
        return "Dear " + customer.getName()+"," +
                "\n" +
                "\n" +
                "As a valued returning customer, we’re thrilled to see you again! We've curated some special gadgets just for you, and we're offering an exclusive 15% discount on your next purchase. Use code WELCOMEBACK at checkout. \n"+
                "\n" +
                "Thank you for choosing us, we will see you again!";
    }
}
