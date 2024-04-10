// https://www.acmicpc.net/problem/9056
// Letter Bank
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            boolean flag = true;
            for (int j = 0; j < str1.length(); j++) {
                String s = String.valueOf(str1.charAt(j));
                set1.add(s);
            }
            for (int j = 0; j < str2.length(); j++) {
                String s = String.valueOf(str2.charAt(j));
                set2.add(s);
            }
            for (String s : set2) {
                if(!set1.contains(s)){
                    flag = false;
                    break;
                }
                set1.remove(s);
            }
            if(flag){
                if(set1.size() == 0){
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
                
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}