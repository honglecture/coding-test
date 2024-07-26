// https://www.acmicpc.net/problem/24622
// Blocks
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        int size = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String str3 = bf.readLine();
        String str4 = bf.readLine();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        set.add(str1.charAt(i) + "" + str2.charAt(j) + "" + str3.charAt(k) + "" + str4.charAt(l));
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            String key = bf.readLine();
            boolean flag1 = false;
            for (String str : set) {
                boolean flag2 = true;
                List<String> list = new ArrayList<>();
                for (int j = 0; j < str.length(); j++) {
                    list.add(String.valueOf(str.charAt(j)));
                }
                for (int j = 0; j < key.length(); j++) {
                    String s = String.valueOf(key.charAt(j));
                    if(list.contains(s)){
                        list.remove(list.indexOf(s));
                    } else {
                        flag2 = false;
                    }
                }
                if(flag2){
                    flag1 = true;
                    break;
                }
            }
            if(flag1){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
