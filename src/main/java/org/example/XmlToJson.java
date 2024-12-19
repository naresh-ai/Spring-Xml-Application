package org.example;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlToJson {
    public static void main(String[] args) throws IOException {
        String root = "root";


        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/Xml.xml")));


        JSONObject jsonObject = XML.toJSONObject(jsonString);

        String formattedJson = jsonObject.toString(4);
        System.out.println(formattedJson);
    }
}


