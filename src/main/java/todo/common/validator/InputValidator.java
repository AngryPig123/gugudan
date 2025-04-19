package todo.common.validator;

import java.util.Objects;

/**
 * packageName    : todo.common.validator
 * fileName       : InputValidator
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class InputValidator {

    private final static String MESSAGE_NOT_BLANK = "[안내] 값을 입력해 주세요.";
    private final static String MESSAGE_INVALID_DATE_FORMAT = "[안내] 유효하지 않는 날짜 형식입니다.";

    public static void validateNotBlank(String value) {
        if (Objects.isNull(value) || value.trim().isBlank()) {
            throw new IllegalArgumentException(MESSAGE_NOT_BLANK);
        }
    }

    public static void validateDate(String date, String pattern) {
        if (!date.matches(pattern)) {
            throw new IllegalArgumentException(MESSAGE_INVALID_DATE_FORMAT);
        }
    }

}
