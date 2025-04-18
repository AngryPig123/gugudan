package todo;

import todo.common.console.ConsoleInputHandler;
import todo.common.console.ConsoleMenu;
import todo.common.console.ConsolePrinter;

/**
 * packageName    : todo
 * fileName       : TodoApplication
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class TodoApplication {


    public static void run() {

        String todoMenu = ConsoleMenu.getMenuDescription();
        ConsolePrinter.println(todoMenu);
        selectMenu();

    }

    private static void selectMenu() {
        String selectedMenuNumber = ConsoleInputHandler.inputValue();
        System.out.println(selectedMenuNumber);
    }

}
