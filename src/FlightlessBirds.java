public class FlightlessBirds extends Birds{


    public FlightlessBirds(String nickname, int age, String livingEnvironment) {
        super(nickname, age, livingEnvironment);

    }
    public void base4(){
        System.out.println("Название животного " + getNickname());
        System.out.println("Возраст " + getAge());
        System.out.println("Среда проживания " + getLivingEnvironment());
    }
  public void walk(){
       System.out.println("Не может летать. Ходит по земле.");
   }

}
