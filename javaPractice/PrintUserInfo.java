package javaPractice;

public class PrintUserInfo {
    public static void main(String args[]) {
        User user = new User("박준용", 27);
        printUserInfo(user);
    }

    public static void printUserInfo(User user) {
        System.out.println(String.format("name: %s, age: %d", user.getName(), user.getAge()));
    }
}

class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}