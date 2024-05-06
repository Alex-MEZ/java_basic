import java.io.*;

class MyProgram implements Serializable {
    private String name;
    private String lastname;

    public MyProgram(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Lastname: " + lastname;
    }
}

public class MySerialization {
    public static void main(String[] args) {
        MyProgram obj = new MyProgram("Alex", "Ezer");

//        File directory = new File("myserialization");
//        if (!directory.exists()) {
//            if (directory.mkdirs()) {
//                System.out.println("Директория успешно создана");
//            } else {
//                System.out.println("Не удалось создать директорию");
//                return;
//            }
//        }
//
//        File file = new File("myserialization/myobject.txt");
        File file = new File("myobject.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан");
            }
        } catch (IOException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
            return;
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(obj);
            System.out.println("Информация успешно добавлена");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось выполнить операцию записи: " + e.getMessage());
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            MyProgram readObj = (MyProgram) inputStream.readObject();
            System.out.println("Считанная информация из файла: " + readObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}

