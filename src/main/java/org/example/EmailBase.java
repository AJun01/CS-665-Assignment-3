package org.example;
/**

 * Name: Yujun Liu

 * Course: CS-665 Software Designs & Patterns

 * Date: 03/03/2024

 * File Name: EmailBase.java

 * Description: this is EmailBase interface, contain generateTemplate method that requires customer object return templates
 * accordingly

 */
public interface EmailBase {
    String generateTemplate(Customer customer);
}
