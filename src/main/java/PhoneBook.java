import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    Map<String, String> map = new HashMap<>();

    public int add(String name, String tel) {
        map.put(name, tel);

        return map.size();
    }

    public String findByNumer(String tel) {
        Optional<String> result = map.entrySet()
                .stream()
                .filter(entry -> tel.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            return result.get();
        } else {
            return "Не найдено";
        }
    }

    public String findByName(String name) {
        return map.get(name);
    }
}
