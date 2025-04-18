package gugudan.v3;

import gugudan.common.ConsoleInputHandler;
import gugudan.common.ConsolePrinter;
import gugudan.validator.InputValidator;

import java.util.Scanner;

import static gugudan.v3.GuGuDanCalculator.MAX_DAN;
import static gugudan.v3.GuGuDanCalculator.MIN_DAN;

/**
 * packageName    : gugudan
 * fileName       : GuGuDanApplicationV2
 * author         : AngryPig123
 * date           : 25. 4. 18.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 18.        AngryPig123       최초 생성
 */
public class GuGuDanApplicationV3 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GuGuDanCalculator guGuDanCalculator = new GuGuDanCalculator();
        boolean isValidDan = false;

        while (!isValidDan) {

            try {

                int dan = ConsoleInputHandler.inputValue();
                isValidDan = InputValidator.isRangeNumber(dan, MIN_DAN, MAX_DAN);

                if (!isValidDan) {
                    String danResult = guGuDanCalculator.makeDanResult(dan);
                    ConsolePrinter.println(danResult);
                }


            } catch (Exception e) {

                System.out.println("값을 다시 입력해 주세요.");
                ConsoleInputHandler.clearInputValue();

            }

        }

    }

}
