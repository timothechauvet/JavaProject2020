/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_Managment;

import Questions.Type.VF;
import Questions.Type.RC;
import Questions.Type.QCM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author remyc
 */
public class FileManager {
    private final String Prjt_path =    "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020";
    private final String VF_path =      "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\VF";
    private final String RC_path =      "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\RC";
    private final String QCM_path =     "D:\\WORK\\Efrei_L3 2019-2020\\JAVA\\JavaProject2020\\Questions\\QCM";
    
    
    boolean DEBBUGING = true;
    
    
    public void displayDir (String directory) {
        try {
            System.out.println("\n\tContent of directory:\n\t" + directory);
            File f = new File(directory);

            String[] filenames = f.list();
            for(String filename : filenames){
                System.out.println(" -> " + filename);
            }
        }
        catch (NullPointerException npe) {
            System.out.println("\nERROR:\t" + npe);
            npe.printStackTrace();
        }
        
    }
    
    
    
    public VF VFFromFile (String fileName) {
        if (DEBBUGING) System.out.println("Reading VF from file");
        try {
            FileReader fr = new FileReader(VF_path + fileName);
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
                return new VF("theme", 1, question, ca);
            }
            catch (IOException ioe) {
                System.out.println("\nERROR:\t" + ioe);
                System.out.println(ioe);
            }
            
            return null;
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("\nERROR:\t" + fnfe);
            System.out.println(fnfe);
        }
        
        return null;
    }
    
    public RC RCFromFile (String fileName) {
        if (DEBBUGING) System.out.println("Reading RC from file");
        try {
            FileReader fr = new FileReader(RC_path + fileName);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                return new RC("theme", 1, question, br.readLine());
            }
            catch(IOException ioe) {
                System.out.println("\nERROR:\t" + ioe);
                System.out.println(ioe);
            }
            
            return null;
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("\nERROR:\t" + fnfe);
            System.out.println(fnfe);
        }
        
        return null;
    }
    
    public QCM QCMFromFile (String fileName) {
        if (DEBBUGING) System.out.println("Reading RC from file");
        try {
            FileReader fr = new FileReader(QCM_path + fileName);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                String r1 = br.readLine();
                String r2 = br.readLine();
                String r3 = br.readLine();
                String r4 = br.readLine();
                int correctAnswer = Integer.parseInt(br.readLine());
                return new QCM("theme", 1, question, correctAnswer, r1, r2, r3, r4);
            }
            catch(IOException ioe) {
                System.out.println("\nERROR:\t" + ioe);
                System.out.println(ioe);
            }
            
            return null;
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("\nERROR:\t" + fnfe);
            System.out.println(fnfe);
        }
        
        return null;
    }
    
    
    
    //Ajouter une question VF
    public void ajouterQuestion (String question, boolean correctAnswer) {
        try {
            File file = new File(VF_path +"\\"+ question +".txt");
            if (!file.createNewFile()) System.out.println("\nERROR: \tfile '"+question+".txt' already exists");
            else {
                FileWriter fw = new FileWriter(file);
                fw.write(question + "\n");
                if (correctAnswer) fw.write("T");
                else fw.write("F");
                fw.close();
            }
        }
        catch (IOException ioe) {
            System.out.println("\nERROR:\t" + ioe);
            System.out.println("method called : 'public void AjouterQuestion (String question, boolean correctAnswer)'");
        }
    }
    
    //Ajouter une question RC
    public void ajouterQuestion (String question, String correctAnswer) {
        try {
            File file = new File(RC_path +"\\"+ question +".txt");
            if (!file.createNewFile()) System.out.println("\nERROR: \tfile '"+question+".txt' already exists");
            else {
                FileWriter fw = new FileWriter(file);
                fw.write(question + "\n");
                fw.write(correctAnswer);
                fw.close();
            }
        }
        catch (IOException ioe) {
            System.out.println("\nERROR:\t" + ioe);
            System.out.println("method called : 'public void AjouterQuestion (String question, String correctAnswer)'");
        }
    }
    
    //Ajouter une question QCM
    public void ajouterQuestion (String question, String r1, String r2, String r3, String r4, int correctAnswer) {
        //correctAnwser is the indx of the correct answer
        try {
            File file = new File(QCM_path +"\\"+ question +".txt");
            if (!file.createNewFile()) System.out.println("\nERROR: \tfile '"+question+".txt' already exists");
            else {
                FileWriter fw = new FileWriter(file);
                fw.write(question + "\n");
                fw.write(r1);
                fw.write(r2);
                fw.write(r3);
                fw.write(correctAnswer);
                fw.close();
            }
        }
        catch (IOException ioe) {
            System.out.println("\nERROR:\t" + ioe);
            System.out.println("method called : 'public void AjouterQuestion (String question, String r1, String r2, String r3, String correctAnswer)'");
        }
    }
    
    
    
}
