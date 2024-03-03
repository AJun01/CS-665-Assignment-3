package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: EmailGenerator.java

 * Description: this is EmailGenerator class, concrete class implementing EmailBase, contains header and footer method,
 * and also has the default body method if customer type did not be set.

 */
public class EmailGenerator implements EmailBase{
    public String generateTemplate(Customer customer){
        return header()+ defaultBody()+ footer();
    }
    public static String header(){
        return "Hihi!\n\n";
    }
    public static String footer(){
        return "\n\nBest,\nYujun(CEO)";
    }
    public static String defaultBody(){
        return "Please indicate your customer type and retrieve template accordingly";
    }

}
