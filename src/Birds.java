public class Birds extends Animals{
    private String livingEnvironment;

    public Birds(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()){
            this.livingEnvironment = "Не указан тип передвижения";
        } else {
        this.livingEnvironment = livingEnvironment;}

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
