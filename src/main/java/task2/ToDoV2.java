package task2;

import java.io.*;

public class ToDoV2 implements Serializable {
    private String title; // наименование задачи
    private boolean isDone; // статус задачи

    public ToDoV2() {
    }

    public ToDoV2(String title) {
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

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(title);
//        out.writeBoolean(isDone);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        title = (String) in.readObject();
//        isDone = in.readBoolean();
//    }
}
