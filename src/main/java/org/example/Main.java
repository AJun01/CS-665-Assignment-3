package org.example;

import java.util.Scanner;

/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: Main.java

 * Description: this is the main class, handles the user conversations and input processing. calling scanner and generator
 * to map user's choice

 */
public class Main {
    public static void main(String[] args) {

        //initiate scanner and generator
        Scanner scanner = new Scanner(System.in);
        EmailGenerator generator;

        //greeting and the first question
        System.out.println("Welcome, welcome..." + "\n"+
                "For what name you are sending to?");
        String name = scanner.nextLine();

        //second question
        System.out.println("What type of email you wish you choose for this receiver?\n" +
                "1. Business \n" +
                "2. Returning \n" +
                "3. Frequent \n" +
                "4. New Customer \n" +
                "5. VIP Customer ");
        String type = scanner.nextLine();

        //choice cases
        generator = switch (type) {
            case "1", "Business" -> new BusinessEmail();
            case "2", "Returning" -> new ReturnEmail();
            case "3", "Frequent" -> new FrequentEmail();
            case "4", "New Customer" -> new NewCusEmail();
            case "5", "VIP Customer" -> new VIPEmail();
            default -> new EmailGenerator();
        };

        //output templates accordingly
        Customer cus = new Customer(name, type);
        System.out.println(generator.generateTemplate(cus));
    }
}