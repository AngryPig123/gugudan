package gugudan.validator;

/**
 * packageName    : gugudan.v3
 * fileName       : InputValidator
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class InputValidator {

    public static boolean isRangeNumber(int targetNumber,int fromNumber, int toNumber) {
        boolean isValidDan;
        isValidDan = targetNumber >= fromNumber && targetNumber <= toNumber;
        return isValidDan;
    }

}
