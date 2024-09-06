// https://www.acmicpc.net/problem/6513
// Deli Deli
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        set.add("u");
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            map.put(sArray[0], sArray[1]);
        }
        for (int i = 0; i < size2; i++) {
            String str = bf.readLine();
            if(map.get(str) != null){
                bw.write(map.get(str) + "\n");
            } else {
                String s1 = String.valueOf(str.charAt(str.length() - 1));
                String s2 = str.substring(str.length() - 2);
                String s3 = String.valueOf(str.charAt(str.length() - 2));
                if(s1.equals("y") && !set.contains(s3)){
                    String result = str.substring(0, str.length() - 1) + "ies";
                    bw.write(result + "\n");
                } else {
                    if(s1.equals("o") || s1.equals("s") || s2.equals("ch") || s2.equals("sh") || s1.equals("x")){
                        String result = str + "es";
                        bw.write(result + "\n");
                    } else {
                        bw.write(str + "s\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }

}