/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_Managment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import Questions.Type.VF;
import Questions.Type.RC;
import Questions.Type.QCM;

/**
 *
 * @author remyc
 */
public class FileManager {
    
    boolean DEBBUGING = true;
    
    
    public void DisplayDir (String directory) {
        System.out.println("\tContent of directory:\n\t" + directory);
        File f = new File(directory);
        
        String[] filenames = f.list();
        for(String filename : filenames){
            System.out.println(" -> " + filename);
        }
    }
    
    
    public VF VFFromFile (String path) {
        if (DEBBUGING) System.out.println("Reading VF rom file");
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                boolean ca;
                if (br.readLine().compareToIgnoreCase("T") == 0) {
                    ca = true;
                }
                else {
                    ca = false;
                }
                return new VF(question, ca);
            }
            catch(IOException ioe) {
                System.out.println(ioe);
            }
            
            return null;
        }
        catch(FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
        
        return null;
    }
    
    
    public RC RCFromFile (String path) {
        if (DEBBUGING) System.out.println("Reading RC rom file");
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                return new RC(question, br.readLine());
            }
            catch(IOException ioe) {
                System.out.println(ioe);
            }
            
            return null;
        }
        catch(FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
        
        return null;
    }
    
    
    public QCM QCMFromFile (String path) {
        if (DEBBUGING) System.out.println("Reading RC rom file");
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                String r1 = br.readLine();
                String r2 = br.readLine();
                String r3 = br.readLine();
                return new QCM(question, r1, r2, r3, br.readLine());
            }
            catch(IOException ioe) {
                System.out.println(ioe);
            }
            
            return null;
        }
        catch(FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
        
        return null;
    }
    
}
