package gugudan.v4;

import gugudan.common.ConsoleInputHandler;
import gugudan.common.ConsolePrinter;
import gugudan.validator.InputValidator;

import java.util.Scanner;

import static gugudan.v4.GuGuDanCalculator.MAX_DAN;
import static gugudan.v4.GuGuDanCalculator.MIN_DAN;

/**
 * packageName    : gugudan
 * fileName       : GuGuDanApplicationV4
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanApplicationV4 {

    private static boolean IS_VALID_DAN = false;

    public static void main(String[] args) {

        GuGuDanCalculator guGuDanCalculator = new GuGuDanCalculator();

        while (!IS_VALID_DAN) {

            try {

                int dan = ConsoleInputHandler.inputValue();
                GuGuDanValidator.validateDan(dan);
                String danResult = guGuDanCalculator.makeDanResult(dan);
                ConsolePrinter.println(danResult);
                stopApplication();

            } catch (Exception e) {

                System.out.println("값을 다시 입력해 주세요.");
                ConsoleInputHandler.clearInputValue();

            }

        }

    }

    private static void stopApplication() {
        IS_VALID_DAN = true;
    }

}
