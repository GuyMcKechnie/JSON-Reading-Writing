import java.util.ArrayList;

public class Person {
    // Declare and initialize private fields for the Person object properties.
    private final String nameOutput;
    private final int ageOutput;
    private final boolean maritalStatusOutput;
    private final ArrayList<String> hobbiesArrayOutput;
    private final ArrayList<Child> childArrayOutput;

    // Constructor for the Person class, initializing a Person object with provided parameters.
    public Person(String name, long age, boolean maritalStatus, ArrayList<String> hobbiesArrayList, ArrayList<Child> childArrayList) {
        nameOutput = name;  // Assign the provided name to the nameOutput field.
        ageOutput = Integer.parseInt(String.valueOf(age));  // Convert the age from long to int and assign to ageOutput.
        maritalStatusOutput = maritalStatus;  // Assign the provided marital status to the maritalStatusOutput field.
        hobbiesArrayOutput = hobbiesArrayList;  // Assign the provided list of hobbies to the hobbiesArrayOutput field.
        childArrayOutput = childArrayList;  // Assign the provided list of children to the childArrayOutput field.
    }

    // Override the toString method to provide a string representation of the Person object.
    public String toString() {
        // Concatenate and return the string representation of the Person object's data.
        return "Name: " + nameOutput +
                "\nAge: " + ageOutput +
                "\nMarried: " + maritalStatusOutput +
                "\nHobbies: " + hobbiesArrayOutput +
                "\nChildren: " + childArrayOutput;
    }
}
