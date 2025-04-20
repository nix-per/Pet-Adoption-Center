package petadoption;

public class Main {
    public static void main(String[] args) {
        // Initializing the system & the admin :
        PetAdoptionSystem system = new PetAdoptionSystem();
        Admin admin = new Admin("Shelter Admin", "admin@shelter.org");

        // Admin adds a Dog "Buddy" and a Cat "Whiskers" :
        admin.addPet(system, new Dog("Buddy", 2, "Labrador", true));
        admin.addPet(system, new Cat("Whiskers", 3, "Siamese", true));

        // User "Alice" views available pets :
        User alice = new User("Alice", "alice@example.com");
        system.showAvailablePets();

        // Alice adopts Buddy successfully :
        Pet buddy = system.findPetByName("Buddy");
        if (buddy != null) {
            AdoptionApplication appAlice = new AdoptionApplication(alice, buddy);
            appAlice.processApplication();
        }

        // User "Bob" tries to adopt Buddy, but gets "already adopted" message :
        User bob = new User("Bob", "bob@example.com");
        Pet buddyAgain = system.findPetByName("Buddy");
        if (buddyAgain != null) {
            AdoptionApplication appBob = new AdoptionApplication(bob, buddyAgain);
            appBob.processApplication(); // should show already adopted
        }

        // Admin adds a new Dog "Rocky" :
        admin.addPet(system, new Dog("Rocky", 1, "Beagle", false));

        // Bob now adopts Rocky successfully :
        Pet rocky = system.findPetByName("Rocky");
        if (rocky != null) {
            AdoptionApplication appBob2 = new AdoptionApplication(bob, rocky);
            appBob2.processApplication();
        }

        // Final list of pets :
        system.showAvailablePets();
    }
}
