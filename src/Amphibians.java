public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
public void base2(){
    System.out.println("Название животного " + getNickname());
    System.out.println("Возраст " + getAge());
    System.out.println("Среда проживания " + getLivingEnvironment());
    }
    @Override
    public void toEat() {

    }

    @Override
    public void moveAround() {

    }

    public void hunt(){
        System.out.println("Следить за добычей, потом резко выпрыгнуть и схатить ее");

    }
}
