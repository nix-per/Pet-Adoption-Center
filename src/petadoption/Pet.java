package petadoption;

public abstract class Pet {
    protected String name;
    protected int age;
    protected String breed;
    protected boolean isAdopted;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isAdopted = false;
    }

    public abstract void showDetails();

    public void markAdopted() {
        this.isAdopted = true;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public String getName() {
        return name;
    }
}