package petadoption;

public class Cat extends Pet {
    private boolean isIndoor;

    public Cat(String name, int age, String breed, boolean isIndoor) {
        super(name, age, breed);
        this.isIndoor = isIndoor;
    }

    @Override
    public void showDetails() {
        System.out.println("\n[Cat] \nName: " + name + ", \nAge: " + age + ", \nBreed: " + breed + ", \nIndoor: "
                + isIndoor + ", \nAdopted: " + isAdopted);
    }
}