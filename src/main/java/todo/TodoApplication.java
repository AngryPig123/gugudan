package todo;

import todo.common.console.ConsoleInputHandler;
import todo.common.console.ConsoleMenu;
import todo.common.console.ConsolePrinter;
import todo.common.exception.BackToPreviousMenuException;
import todo.handler.TodoConsoleHandler;
import todo.repository.TodoRepository;
import todo.service.TodoService;

import static todo.common.console.ConsolePrinter.println;

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

    private final static TodoRepository todoRepository = new TodoRepository();
    private final static TodoService todoService = new TodoService(todoRepository);
    private final static TodoConsoleHandler todoConsoleHandler = new TodoConsoleHandler(todoService);

    public static void run() {

        while (true) {

            try {
                String todoMenu = ConsoleMenu.getMenuDescription();
                println(todoMenu);
                selectMenu();
            } catch (BackToPreviousMenuException | IllegalArgumentException btpme) {
                println(btpme.getMessage());
            }

        }

    }

    private static void selectMenu() {

        String selectedMenuNumber = ConsoleInputHandler.inputValue();
        todoConsoleHandler.handle(selectedMenuNumber);

    }

}
