/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportreader;

import java.util.ArrayList;

/**
 *
 * @author NOUT
 */
public class strCon extends Thread {
    
    @Override
  public void run() {
    //System.out.println(Thread.currentThread().getName()+" runned...");
    String Data = ClipBoardListener.setcnt();
    //System.out.println(data); 
    String fsdev = Data.replace("{\"stats\":[","          ");
    fsdev = fsdev.replace("]}","  ");
    fsdev = fsdev.trim();
    int pos = fsdev.indexOf("},{");
    String fs = fsdev.substring(1, pos);
    String sd = fsdev.substring(pos+3, (fsdev.length()-1));
    String [] tmp = fs.split("\\,");
    String [] smp = sd.split("\\,");
       String [][] first = new String [tmp.length][2];
       String [][] second = new String [smp.length][2];
     for (int a=0; a<tmp.length; a++) {
           String [] div = tmp[a].split("\\:");
          first[a][0] = div[0].replace("\"", " ").trim();
          first[a][1] = div[1];
     }
    for (int j=0; j<smp.length; j++) {
           String [] div = smp[j].split("\\:");
          second[j][0] = div[0].replace("\"", " ").trim();
          second[j][1] = div[1];
     }
//   first[2][1] = first[2][1].replace("\""," ");
//   first[2][1] = first[2][1].trim();
//   first[2][1] = first[2][1].replace(" ","_");
    first[2][1] = p.rp(first[2][1]);
    second[2][1] = p.rp(second[2][1]);
    
    //p.l(second[2][1]);
    
    Main.fM = first;
    Main.sM = second;
    Main.flag = true;
       
    
        Thread t = new Thread(new SQL(), "SQLstream");
        t.start();

        //SQL db = new SQL();
       
     //   for(int i=0; i<tmp.length; i++) {
     //       System.out.println(Main.fM[i][0]+" "+Main.fM[i][1]);
     //      System.out.println(Main.sM[i][0]+" "+Main.sM[i][1]+"\n");
    //    }
        
     //System.out.println(fs);
   // System.out.println(sd);
   // System.out.println(" ");
    
    
    
    
    
    Thread.currentThread().interrupt();
  } 
}
