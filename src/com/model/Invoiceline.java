/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;



/**
 *
 * @author MARWAN MAGDY
 */
public class Invoiceline {
   private Header head;
   private String name;
   private int count;
   private double price;

    public Invoiceline(Header head, String name, int count, double price) {
        this.head = head;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Header getHead() {
        return head;
    }

    public void setHead(Header head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Invoiceline{" + "name=" + name + ", count=" + count + ", price=" + price + '}';
    }
   
    public double getTotal()
    {
        return count*price;
    }

    
}
