package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnits {

    public TestUnits(){
    }
    @Test
    public void testGetCustomerName() {
        Customer customer = new Customer("Yoyo", "New Customer");
        assertEquals("Yoyo", customer.getName());
    }
    @Test
    public void testGetCustomerType() {
        Customer customer = new Customer("Yoyo", "New Customer");
        assertEquals("New Customer", customer.getType());
    }
    @Test
    public void testBusinessEmail() {
        Customer customer = new Customer("Yoyo", "Business");
        EmailGenerator eg = new BusinessEmail();
        System.out.println(eg.generateTemplate(customer));
    }
    @Test
    public void testReturnEmail() {
        Customer customer = new Customer("Yoyo", "Returning");
        EmailGenerator eg = new ReturnEmail();
        System.out.println(eg.generateTemplate(customer));
    }
    @Test
    public void testFrequentEmail() {
        Customer customer = new Customer("Yoyo", "Frequent");
        EmailGenerator eg = new FrequentEmail();
        System.out.println(eg.generateTemplate(customer));
    }
    @Test
    public void testNewCustomerEmail() {
        Customer customer = new Customer("Yoyo", "New Customer");
        EmailGenerator eg = new NewCusEmail();
        System.out.println(eg.generateTemplate(customer));
    }
    @Test
    public void testVIPEmail() {
        Customer customer = new Customer("Yoyo", "VIP Customer");
        EmailGenerator eg = new VIPEmail();
        System.out.println(eg.generateTemplate(customer));
    }
}
