public abstract class  Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        if (nickname == null || nickname.isBlank() || nickname.isEmpty()){
            System.out.println("Не указано имя");
        } else {
        this.nickname = nickname;}
        if (age <= 0){
            System.out.println("Ошибка! Введите возраст животного");
        } else {
            this.age = age;}
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void toEat();

    public void sleep(){

    }
    public abstract void moveAround();
}
