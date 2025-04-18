package gugudan.common;

import java.util.Scanner;

/**
 * packageName    : gugudan.v3
 * fileName       : ConsoleInputHandler
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class ConsoleInputHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputValue() {
        System.out.print("> 단을 입력해 주세요 (2-9) : ");
        return scanner.nextInt();
    }

    public static void clearInputValue() {
        scanner.nextLine();
    }

}
