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
public class EBook extends Book{
private String downloadUrl;
private int sizeMB;

    public EBook() {
    }

  

    public EBook(String downloadUrl, int sizeMB, String title, String aurthor, double price) {
        super(title, aurthor, price);
        this.downloadUrl = downloadUrl;
        this.sizeMB = sizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public int getSizeMB() {
        return sizeMB;
    }



}
