package org.submodule.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.submodule.api.ApiConfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(JUnit4.class)
public class ClientApiUtilTest {

    @Test
    public void shouldNotReturnNull() {
        var apiConfig = ClientApiUtil.getApiConfig();
        assertNotNull(apiConfig);
    }

    @Test
    public void shouldReturnEqualValue() {
        var apiConfig = new ApiConfig();
        apiConfig.setValue("VALUE");
        apiConfig.setName("NAME");
        assertEquals(ClientApiUtil.getApiConfig().getValue(), apiConfig.getValue());
    }
}
