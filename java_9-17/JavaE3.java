 import java.util.stream.IntStream;
public class JavaE3 {

    public static void main(String[] args) {
         System.out.println("Stream.rangeClosed()");
         IntStream.rangeClosed(1, 10).forEach(i->System.out.print(i+" "));
    }
}
