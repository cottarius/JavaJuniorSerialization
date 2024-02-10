package task1;

import java.io.*;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<UserData> users = createUsers();
        serializeObj(users, "db.bin");

        List<UserData> deserializedUsers = (List<UserData>) deserializeObj("db.bin");
        deserializedUsers.forEach(System.out::println);
    }

    static List<UserData> createUsers() {
        return List.of(new UserData("Oleg", 25, "12345678"),
                new UserData("Ivan", 30, "Qwerty123"),
                new UserData("Sergei", 35, "123Qwerty"),
                new UserData("Anna", 22, "87654321"),
                new UserData("Elena", 27, "11111111"),
                new UserData("Tom", 32, "22222222"));

    }
    public static void serializeObj(Object object, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object deserializeObj(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
