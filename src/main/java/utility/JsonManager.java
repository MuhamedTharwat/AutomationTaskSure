package utility;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonManager {
    FileReader jsonFileReader;
    JsonParser jsonParser;
    JsonObject jsonObject;

    public JsonManager(String path){
        try {
            jsonFileReader = new FileReader(path);

        } catch (Exception e) {
            System.out.println("Error with File");
            e.printStackTrace();
        }
    }

    public JsonObject getJsonData(){
        jsonParser = new JsonParser();
        jsonObject= jsonParser.parseReader(jsonFileReader).getAsJsonObject();
        return jsonObject;

    }
}
