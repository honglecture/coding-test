// https://www.acmicpc.net/problem/9398
// A Password Policy Requirement
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = getString(bf.readLine());
            
            int answer = Integer.MAX_VALUE;
            for (int j = 0; j < str.length(); j++) {
                int count = 0;
                Set<String> set = new HashSet<>();
                for (int k = j; k < str.length(); k++) {
                    count++;
                    String s = String.valueOf(str.charAt(k));
                    set.add(s);
                    if(count >= 6 && set.size() == 3){
                        answer = Integer.min(answer, count);
                        break;
                    }
                }
            }
            if(answer == Integer.MAX_VALUE){
                answer = 0;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getString(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
                result += "1";
            } else if(c >= 97 && c <= 122){
                result += "2";
            } else {
                result += "3";
            }
        }
        return result;
    }
}