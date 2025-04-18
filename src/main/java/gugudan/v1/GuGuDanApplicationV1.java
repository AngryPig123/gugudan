package gugudan.v1;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : gugudan
 * fileName       : GuGuDanApplicationV1
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanApplicationV1 {

    private static final int MIN_DAN = 2;
    private static final int MAX_DAN = 9;

    private static final int MULTIPLICATION_MIN_RANGE = 1;
    private static final int MULTIPLICATION_MAX_RANGE = 9;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isValidDan = false;

        while (!isValidDan) {

            System.out.print("> 단을 입력해 주세요 (2-9) : ");
            int dan = scanner.nextInt();

            isValidDan = dan >= MIN_DAN && dan <= MAX_DAN;
            if (!isValidDan) {
                System.out.println("값을 다시 입력해 주세요.");
            } else {
                Stream.of(dan)
                        .flatMap(num -> IntStream.range(MULTIPLICATION_MIN_RANGE, MULTIPLICATION_MAX_RANGE + 1)
                                .mapToObj(row -> num + " * " + row + " = " + num * row)
                        )
                        .forEach(System.out::println);
            }

        }

    }

}
