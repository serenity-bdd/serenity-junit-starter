package starter;

import java.time.LocalDate;

public class ServiceAccount extends SystemUser{
    LocalDate dateOfExpiry;

    public ServiceAccount(String username, String password, String firstName, String lastName, String email, Flavor favoriteFlavor, LocalDate dateOfBirth, LocalDate dateOfExpiry) {
        super(username, password, firstName, lastName, email, dateOfBirth);
        this.dateOfExpiry = dateOfExpiry;
    }

}
