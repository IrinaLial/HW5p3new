package flower;

import java.io.FileWriter;
        import java.io.IOException;

public class MyFileWriter {
    public MyFileWriter ( String path ) {
        this.path = path;
    }

    String path = "files/store_save.txt";;

    public void write(String text) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

