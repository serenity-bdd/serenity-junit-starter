package starter;

import java.util.Arrays;

public enum Persona {
    SALLY("Sally", "Smith", "1 main st", 30);

    final String firstName;
    final String lastName;
    final String address;
    final int age;

    Persona(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }


    public static Persona withName(String personaName) {
//        for(Persona persona : values()) {
//            if (persona.firstName.equalsIgnoreCase(personaName)) {
//                return persona;
//            }
//        }
//
//        throw new IllegalArgumentException("No persona found with name " + personaName);

        return Arrays.stream(values())
                .filter(persona -> persona.firstName.equalsIgnoreCase(personaName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No persona found with name " + personaName));

    }

}
