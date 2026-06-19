package liveCoding.IOANDNIO;

import java.io.*;
import java.util.Scanner;

public class MainIo {
    static void main() {
        InputStream inputStream = System.in; // для ввода данных используется
        OutputStream outputStream = System.out; // для вывола данных

        BufferedInputStream bf = new BufferedInputStream(inputStream);
        PrintStream bo = new PrintStream(outputStream);
//        try {
//            char a;
//            do {
//                a = (char) bf.read();
//                System.out.println(a);
//            } while (a != -1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        bo.println("123");
        System.out.println("12345");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
