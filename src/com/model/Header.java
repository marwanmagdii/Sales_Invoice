/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MARWAN MAGDY
 */
public class Header {
    private int num;
    private String name;
    private Date date;
    private ArrayList<Invoiceline> invoiceline;

    public Header(int num, Date date, String name) {
        this.num = num;
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Invoiceline> getInvoiceline() {
        if(invoiceline ==null)
        {
            invoiceline=new ArrayList<>();
        }
        return invoiceline;
    }

    @Override
    public String toString() {
        return "Header{" + "num=" + num + ", name=" + name + ", date=" + date + ", invoiceline=" + invoiceline + '}';
    }

    public double getTotal()
    {
        double total=0.0;
        for(Invoiceline invoiceline:getInvoiceline())
        {
            total+=invoiceline.getTotal();
        }
        return total;
    }
    
}
