package com.example;

import spark.Spark;

public class App {
    public static void main(String[] args) {
      
        Spark.port(8085);
        
        // Define a route to handle GET requests to the root path
        Spark.get("/", (req, res) -> "Hello NTI students");
    }
}
