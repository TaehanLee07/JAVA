package hash;

import java.util.HashMap;

public class hashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("abc", 10);
        hashMap.put("bbb", 20);
        hashMap.put("aaa", 30);
        hashMap.put("abc", 15); // 기존키의 value 인 10 대신 15가 들어간다

        System.out.println(hashMap.isEmpty()); // false
        System.out.println(hashMap.get("abc")); // 15
        System.out.println(hashMap.containsKey("abc")); // true
        hashMap.remove("abc");
        System.out.println(hashMap.containsKey("abc")); // false
        System.out.println(hashMap.size()); // 2
        hashMap.clear();
        System.out.println(hashMap.isEmpty()); // true
        System.out.println(hashMap.size()); // 0
    }
}
