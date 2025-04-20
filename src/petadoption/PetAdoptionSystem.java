package petadoption;

import java.util.ArrayList;
import java.util.List;

public class PetAdoptionSystem {
    private List<Pet> petList = new ArrayList<>();

    public void addPet(Pet pet) {
        petList.add(pet);
        System.out.println("\n" + pet.getName() + " added to system :)");
    }

    public void showAvailablePets() {
        System.out.println("\n----- Available Pets -----");
        for (Pet pet : petList) {
            if (!pet.isAdopted()) {
                pet.showDetails();
            }
        }
    }

    public Pet findPetByName(String name) {
        for (Pet pet : petList) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }
}