// https://www.acmicpc.net/problem/27160
// 할리갈리
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(map.get(name) == null){
                map.put(name, n);
            } else {
                map.put(name, map.get(name) + n);
            }
        }
        boolean flag = false;
        for (String name : map.keySet()) {
            if(map.get(name) == 5){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

    

}
