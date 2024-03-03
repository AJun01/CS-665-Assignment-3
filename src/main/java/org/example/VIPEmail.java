package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: VIPEmail.java

 * Description: this is VIPEmail class, extended from EmailGenerator and returns vip template

 */
public class VIPEmail extends EmailGenerator{
    public String generateTemplate(Customer customer){
            return header()+ vipBody(customer)+ footer();
    }
    public static String vipBody(Customer customer){
        return "Dear " + customer.getName()+"," +
                "\n" +
                "\n" +
                "As a VIP member, your experience at Yujun.co is our highest priority. We are delighted to offer you early access to our new product line, along with complimentary next-day shipping. Your dedicated customer service line is always available at 1-800-YUJUNCO.\n" +
                "\n" +
                "Thank you for being a cornerstone of our community.\n";
    }
}
