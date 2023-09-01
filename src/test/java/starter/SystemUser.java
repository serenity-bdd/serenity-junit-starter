package starter;

import java.time.LocalDate;
import java.util.Date;

public class SystemUser {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private LocalDate dateOfBirth;

    public SystemUser(String username, String password, String firstName, String lastName, String email, LocalDate dateOfBirth) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        if (age == null) {
            age = LocalDate.now().getYear() - dateOfBirth.getYear();
        }
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void cancelAccount() {
        System.out.println("Account cancelled");
    }
}
