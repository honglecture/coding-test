// https://www.acmicpc.net/problem/18129
// 이상한 암호코드
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str = sArray[0].toLowerCase();
        int size = Integer.parseInt(sArray[1]);
        Set<String> set = new HashSet<>();
        String answer = "";
        int count = 1;
        String beforeString = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(beforeString.equals(s)){
                count++;
            } else {
                if(set.contains(beforeString)){
                    beforeString = s;
                    continue;
                }
                if(count >= size){
                    answer += "1";
                } else {
                    answer += "0";
                }
                count = 1;
                set.add(beforeString);
            }
            beforeString = s;
        }
        if(!set.contains(beforeString)){
            if(count >= size){
                answer += "1";
            } else {
                answer += "0";
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
