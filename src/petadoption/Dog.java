package petadoption;

public class Dog extends Pet {
    private boolean isTrained;

    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
    }

    @Override
    public void showDetails() {
        System.out.println("\n[Dog] \nName: " + name + ", \nAge: " + age + ", \nBreed: " + breed + ", \nTrained: "
                + isTrained + ", \nAdopted: " + isAdopted);
    }
}