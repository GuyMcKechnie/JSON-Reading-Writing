import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class WritePerson {
    public static void main(String[] args) {
        try {
            JSONObject jsonObject = new JSONObject();
            //General
            jsonObject.put("name", "Benjamin Watson");
            jsonObject.put("age", 31);
            jsonObject.put("isMarried", true);
            //Hobbies
            JSONArray hobbiesArray = new JSONArray();
            hobbiesArray.add("Football");
            hobbiesArray.add("Swimming");
            jsonObject.put("hobbies", hobbiesArray);
            //Kids
            JSONObject billyObject = new JSONObject();
            billyObject.put("name", "Billy");
            billyObject.put("age", 5);
            JSONObject millyObject = new JSONObject();
            millyObject.put("name", "Milly");
            millyObject.put("age", 3);
            JSONArray kidsArray = new JSONArray();
            kidsArray.add(billyObject);
            kidsArray.add(millyObject);
            jsonObject.put("kids", kidsArray);
            //Output
            try {
                FileWriter fileWriter = new FileWriter("PersonDetails.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("File has been created!\n" + jsonObject);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
