package JavaStreams;
import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        String sourceFile = "largefile.dat";
        String destFileBuffered = "copy_buffered.dat";
        String destFileUnbuffered = "copy_unbuffered.dat";

        // Buffered Copy
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFileBuffered))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Buffered copy took: " + (endTime - startTime) / 1_000_000 + " ms");
        }

        // Unbuffered Copy
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFileUnbuffered)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Unbuffered copy took: " + (endTime - startTime) / 1_000_000 + " ms");
        }
    }
}
