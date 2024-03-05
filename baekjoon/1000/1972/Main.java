// https://www.acmicpc.net/problem/1972
// 놀라운 문자열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("*")){
                break;
            }
            boolean flag = true;
            for (int i = 1; i < str.length(); i++) {
                Set<String> set = new HashSet<>();
                for (int j = 0; j < str.length(); j++) {
                    int n1 = j;
                    int n2 = j + i;
                    if(n2 >= str.length()){
                        break;
                    }
                    String result = str.charAt(n1) + "" + str.charAt(n2);
                    if(set.contains(result)){
                        flag = false;
                        break;
                    }
                    set.add(result);
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                bw.write(str + " is surprising.\n");
            } else {
                bw.write(str + " is NOT surprising.\n");
            }
        }
        bw.flush();
        bw.close();
    }
}