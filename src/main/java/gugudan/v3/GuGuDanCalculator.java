package gugudan.v3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : gugudan.v3
 * fileName       : GuGuDanCalculator
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanCalculator {

    public static final int MIN_DAN = 2;
    public static final int MAX_DAN = 9;

    private static final int MULTIPLICATION_MIN_RANGE = 1;
    private static final int MULTIPLICATION_MAX_RANGE = 9;

    public String makeDanResult(int dan) {

        return Stream.of(dan)
                .flatMap(num -> IntStream.range(MULTIPLICATION_MIN_RANGE, MULTIPLICATION_MAX_RANGE + 1)
                        .mapToObj(row -> num + " * " + row + " = " + num * row)
                )
                .collect(Collectors.joining("\n"));
        
    }

}
