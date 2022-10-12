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

    @Override
    public void toEat() {

    }

    @Override
    public void moveAround() {

    }

    void hunt(){

    }
}
