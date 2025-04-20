package petadoption;

public class AdoptionApplication {
    private User applicant;
    private Pet pet;

    public AdoptionApplication(User applicant, Pet pet) {
        this.applicant = applicant;
        this.pet = pet;
    }

    public void processApplication() {
        if (!pet.isAdopted()) {
            pet.markAdopted();
            System.out.println("\n" + applicant.getName() + " has successfully adopted " + pet.getName() + "!!");
        } else {
            System.out.println("\nSorry, " + pet.getName() + " is already adopted :)");
        }
    }
}