package Class27;

public class Dog {
    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed) {
        setName(name);
        setColor(color);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String toString(){
        return name+" "+breed+" "+color;
    }
}
