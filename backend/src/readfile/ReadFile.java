package readfile;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class ReadFile {
    static JFrame parentFrame = new JFrame();
    private String filePath;
    static JFileChooser dialog = new JFileChooser();
    public static void main(String[] args) {
        dialog.showOpenDialog(parentFrame);
        try {
            readFile(dialog.getSelectedFile().getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File(path));
        //læser filen
        ArrayList<String> array_list = new ArrayList<>();
        //laver en arraylist
        while (fileIn.hasNextLine()) {
            array_list.add(fileIn.nextLine());
            //tilføjer hver linje i filen til arraylisten
        }
        Collections.sort(array_list);
        //sorterer arraylisten i alfabetisk orden
        dialog.showSaveDialog(parentFrame);
        try {
            PrintWriter test = new PrintWriter(dialog.getSelectedFile().getAbsolutePath());
            //laver ny fil
            for (String item : array_list) {
                test.println(item);
                //tilføjer hver element i arraylisten til filen
            }
            test.close();

        }   catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

}