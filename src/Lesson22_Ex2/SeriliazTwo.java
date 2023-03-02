package Lesson22_Ex2;

import java.io.Serializable;

public class SeriliazTwo implements Serializable {
    String  penguin ;
    int how_many;
    Creature shark;

    public SeriliazTwo(String penguin, int how_many, Creature shark) {
        this.penguin = penguin;
        this.how_many = how_many;
        this.shark = shark;
    }
}
class  Creature implements Serializable{
    String who;

    public Creature(String who) {
        this.who = who;
    }
}