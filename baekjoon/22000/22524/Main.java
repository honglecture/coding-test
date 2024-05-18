// https://www.acmicpc.net/problem/22524
// koukyoukoukokukikou
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        set.add("Y");
        set.add("U");
        set.add("I");
        set.add("O");
        set.add("P");
        set.add("H");
        set.add("J");
        set.add("K");
        set.add("L");
        set.add("N");
        set.add("M");
        while (true) {
            String str = bf.readLine().toUpperCase();
            if(str.equals("#")){
                break;
            }
            int answer = 0;
            boolean flag = false;
            if(set.contains(String.valueOf(str.charAt(0)))){
                flag = true;
            }
            for (int i = 1; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if(set.contains(s)){
                    if(!flag){
                        answer++;
                        flag = true;
                    }
                } else {
                    if(flag){
                        answer++;
                        flag = false;
                    }
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

}
