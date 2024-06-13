// https://www.acmicpc.net/problem/31775
// 글로벌 포닉스
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            String s = String.valueOf(bf.readLine().charAt(0));
            if(s.equals("k")||s.equals("l")||s.equals("p")){
                set.add(s);
            }
        }
        if(set.size() == 3){
            System.out.println("GLOBAL");
        } else {
            System.out.println("PONIX");
        }
        bw.flush();
        bw.close();
    }

    

}
