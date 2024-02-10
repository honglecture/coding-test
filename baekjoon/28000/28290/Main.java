// https://www.acmicpc.net/problem/28290
// 안밖? 밖안? 계단? 역계단?
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        Map<String, String> map = new HashMap<>();
        map.put("fdsajkl;", "in-out");
        map.put("jkl;fdsa", "in-out");

        map.put("asdf;lkj", "out-in");
        map.put(";lkjasdf", "out-in");

        map.put("asdfjkl;", "stairs");
        map.put(";lkjfdsa", "reverse");
        if(map.get(str) == null){
            System.out.println("molu");
        } else {
            System.out.println(map.get(str));
        }
        bw.flush();
        bw.close();
    }

  
}
