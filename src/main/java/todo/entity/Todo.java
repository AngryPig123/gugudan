package todo.entity;

import java.time.LocalDate;

/**
 * packageName    : todo.entity
 * fileName       : Todo
 * author         : AngryPig123
 * date           : 25. 4. 19.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 4. 19.        AngryPig123       최초 생성
 */
public class Todo {

    private String title;
    private LocalDate localDate;

    public Todo() {
    }

    public Todo(String title, LocalDate localDate) {
        this.title = title;
        this.localDate = localDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", localDate=" + localDate +
                '}';
    }

}
