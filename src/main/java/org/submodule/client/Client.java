package org.submodule.client;

import org.submodule.api.ApiConfig;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello from Client!");
        var apiConfig = new ApiConfig();
        apiConfig.setName("Api");
        apiConfig.setValue("Value");
        System.out.println("Api Name : " + apiConfig.getName() + " Value : " + apiConfig.getValue());
    }
}
