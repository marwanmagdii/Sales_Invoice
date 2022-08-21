/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.view.ViewFrame;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener, ListSelectionListener {
   private ViewFrame frame;
   private JTextArea ta;
   //private InvoiceFrame frame;
  // private InvoiceDialog invoiceDialog;
   //private LineDialog lineDialog;
    public Controller(ViewFrame frame) {
        this.frame = frame;
    }

    

   
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create New Invoice":
                createNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "New Item":
                newItem();
                break;
            case "Cancel":
                cancel();
                break;
            case "Load File":
                loadFile();
                break;
            case "Save File":
                saveFile();
                break;
                                  
        }
    
        
    }

    private void createNewInvoice() {
       

    }

    private void deleteInvoice() {
       

    }

    private void newItem() {

    }

    private void cancel() {

    }

    

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadFile() {
        JFileChooser fc=new JFileChooser();
        int restult =fc.showOpenDialog(frame);
        if(restult==JFileChooser.APPROVE_OPTION)
        {
            String path=fc.getSelectedFile().getPath();
            FileInputStream fis=null;
            try {
                 fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
            
                ta.setText(new String(b));
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    fis.close();
                }catch (IOException e){}
            }

        }
    }

    private void saveFile() {
       JFileChooser fc=new JFileChooser();
        int result=fc.showSaveDialog(frame);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            String path=fc.getSelectedFile().getPath();
            FileOutputStream fos=null;
            try {
                fos = new FileOutputStream(path);
                byte[] b = ta.getText().getBytes();
                fos.write(b);
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }catch (IOException e)
            {
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                }catch (IOException e){}
            }
        }
    }
        
    }

    
        
    
    
}
