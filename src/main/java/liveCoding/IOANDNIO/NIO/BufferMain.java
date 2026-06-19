package liveCoding.IOANDNIO.NIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferMain {
    static void main() {
        //балуюсь с баффером
//        ByteBuffer buffer = ByteBuffer.allocate(1024);
//        buffer.put((byte) 'a');
//        buffer.put((byte) 'e');
//        buffer.put((byte) 'e');
//        buffer.put((byte) 'e');
//
//        buffer.flip();
//
//
//        while (buffer.hasRemaining()) {
//            System.out.println((char) buffer.get());
//        }
//        buffer.clear();

        //todo Версия 1
        //Работа с файлом через канал
//        try (FileChannel fileChannel = FileChannel.open(Paths.get("src/main/resources/Student"), StandardOpenOption.CREATE_NEW)) {
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//            fileChannel.read(buffer);
//
//            buffer.flip();
//            while (buffer.hasRemaining()) {
//                System.out.print((char) buffer.get());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //todo Версия2
        try (FileChannel fl = (FileChannel) Files.newByteChannel(Paths.get("text.txt"), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer bt = ByteBuffer.allocate(26);
            for (int i = 0; i < bt.capacity(); i++) {
                bt.put((byte) ('A' + i));
            }
            bt.rewind();
            fl.write(bt);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //todo Версия 3
        //позволяет сразу добавлять в файл элементы из буффер
        try(FileChannel fl = (FileChannel) Files.newByteChannel(Paths.get("file.txt"),
                StandardOpenOption.CREATE,StandardOpenOption.READ,StandardOpenOption.WRITE)) {
            MappedByteBuffer mbb = fl.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < mbb.capacity(); i++) {
                mbb.put((byte) ('A' + i));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        //Запись в файл через поток
        byte[] bytes = "Hello World".getBytes();
        try(OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("123.txt")))) {
            for(byte b : bytes) {
                outputStream.write(b);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
