
import java.util.HashMap;

public class MediumResurant {
    public static void main(String[] args) {
        String[] orders = {
                "Pizza", "Burger", "Pizza",
                "Sushi", "Burger", "Pizza"
        };

        HashMap<String, Integer> map = new HashMap<>();
        
        for (String order : orders) {
            map.put(order, map.getOrDefault(order, 0) + 1);
        }
        System.out.println(map);
    }
}
/* 
    for (String order : orders) {
            map.put(order, map.getOrDefault(order, 0) + 1);
        }

    loop1:
    map.getOrDefault("Pizza",0) -> 0
    0 + 1 = 1
    map = {Pizza=1}

    loop2:
    map.getOrDefault("Burger",0) -> 0
    0 + 1 = 1
    map = {Pizza=1,Burger=1}

    loop3:
    map.getOrDefault("Pizza", 0) -> 1
    1 + 1 = 2
    map = {Pizza=2, Burger=1}

    loop4:
    map.getOrDefault("Sushi", 0) -> 0
    1 + 0 = 1
    map = {Pizza=2, Burger=1, sushi=1}

    loop5:
    map.getOrDefault("Burger", 0) -> 1
    1 + 1 = 2
    map = {Pizza=2, Burger=2, sushi=1}

    loop6:
    map.getOrDefault("Pizza", 0) -> 2
    2 + 1 = 3
    map = {Pizza=3, Burger=2, sushi=1}

*/