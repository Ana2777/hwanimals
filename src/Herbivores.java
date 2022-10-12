public class Herbivores extends Mammals{
    String typeOfFood;

    public Herbivores(String nickname, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(nickname, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public void toEat() {
        super.toEat();
    }

    @Override
    public void walk() {
        super.walk();
    }

    void graze(){  }
}