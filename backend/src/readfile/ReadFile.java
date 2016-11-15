import java.io.*;
import java.util.Scanner;

public class ReadFile
{
    private String filePath;
    public static void main(String[] args)
    {
        try {
            readFile("C:\\\\chris\\Desktop\\new.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void readFile(String path) throws FileNotFoundException
    {
        Scanner fileIn = new Scanner(new File(path));
        while (fileIn.hasNextLine())
        {
            System.out.println(fileIn.nextLine());
        }
    }

}