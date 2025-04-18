package gugudan.v2;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : gugudan
 * fileName       : GuGuDanApplicationV2
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanApplicationV2 {

    private static final int MIN_DAN = 2;
    private static final int MAX_DAN = 9;

    private static final int MULTIPLICATION_MIN_RANGE = 1;
    private static final int MULTIPLICATION_MAX_RANGE = 9;

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isValidDan = false;

        while (!isValidDan) {

            int dan = inputDan();
            isValidDan = isValidDan(dan);

            if (!isValidDan) {
                System.out.println("값을 다시 입력해 주세요.");
            } else {

                Stream<String> danResult = makeDanResult(dan);
                printDan(danResult);

            }

        }

    }

    private static void printDan(Stream<String> danResult) {
        danResult.forEach(System.out::println);
    }

    private static Stream<String> makeDanResult(int dan) {
        return Stream.of(dan)
                .flatMap(num -> IntStream.range(MULTIPLICATION_MIN_RANGE, MULTIPLICATION_MAX_RANGE + 1)
                        .mapToObj(row -> num + " * " + row + " = " + num * row)
                );
    }

    private static boolean isValidDan(int dan) {
        boolean isValidDan;
        isValidDan = dan >= MIN_DAN && dan <= MAX_DAN;
        return isValidDan;
    }

    private static int inputDan() {
        System.out.print("> 단을 입력해 주세요 (2-9) : ");
        return scanner.nextInt();
    }

}
