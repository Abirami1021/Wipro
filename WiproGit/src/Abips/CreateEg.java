package Abips;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateEg {

    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter f = new FileWriter("Tech.txt",true);
            f.write("\nHey");
            f.write("\nDude");
            f.close();

            // 📖 Reading from file
            BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));
            String line = br.readLine();
            System.out.println(line);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
