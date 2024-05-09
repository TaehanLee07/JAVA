package removeControlflag.after;

import java.io.*;
import java.util.*;

public class SimpleDataBase2 {

    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase2(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        boolean reading = false;
        String line;

        while (!reading) {
            line = br.readLine();
            if(line == null) { // temp 가 비어있으면
                reading = true;
                break;
            }

            int index = line.indexOf("="); // = 의 인덱스를 찾은후 앞은 key 뒤에 값은 value로 처리하기 위한 코드
            if (index > 0) { // 이렇게 코드를 작성하면 아래 else문을 쓸 필요가 없다!! 이것이 최적화
                String key = line.substring(0,index);
                String value = line.substring(index+1,line.length());

                map.put(key, value);
            }

        }
    }

    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

    public String getValue(String key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
