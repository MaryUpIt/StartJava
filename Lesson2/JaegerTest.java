public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();
        gipsyAvenger.setName("Gipsy Avenger");
        gipsyAvenger.setMark(6);
        gipsyAvenger.setWeight(2.5);
        gipsyAvenger.setHeight(81.7);
        gipsyAvenger.setStrenght();
        gipsyAvenger.setArmor();
        gipsyAvenger.describe();
        gipsyAvenger.move();
        gipsyAvenger.specify();
        
        Jaeger saberAthena = new Jaeger("Saber Athena", 7, 76.9, 1.6, 5, 10);
        saberAthena.setCanFly(true);
        saberAthena.describe();
        saberAthena.move();
        saberAthena.specify();
    }
}