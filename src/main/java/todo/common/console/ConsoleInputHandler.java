package todo.common.console;

import todo.common.exception.BackToPreviousMenuException;

import java.util.Scanner;

/**
 * packageName    : todo.common.console
 * fileName       : ConsoleInputHandler
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class ConsoleInputHandler {

    private final static Scanner scanner = new Scanner(System.in);

    public static int inputIntValue() {
        return scanner.nextInt();
    }

    public static String inputValue() {
        String value = scanner.nextLine();
        preCheck(value);
        return value;
    }

    private static void preCheck(String value) {
        if (shouldBackToPrevious(value)) {
            throw new BackToPreviousMenuException();
        }
    }

    private static boolean shouldBackToPrevious(String value) {
        return value.equals(":q");
    }

}
