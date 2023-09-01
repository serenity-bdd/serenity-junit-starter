package starter;

import java.time.LocalDate;

public class BusinessUser extends SystemUser {

    private Flavor favoriteFlavor;

    public BusinessUser(String username, String password, String firstName, String lastName, String email, Flavor favoriteFlavor, LocalDate dateOfBirth) {
        super(username, password, firstName, lastName, email, dateOfBirth);
        this.favoriteFlavor = favoriteFlavor;
    }

    @Override
    public void cancelAccount() {
        super.cancelAccount();
        System.out.println("Business account cancelled");
    }
}
