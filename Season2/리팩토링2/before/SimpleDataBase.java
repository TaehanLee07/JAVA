package removeControlflag.before;

import java.io.*;
import java.util.*;

public class SimpleDataBase {

    private Map<String, String> map = new HashMap<String, String>();

    public SimpleDataBase(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);

        boolean flag = false;
        String temp;

        while (!flag) {
            temp = br.readLine();
            if(temp == null) { // temp 가 비어있으면
                flag = true;
            } else {
                boolean flag2 = true;

                StringBuffer sb1 = new StringBuffer(); // 문자열 저장공간
                StringBuffer sb2 = new StringBuffer();

                for (int i=0; i<temp.length(); i++) {
                    char temp2 = temp.charAt(i);

                    if(flag2) {
                        if(temp2 == '=') {
                            flag2 = false;
                        } else {
                            sb1.append(temp2);
                        }
                    } else {
                        sb2.append(temp2);
                    }
                }
                String ss1 = sb1.toString(); // 모아둔 값을 문자열로 출력
                String ss2 = sb2.toString();
                map.put(ss1, ss2);
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
