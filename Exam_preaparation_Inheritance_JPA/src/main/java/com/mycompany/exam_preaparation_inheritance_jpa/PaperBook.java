/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam_preaparation_inheritance_jpa;

import javax.persistence.Entity;

/**
 *
 * @author Jonas
 */
@Entity
public class PaperBook extends Book{
    private double shippingWieght;
    private boolean inStock;

    public PaperBook() {
    }

  

    public PaperBook(double shippingWieght, boolean inStock, String title, String aurthor, double price) {
        super(title, aurthor, price);
        this.shippingWieght = shippingWieght;
        this.inStock = inStock;
    }

    public double getShippingWieght() {
        return shippingWieght;
    }

    public void setShippingWieght(double shippingWieght) {
        this.shippingWieght = shippingWieght;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    
    
    
    
    
    
}
