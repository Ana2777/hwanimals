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
public void base (){
    System.out.println("Название животного " + getNickname());
    System.out.println("Возраст " + getAge());
    System.out.println("Среда проживания " + getLivingEnvironment());
    System.out.println("Скорость перемещения " + getMovementSpeed());
}
    @Override
    public void toEat() {
        super.toEat();
        System.out.println("Тип пищи " + typeOfFood);
    }

    @Override
    public void walk() {
        System.out.println("Идти");
    }

   public void graze(){
        System.out.println("Пасется в поле и кушает траву");
    }

}