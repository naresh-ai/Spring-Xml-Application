package org.example;



import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToXml {
    public static void main(String[] args) throws IOException  {



        String jsonInput = new String(Files.readAllBytes(Paths.get("src/main/resources/JsonFile.json")));

        JSONObject jsonObject = new JSONObject(jsonInput);
        String xmlOutput = XML.toString(jsonObject);

        System.out.println("Converted XML:");
        System.out.println(xmlOutput);



//        String root="root";
//        Path path = Paths.get("src/main/resources/JsonFile.json");
//
//        String stringJson = Files.readAllLines(path).toString();
//
//        JSONObject json = new JSONObject(stringJson);
//
//        System.out.println(XML.toString(json));
//
//        System.out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(json) + "</"+root+">");

    }
}

/*import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToXml {
    public static void main(String[] args) {
        try {
            String root = "root";
            Path path = Paths.get("src/main/resources/jsonfile.json");

            // Read JSON file content
            String stringJson = Files.readAllLines(path).toString();
            System.out.println("File content: " + stringJson); // Debugging step

            // Validate file content
            if (stringJson.trim().isEmpty()) {
                throw new JSONException("JSON file is empty!");
            }

            // Parse JSON
            JSONObject json = new JSONObject(stringJson);

            // Convert JSON to XML
            String xmlContent = XML.toString(json);

            // Print XML with root tag
            System.out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<" + xmlContent + ">" + xmlContent + "</" + root + ">");
        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }
    }
}*/

