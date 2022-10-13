public class Mammals extends Animals{
private String livingEnvironment;
private double movementSpeed;

    public Mammals(String nickname, int age, String livingEnvironment, double movementSpeed) {
        super(nickname, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()){
            this.livingEnvironment = "Не указан тип передвижения";
        } else {
            this.livingEnvironment = livingEnvironment;}
       if (movementSpeed <= 0){
           System.out.println("Скорость не может быть нулевой или отрицательной");
       } else {
        this.movementSpeed = movementSpeed;}
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public void toEat(){
        System.out.println("Есть");
    }

    @Override
    public void moveAround() {
        System.out.println("Бегает по земле");
    }

    public void walk(){
        System.out.println("Идти");
    }

}


