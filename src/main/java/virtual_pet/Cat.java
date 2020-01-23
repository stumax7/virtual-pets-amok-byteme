package virtual_pet;

public class Cat {

    public Object getFeedStatus;
    private int hunger;
    private String name;
    private int boredom;
    private int health;
    private int litterBox;

    public Cat(String name) {
        this.name = name;
        this. hunger = 10;
        this.boredom = 10;
        this.health = 10;
        this.litterBox = 10;
    }
    public String getName() {
        return name;
    }

    public int hunger () {
        return hunger;
    }

    public int boredom (){
        return boredom;
    }

    public void feed() {
        hunger -= 2;
    }

    public void play(){
        boredom -= 2;
    }

    public int health(){
        return health;
    }

    public void vetVisit(){
        health += 5;
    }

    public int litterBox(){
        return litterBox;
    }

    public void cleanLitterBox(){
        litterBox -= 10;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hunger=" + hunger +
                ", name='" + name + '\'' +
                ", boredom=" + boredom +
                ", health=" + health +
                ", litterBox=" + litterBox +
                '}';
    }

    public void receiveFood() {
    }
}
