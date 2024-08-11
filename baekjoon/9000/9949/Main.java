// https://www.acmicpc.net/problem/9949
// Hide those Letters
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 1;
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            if(s1.equals("#") && s2.equals("#")){
                break;
            }
            int size = Integer.parseInt(bf.readLine());
            Set<String> set = new HashSet<>();
            set.add(s1.toLowerCase());
            set.add(s2.toLowerCase());
            set.add(s1.toUpperCase());
            set.add(s2.toUpperCase());
            bw.write("Case "+index+"\n");
            for (int i = 0; i < size; i++) {
                String str = bf.readLine();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < str.length(); j++) {
                    String s = String.valueOf(str.charAt(j));
                    if(set.contains(s)){
                        sb.append("_");
                    } else {
                        sb.append(s);
                    }
                }
                bw.write(sb.toString() + "\n");
            }
            bw.write("\n");
            index++;
        }
        bw.flush();
        bw.close();
    }
}