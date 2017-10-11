package junit;

import com.github.izerui.ucloud.ApiClient;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestExemple {

    private ApiClient client = new ApiClient("",
            "");

    @Test
    public void test01() throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("ProjectId", "org-skwhwp");
        params.put("Zone", "cn-gd-02");
        params.put("Region", "cn-gd");
        params.put("ResourceId", "uhost-gyrxap");
        params.put("ResourceType", "uhost");
        params.put("MetricName.0", "MemUsage");
        params.put("Action", "GetMetric");

        String execute = client.execute(params);

        System.out.println(execute);
    }
}
