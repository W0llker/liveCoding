package liveCoding.IOANDNIO.NIO;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class WriteBuffer {
    static void main() {
        //todo Вариант 1
//        int lenght;
//        try (SeekableByteChannel seek = (SeekableByteChannel) Files.newByteChannel(Paths.get("text.txt"))) {
//            ByteBuffer buf = ByteBuffer.allocate(1024);
//            do {
//                lenght = seek.read(buf);
//                if (lenght != -1) {
//                    buf.rewind();
//                    for (int i = 0; i < lenght; i++) {
//                        System.out.print((char) buf.get());
//                    }
//                }
//            } while (lenght != -1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //todo Вариант 2
//        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("text.txt"))) {
//            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
//            for (int i = 0; i < channel.size(); i++) {
//                System.out.print((char) buffer.get(i));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //КОпирование файла
        try {
            Path path = Paths.get("text.txt"), fileEnd = Paths.get("123.txt");
            Files.copy(path, fileEnd, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
