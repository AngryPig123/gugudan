package gugudan.v4;

import gugudan.validator.InputValidator;

import static gugudan.v4.GuGuDanCalculator.MIN_DAN;
import static gugudan.v4.GuGuDanCalculator.MAX_DAN;

/**
 * packageName    : gugudan.v4
 * fileName       : GuGuDanValidator
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanValidator {

    public static void validateDan(int dan) {
        if (!InputValidator.isRangeNumber(dan, MIN_DAN, MAX_DAN)) {
            throw new RuntimeException("Out of range number");
        }
    }

}
