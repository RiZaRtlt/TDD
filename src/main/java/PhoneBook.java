import java.util.*;

public class PhoneBook {
    Map<String, String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

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

    public void printAllNames() throws Exception {
        if (map.size() != 0) {
            StringBuilder buf = new StringBuilder();
            Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
            while(itr.hasNext()) {
                Map.Entry<String, String> entry = itr.next();

                buf.append(entry.getKey());
                buf.append("\n");
            }

            System.out.println(buf);
        } else {
            throw new Exception("Массив пустой");
        }
    }
}
