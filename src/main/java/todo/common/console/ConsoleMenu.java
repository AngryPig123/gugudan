package todo.common.console;

/**
 * packageName    : todo.common.console
 * fileName       : ConsoleMenu
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class ConsoleMenu {

    public static String getMenuDescription() {
        return """
                아래 메뉴에서 메뉴 번호를 입력해 주세요. ex) 1
                (1) 할일 등록
                (2) 할일 완료 처리
                (0) 애플리케이션 종료
                """.trim();
    }

}
