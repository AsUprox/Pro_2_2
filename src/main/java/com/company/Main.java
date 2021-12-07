package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    static String JSON_TEXT = """
                {
                    "lib": [ 
                        {
                            "name": "Farewell arms",
                            "pages": 400,
                            "author": "Ernest Hemingway"
                        },
                        {
                            "name": "Moby-Dick",
                            "pages": 350,
                            "author": "Herman Melville"
                        } ]
                }
            """;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Books aaa = gson.fromJson(JSON_TEXT, Books.class);
        System.out.println(aaa);
    }
}