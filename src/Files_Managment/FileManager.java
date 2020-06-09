/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files_Managment;

import Questions.ListeQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

/**
 *
 * @author remyc
 */
public class FileManager {
    private final String Prjt_path =    "";
    private final String VF_path =      Prjt_path + "Questions\\VF";
    private final String RC_path =      Prjt_path + "Questions\\RC";
    private final String QCM_path =     Prjt_path + "Questions\\QCM";
    
    private final String Questions_path =   Prjt_path + "Questions";
    private final String CultG_path =       Prjt_path + "Questions\\Culture Générale";
    
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
            System.out.println("\tPath does not exist");
            npe.printStackTrace();
        }
        
    }

    
    
    public void ajouterListeQuestions (String fileName, ListeQuestions lq) {
        try {
            File file = new File(Questions_path + "\\"+fileName+".txt");
            FileOutputStream fop = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fop);

            if (!file.exists()) file.createNewFile();
            oos.writeObject(lq);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }    
    
    public ListeQuestions getListeQuestionsFromFile (String fileName) {
        File file = new File(Questions_path + "\\"+fileName+".txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                ObjectInputStream ois = new ObjectInputStream(fis);
                try {
                    return (ListeQuestions) ois.readObject();
                }
                catch (ClassNotFoundException cnfe) {
                    cnfe.printStackTrace();
                }
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        
        return null;
    }
    
    /**
    public Question<VF> VFFromFile (String fileName) {
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
                return new Question<>(1,new VF(question, ca));
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
    
    public Question<RC> RCFromFile (String fileName) {
        if (DEBBUGING) System.out.println("Reading RC from file");
        try {
            FileReader fr = new FileReader(RC_path + fileName);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                String question = br.readLine();
                return new Question<>(1, new RC( question, br.readLine()));
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
    
    public Question<QCM> QCMFromFile (String fileName) {
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
                return new Question<>(1, new QCM(question, correctAnswer, r1, r2, r3, r4));
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
    */
    
    
}
