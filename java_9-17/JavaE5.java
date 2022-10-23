import java.util.stream.Stream;

public class JavaE5 {

    

    public static void main(String[] args) {


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(e -> e > 8)
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Value doesn't exists"));


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(e -> e > 8)
                .findFirst()
                .orElseThrow();
    }
}
