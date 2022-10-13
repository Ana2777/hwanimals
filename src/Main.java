public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("gazelle", 5, "Африка", 40, "Листики");
        gazelle.base();
        gazelle.toEat();
 Herbivores giraffe = new Herbivores("giraffe", 2, "Африка", 5, "Акации");
 giraffe.base();
 giraffe.toEat();
 Herbivores horse = new Herbivores("horse", 4, "Конюшня", 150, "Сено");
horse.base();
horse.toEat();

 Predators hyena = new Predators("hyena", 1, "Пустыня", 20, "Мясо");
 hyena.base1();
 hyena.toEat();
        Predators tiger = new Predators("tiger", 4, "Трипики", 25, "Мясо и рыба");
        tiger.base1();
        tiger.toEat();
        Predators bear = new Predators("bear", 6, "Лес", 10, "Рыба и мед");
bear.base1();
bear.toEat();

        Amphibians frog = new Amphibians("frog", 1, "Болото");
        frog.base2();
        frog.hunt();
        Amphibians alreadyFreshwater = new Amphibians("alreadyFreshwater", 1, "Озеро");
alreadyFreshwater.base2();
alreadyFreshwater.hunt();

        FlyingBirds seagull = new FlyingBirds("seagull", 3, "У моря");
seagull.base3();
seagull.toFly();
        FlyingBirds albatross = new FlyingBirds("albatross", 2, "У моря");
albatross.base3();
albatross.toFly();
        FlyingBirds falcon = new FlyingBirds("falcon", 10, "в горах");
falcon.base3();
falcon.toFly();

FlightlessBirds peacock = new FlightlessBirds("peacock", 5, "Джунгли");
peacock.base4();
peacock.walk();
        FlightlessBirds penguin = new FlightlessBirds("penguin", 14, "Северный полюс");
        penguin.base4();
        penguin.walk();
        FlightlessBirds dodo = new FlightlessBirds("dodo", 3, "Тропики");
dodo.base4();
        dodo.walk();

    }
}