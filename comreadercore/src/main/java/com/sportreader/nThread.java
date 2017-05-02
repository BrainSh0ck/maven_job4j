package com.sportreader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author NOUT
 */
public class nThread {
 
    public static void nTh () {
     // Runnable r = new Clip();
      Thread t = new Thread(new strCon(), "strConDeamon");
      t.setDaemon(true);
      t.start();
   // System.out.println("New thread "+n+" created"); 
    }
}
