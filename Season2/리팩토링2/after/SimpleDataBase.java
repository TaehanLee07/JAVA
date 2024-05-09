package removeControlflag.after;

import java.io.*;
import java.util.*;

public class SimpleDataBase {

    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        boolean reading = false;
        String line;

        while (!reading) {
            line = br.readLine();
            if(line == null) { // temp 가 비어있으면
                reading = true;
            } else {
                boolean scanKey = true;

                StringBuffer keyBuffer = new StringBuffer(); // 문자열 저장공간
                StringBuffer valueBuffer = new StringBuffer();

                for (int i=0; i<line.length(); i++) {
                    char c = line.charAt(i);

                    if(scanKey) {
                        if(c == '=') {
                            scanKey = false;
                        } else {
                            keyBuffer.append(c);
                        }
                    } else {
                        valueBuffer.append(c);
                    }
                }
                String key = keyBuffer.toString(); // 모아둔 값을 문자열로 출력
                String value = valueBuffer.toString();
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
