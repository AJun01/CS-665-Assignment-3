package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: BusinessEmail.java

 * Description: this is BusinessEmail class, extended from EmailGenerator and returns business template

 */
public class BusinessEmail extends EmailGenerator{
    public String generateTemplate(Customer customer){
            return header()+ businessBody(customer) + footer();
    }
    public static String businessBody(Customer customer){
        return "Dear " + customer.getName()+"," +
                "\n" +
                "\n" +
                "I hope this email finds you well. As we approach the end of the quarter, it's time for us to reflect on our recent collaborations and plan for the future.\n" +
                "\n" +
                "Over the past three months, we've witnessed significant achievements in our joint endeavors. Your feedback and engagement have been instrumental in achieving our shared objectives, and we are eager to build on this momentum.\n" +
                "\n" +
                "Should you have any questions or wish to schedule a meeting, please feel free to contact me at your earliest convenience.\n" +
                "\n" +
                "Thank you for your continued trust in us. We value your partnership and are committed to achieving continued success together.\n";
    }
}
