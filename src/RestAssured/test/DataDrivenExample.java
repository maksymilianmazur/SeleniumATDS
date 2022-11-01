package test;

import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DataDrivenExample {
    @Test
    //stworzenie Hashmapy, a następnie włożenie jej do JSONObject
    public void post_1() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Maksymilian");
        map.put("job","Software Tester");
        System.out.println(map);
        JSONObject request = new JSONObject(map);
        System.out.println(request);
    }

}
