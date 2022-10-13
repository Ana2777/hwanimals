public class Predators extends Mammals {
    String typeOfFood;

    public Predators(String nickname, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(nickname, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public void base1 () {
        System.out.println("Название животного " + getNickname());
        System.out.println("Возраст " + getAge());
        System.out.println("Среда проживания " + getLivingEnvironment());
        System.out.println("Скорость перемещения " + getMovementSpeed());}

        @Override
        public void toEat() {
            System.out.println("Тип пищи " + typeOfFood);
        }

        @Override
        public void moveAround() {
            System.out.println("Передвигаеся по земле");
        }

        public void hunt() {
            System.out.println("Выследить добычу и внезапно схватить ее.");
        }
    }