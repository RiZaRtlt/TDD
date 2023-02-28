import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> map = new HashMap<>();

    public int add(String name, String tel) {
        map.put(name, tel);

        return map.size();
    }

    public String findByNumer(String tel) {
        return null;
    }
}
