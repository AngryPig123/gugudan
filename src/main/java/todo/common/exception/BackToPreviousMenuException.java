package todo.common.exception;

/**
 * packageName    : todo.common.exception
 * fileName       : BackToPreviousMenuException
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class BackToPreviousMenuException extends RuntimeException {

    private final static String MESSAGE_BACK_TO_PREVIOUS_MENU = "이전 메뉴로 돌아갑니다.";

    public BackToPreviousMenuException() {
        super(MESSAGE_BACK_TO_PREVIOUS_MENU);
    }

}
