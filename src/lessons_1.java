class MyClass {
    private int number;
    private String name;
    private double value;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Ошибка: Значение должно быть положительным");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: Значение не должно быть пустым");
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value > 0) {
            this.value = value;
        } else {
            System.out.println("Ошибка: Значение должно быть положительным");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        ClassLoader classLoader = obj.getClass().getClassLoader();
        System.out.println("Класслоадер: " + classLoader);
        System.out.println("Имя класса: " + obj.getClass().getName());
    }
}

