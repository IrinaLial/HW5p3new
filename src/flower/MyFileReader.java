package flower;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyFileReader extends MyFileWriter {

    public MyFileReader(String path) {
        super(path);
    }

    public void printFile() {
        try {
            FileReader reader = new FileReader(path);

            int c;
            while((c=reader.read()) != -1){
                System.out.print((char)c);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readLines(int countOfStrings) {
        try {
            Scanner scanner = new Scanner(new FileReader(path));
            String result = "";
            for(int i = 0; i < countOfStrings; i++) {
                result += scanner.nextLine() + "\n";
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
