/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportreader;

/**
 *
 * @author NOUT
 */
  public class p {
    static public void l(String tx) {
      System.out.println(tx);
    }
  static public void i(int i) {
      System.out.println(i);
  }
  static public String rp(String data){
   String back;
   data = data.replace("\""," ");
   data = data.trim();
   data = data.replace(" ","_");
   back = data.trim();
   return back;
  }
  static public boolean head (String data) {
     if (data.contains("http") && !"".equals(Main.fN) && !"".equals(Main.sN)) {
        // l("link without");
         return true;
     } if (data.contains("Head-to-Head")) {
           String [] tmp;
             data = data.replace("Head-to-Head","               "); 
             data = data.trim();
             tmp = data.split(" v ");
             Main.fN = rp(tmp[0]);
             Main.sN = rp(tmp[1]);
            //l(tmp[0]); l(tmp[1]);
            l(Main.fN); l(Main.sN);
             
            return true; }
     
   return false;
         
  }
    static public String write (String[][] main, String[][] sub) {
      String wr = "INSERT INTO "+main[2][1]+" "+
             "(ID,bpCreate,bpWon,bpOpp,bpOppWon,rpTotal,rpWon,rpOppWon,OppName) "+
                 "VALUES(null, " +
                    main[16][1] + ", " + 
                    main[17][1] + ", " +
                    sub[16][1] + ", " +
                    sub[17][1] + ", " +
                    main[14][1] + ", " +
                    main[15][1] + ", " +
                    sub[15][1] + ", " +
                    "'"+sub[2][1]+"'" + ")"; 
    
      //p.l("!");
     // p.i(stmt.executeUpdate(sq2)); 
    return wr;
    }
  static public String create (String data) {
   String sm;
   sm = "CREATE TABLE IF NOT EXISTS "+data+
                   "(ID  INTEGER PRIMARY KEY AUTOINCREMENT," +
                   "bpCreate INT," +
                   "bpWon INT," + 
                   "bpOpp INT," + 
                   "bpOppWon INT," 
             + "rpTotal INT,"
             + "rpWon INT,"
             + "rpOppWon INT,"
             + "OppName CHARACTER(20) NOT NULL)"; 
 return sm;
 }
  
  }
