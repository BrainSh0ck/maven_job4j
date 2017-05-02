/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportreader;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClipBoardListener extends Thread implements ClipboardOwner{
Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();  
//static Transferable out;
static String content = "";
    @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+" runned...");
    Transferable trans = sysClip.getContents(this);  
    TakeOwnership(trans);       

  }  

    @Override
  public void lostOwnership(Clipboard c, Transferable t) {  

  try {  
    ClipBoardListener.sleep(250);  //waiting e.g for loading huge elements like word's etc.
  } catch(Exception e) {  
    System.out.println("Exception: " + e);  
  }  
  Transferable contents = sysClip.getContents(this);  
    try {
        process_clipboard(contents, c);
    } catch (Exception ex) {
        Logger.getLogger(ClipBoardListener.class.getName()).log(Level.SEVERE, null, ex);
    }
  TakeOwnership(contents);


}  

  void TakeOwnership(Transferable t) {  
    sysClip.setContents(t, this);  
  }  

public void process_clipboard(Transferable t, Clipboard c) { //your implementation
    String tempText;
    Transferable trans = t;
    //out = t;
 
    try {
        if (trans != null?trans.isDataFlavorSupported(DataFlavor.stringFlavor):false) {
            tempText = (String) trans.getTransferData(DataFlavor.stringFlavor);
            if (p.head(tempText)) {
            TestSSL.Rd(tempText);
            nThread.nTh();
            } else {p.l("Set HTH!");}
        }  

    } catch (Exception e) {
    }
}

public static String setcnt () {
 // System.out.println("Fck");
    return content.trim();
    
}
}