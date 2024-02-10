package task2;

import java.io.Serializable;

public class ToDo implements Serializable {

    private String title; // наименование задачи
    private boolean isDone; // статус задачи

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
        isDone = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
