public class Jaeger {
    private String modelName;
    private int mark;
    private double weight;
    private double height;
    private int strenght;
    private int armor;
    private boolean canFly;

    public Jaeger() {
    }

    public Jaeger(String modelName, int mark, double height, double weight, int armor, int strenght) {
        this.modelName = modelName;
        this.mark = mark;
        this.weight = weight;
        this.height = height;
        this.strenght = strenght;
        this.armor = armor;
    }

    public void setName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArmor() {
        if (height >= 80 && weight >= 2.0) {
            armor = 10;
        } else {
            armor = 7;
        }
    }

    public void setStrenght() {
        if (height >= 80 && weight >= 2.0) {
            strenght = 10;
        } else {
            strenght = 7;
        }
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void descriptions() {
        System.out.println("\nWar Titan: \"" + modelName + "\". Model \"Mark-" + mark + 
            "\"\nHeight: " + height + " Weight: " + weight + 
            "\nArmor: " + armor + " Strength: " + strenght);
    }

    public void move() {
        System.out.println("\nTitan's peculiar properties:");
        if (weight <= 2.0) {
            System.out.printf("Titan %s is small and speedy.\n", modelName);
        } else {
            System.out.printf("Titan %s is big and slowly.\n", modelName);
        }
        if (canFly) {
            System.out.printf("Titan %s can fly.\n", modelName);
        }
    }

    public void destination() {
        System.out.print("\nTitan's destinations: ");
        if (strenght > 7) {
            System.out.printf("\nTitan %s is strength",modelName);
            if(weight < 2) {
                System.out.println(" and fast.\nIts well to fast attack operations.");
            } else {
                System.out.println(" and hardy.\nIts well to long attack operations.");
            }
        } else {
            System.out.printf("\nTitan %s well to pacific missions.", modelName);
        }
        if (armor >= 7) {
            System.out.println("Its well to defence missions.");
        } else {
            if (height < 80) {
                System.out.println("Its well to steels missions.");
            } else {
                System.out.println();
            }
        }
    }
}

