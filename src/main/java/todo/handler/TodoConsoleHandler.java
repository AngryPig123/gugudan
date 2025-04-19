package todo.handler;


import todo.common.console.ConsoleInputHandler;
import todo.common.console.ConsolePrinter;
import todo.common.exception.BackToPreviousMenuException;
import todo.common.validator.InputValidator;
import todo.entity.Todo;
import todo.service.TodoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static todo.common.console.ConsolePrinter.println;

/**
 * packageName    : todo.handler
 * fileName       : TodoConsoleHandler
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class TodoConsoleHandler {

    private final TodoService todoService;

    private final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public TodoConsoleHandler(TodoService todoService) {
        this.todoService = todoService;
    }

    public void handle(String selectedMenuNumber) {

        switch (selectedMenuNumber) {
            case "1" -> registerTodo();
            case "2" -> completeTodo();
            case "0" -> exitApplication();
            default -> throw new IllegalArgumentException("유효한 메뉴 번호가 아닙니다 : " + selectedMenuNumber);
        }

    }

    private void registerTodo() {

        boolean registrationComplete = false;
        while (!registrationComplete) {
            try {
                String todo = inputTodo();
                String dueDate = inputDueDate();

                Todo result = todoService.registerTodo(new Todo(todo, LocalDate.parse(dueDate, DATE_TIME_FORMATTER)));

                displayRegisteredTodo(result);
                registrationComplete = true;
            } catch (BackToPreviousMenuException btpme) {
                println(btpme.getMessage());
                registrationComplete = true;
            } catch (Exception e) {
                println(e.getMessage());
            }
        }

    }

    private void displayRegisteredTodo(Todo todo) {
        println("# 할 일이 등록 되었습니다!!");
        println(todo.getTask());
        println(todo.getLocalDate().toString());
    }

    private String inputTodo() {
        boolean isCompleted = false;
        String todo = null;
        while (!isCompleted) {
            try {
                println("> 할 일을 입력하세요. 예) 숙제 하기");
                todo = ConsoleInputHandler.inputValue();
                validateTodo(todo);
                isCompleted = true;
            } catch (IllegalArgumentException iae) {
                println(iae.getMessage());
            }
        }
        return todo;
    }

    private String inputDueDate() {
        boolean isCompleted = false;
        String dueDate = null;
        while (!isCompleted) {
            try {
                println("> 할 일을 수행할 날짜를 입력하세요. 예) 2025-04-12");
                dueDate = ConsoleInputHandler.inputValue();
                validateDueDate(dueDate);
                isCompleted = true;
            } catch (IllegalArgumentException iae) {
                println(iae.getMessage());
            }
        }
        return dueDate;
    }

    private void validateTodo(String todo) {
        InputValidator.validateNotBlank(todo);
    }

    private void validateDueDate(String dueDate) {
        InputValidator.validateDate(dueDate, "^\\d{4}-\\d{2}-\\d{2}$");
    }

    private void completeTodo() {

    }

    private void exitApplication() {

    }

}
