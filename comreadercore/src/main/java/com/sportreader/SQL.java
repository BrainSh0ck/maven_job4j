/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportreader;

import java.sql.*;

public class SQL extends Thread 
{
  @Override
  public void run ()
  {
   // p.l(Thread.currentThread().getName()+" runned...");
    Connection c = null;
    Statement stmt = null;  
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:mstat.db");
      c.setAutoCommit(false);
     // System.out.println("Opened database successfully");
     stmt = c.createStatement();
     String sq1;
     if (Main.fN.equals(Main.fM[2][1]) || Main.fN.equals(Main.sM[2][1])) {sq1 = p.create(Main.fN);} else   {
        if (Main.sN.equals(Main.fM[2][1]) || Main.sN.equals(Main.sM[2][1])) {sq1 = p.create(Main.sN);} else {sq1 = "";}
     } 
        
     
      
//      p.l(Main.fN); p.l(Main.sN);p.l("||"); p.l(Main.fM[2][1]);p.l(Main.sM[2][1]);  
//      System.out.println(Main.fN.equals(Main.fM[2][1]));
//      System.out.println(Main.fN.equals(Main.sM[2][1]));
//      System.out.println(Main.sN.equals(Main.fM[2][1]));
//      System.out.println(Main.sN.equals(Main.sM[2][1]));
      
     // p.l(sq1);
      stmt.executeUpdate(sq1); 
     
      stmt.close();
      c.commit();
      c.close();
    
    
    } catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
    }
    
    //SQL db = this; 
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:mstat.db");
      c.setAutoCommit(false);
      stmt = c.createStatement();  
      String sq2 = "";
        if (Main.fM[2][1].equals(Main.fN) && !Main.sM[2][1].equals(Main.sN)) {
            sq2 = p.write(Main.fM, Main.sM);} 
          if (Main.sM[2][1].equals(Main.fN) && !Main.fM[2][1].equals(Main.sN)) {
              sq2 = p.write(Main.sM, Main.fM);}   
              if (Main.sM[2][1].equals(Main.sN) && !Main.fM[2][1].equals(Main.fN)) {
                  sq2 = p.write(Main.sM, Main.fM);}  
                 if (Main.fM[2][1].equals(Main.sN) && !Main.sM[2][1].equals(Main.fN)) {
                     sq2 = p.write(Main.fM, Main.sM);} 
//                    if ( Main.fM[2][1].equals(Main.fN) &&  Main.sM[2][1].equals(Main.sN) ) {sq2 = p.write(Main.fM, Main.sM); sqr = p.write(Main.sM, Main.fM);} else {sqr = "";sq2 = "";}
//                       if ( Main.fM[2][1].equals(Main.sN) &&  Main.sM[2][1].equals(Main.fN) ) {sq2 = p.write(Main.sM, Main.fM); sqr = p.write(Main.fM, Main.sM);} else {sqr = "";sq2 = "";}
        
//      stmt.executeUpdate(sqr);
      p.l(sq2);
      stmt.executeUpdate(sq2);
      stmt.close();
      c.commit();
      c.close();
      
    } catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//      System.exit(0);
    }
      
  }
 
 



}
