package todo.common.exception;

/**
 * packageName    : todo.common.exception
 * fileName       : PastDueDateException
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class PastDueDateException extends RuntimeException {
    private final static String MESSAGE_PAST_DUE_DATE = "할 일 수행 날짜는 현재 날짜보다 크거나 같아야 합니다.";

    public PastDueDateException() {
        super(MESSAGE_PAST_DUE_DATE);
    }
}
