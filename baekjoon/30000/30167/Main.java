// https://www.acmicpc.net/problem/30167
// Distinct Digits
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        String answer = "-1";
        for (int i = n1; i <= n2; i++) {
            Set<String> set = new HashSet<>();
            String str = String.valueOf(i);
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(set.contains(s)){
                    flag = false;
                    break;
                }
                set.add(s);
            }
            if(flag){
                answer = str;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
