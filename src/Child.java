public class Child {
    // Define private final fields to store the first name and age of the child.
    private final String childFirstName;
    private final int childAge;

    // Constructor for the Child class that initializes a new Child object with a name and age.
    public Child(String firstName, long age) {
        childFirstName = firstName;  // Assign the provided first name to the childFirstName field.
        childAge = (int) age;  // Convert the provided age from long to int and assign to childAge.
    }

    // Override the toString method to provide a string representation of the Child object.
    public String toString() {
        // Return the string that includes the child's name and age, formatted for clarity.
        return "Child Name: " + childFirstName +
                " | Child Age: " + childAge;
    }
}