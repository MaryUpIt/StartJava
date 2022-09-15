public class Wolf {
    private String name;
    private boolean isMale;
    private int age;
    private double weight;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Неправильный возраст");
        } else {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public boolean getMale() {
        return isMale;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Волк гуляет.");
    }

    public void sit() {
        System.out.println("Волк сидит.");
    }

    public void wail() {
        System.out.println("Волк воет.");
    }

    public void run() {
        System.out.println("Волк бежит.");
    }

    public void hunt() {
        System.out.println("Волк охотится.");
    }
}
