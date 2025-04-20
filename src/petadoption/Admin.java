package petadoption;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void addPet(PetAdoptionSystem system, Pet pet) {
        system.addPet(pet);
    }
}