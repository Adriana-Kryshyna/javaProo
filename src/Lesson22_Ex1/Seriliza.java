package Lesson22_Ex1;

import java.io.Serializable;

public class Seriliza implements Serializable {
    private String userName;
    private int age;

    public Seriliza(String userName, int age) {
        this.userName= userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
