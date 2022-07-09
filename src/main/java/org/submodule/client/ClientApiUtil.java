package org.submodule.client;

import org.submodule.api.ApiConfig;

public class ClientApiUtil {

    public static ApiConfig getApiConfig() {
        var apiConfig = new ApiConfig();
        apiConfig.setName("API");
        apiConfig.setValue("VALUE");
        return apiConfig;
    }
}
