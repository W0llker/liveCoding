package liveCoding.IOANDNIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFiles {
    static void main() {
        //FileOutputStream делает по сути все тоже самое только записывает данные в файл
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("src/main/resources/Student");
//            System.out.println(fis.read());
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }


        FileOutputStream fos = null;
        char[] chars = {'q', 'w', 'e', 'r'};
        try {
            fos = new FileOutputStream("src/main/resources/zapiska");
            for (char c : chars) {
                fos.write(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
