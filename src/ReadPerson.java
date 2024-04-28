import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadPerson {
    public static void main(String[] args) {
        // Create an ArrayList to store Child objects.
        ArrayList<Child> childArrayList = new ArrayList<Child>();

        try {
            // Create a JSONParser instance to parse JSON data.
            JSONParser jsonParser = new JSONParser();

            // Parse the JSON data from a file and convert it into a JSONObject.
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("PersonDetails.json"));

            // Extract the JSONArray corresponding to the "kids" key from the main JSONObject.
            JSONArray childArray = (JSONArray) jsonObject.get("kids");

            // Create an iterator for the JSONArray to iterate through each child.
            Iterator iterator = childArray.iterator();

            // Loop through each child in the JSONArray.
            while (iterator.hasNext()) {
                // Convert the iterated object to JSONObject representing a single child.
                JSONObject childObject = (JSONObject) iterator.next();

                // Extract the name and age values from the child JSONObject.
                String firstName = (String) childObject.get("name");
                long childAge = (long) childObject.get("age");

                // Create a new Child object using the extracted name and age.
                Child child = new Child(firstName, childAge);

                // Add the newly created Child object to the ArrayList.
                childArrayList.add(child);
            }

            // Extract the name, age, and marital status from the main JSONObject.
            String name = (String) jsonObject.get("name");
            long age = (long) jsonObject.get("age");
            boolean maritalStatus = (boolean) jsonObject.get("isMarried");

            // Extract the ArrayList of hobbies from the main JSONObject.
            ArrayList<String> hobbiesArrayList = (ArrayList<String>) jsonObject.get("hobbies");

            // Create a new Person object using the extracted details and the list of Child objects.
            Person person = new Person(name, age, maritalStatus, hobbiesArrayList, childArrayList);

            // Print the Person object's data.
            System.out.println(person);
        } catch (Exception e) {
            // Print the stack trace of any exceptions that occur during execution.
            e.printStackTrace();
        }
    }
}
