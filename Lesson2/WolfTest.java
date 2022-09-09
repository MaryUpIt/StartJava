public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "Гоша";
        wolf.isMale = true;
        wolf.age = 2;
        wolf.weight = 47.5;
        wolf.color = "серый";
        if (!wolf.isMale){
            System.out.println(wolf.name + " " + wolf.color + " самка");
        } else {
            System.out.println(wolf.name + " " + wolf.color + " самец");
        }
        System.out.println("возраст: " + wolf.age + " вес: " + wolf.weight);
        wolf.walk();
        wolf.sit();
        wolf.wail();
        wolf.run();
        wolf.hunt();
    }
}
