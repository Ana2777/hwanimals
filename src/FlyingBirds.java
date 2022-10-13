public class FlyingBirds extends Birds{


    public FlyingBirds(String nickname, int age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);

    }
    public void base3(){
        System.out.println("Название животного " + getNickname());
        System.out.println("Возраст " + getAge());
        System.out.println("Среда проживания " + getLivingEnvironment());
    }

public void toFly(){
    System.out.println("Летит");
}
}
