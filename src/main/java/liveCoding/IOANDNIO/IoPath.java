package liveCoding.IOANDNIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IoPath {
    static void main() {
        try(FileWriter fileWriter = new FileWriter(new File("src/main/resources", "zaza"))) {
            fileWriter.write("йу");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader(new File("src/main/resources", "zaza"))) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(fileReader.read()); // выводит байты
            System.out.println(bufferedReader.readLine()); // выводит символы
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
