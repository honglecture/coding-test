// https://www.acmicpc.net/problem/1076
// 저항
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        String s3 = bf.readLine();
        Map<String, long[]> map = new HashMap<>();
        map.put("black", new long[]{0, 1});
        map.put("brown", new long[]{1, 10});
        map.put("red", new long[]{2, 100});
        map.put("orange", new long[]{3, 1000});
        map.put("yellow", new long[]{4, 10000});
        map.put("green", new long[]{5, 100000});
        map.put("blue", new long[]{6, 1000000});
        map.put("violet", new long[]{7,10000000});
        map.put("grey", new long[]{8, 100000000});
        map.put("white", new long[]{9, 1000000000});
        long result1 = Long.parseLong(map.get(s1)[0] + "" + map.get(s2)[0]);
        long result2 = map.get(s3)[1];
        long answer = result1 * result2;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }



    
}