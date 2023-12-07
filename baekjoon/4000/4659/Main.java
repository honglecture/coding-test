// https://www.acmicpc.net/problem/4659
// 비밀번호 발음하기
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
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        set.add("u");
        while (true) {
            String str = bf.readLine();
            if(str.equals("end")){
                break;
            }
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                String c = str.charAt(i) + "";
                if(set.contains(c)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                bw.write("<"+str+"> is not acceptable.\n");
                continue;
            }
            flag = true;
            for (int i = 0; i < str.length() - 2; i++) {
                String c1 = str.charAt(i) + "";
                String c2 = str.charAt(i + 1) + "";
                String c3 = str.charAt(i + 2) + "";
                if(set.contains(c1) && set.contains(c2) && set.contains(c3)){
                    flag = false;
                    break;
                }
                if(!set.contains(c1) && !set.contains(c2) && !set.contains(c3)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                bw.write("<"+str+"> is not acceptable.\n");
                continue;
            }
            flag = true;
            for (int i = 0; i < str.length() - 1; i++) {
                String c1 = str.charAt(i) + "";
                String c2 = str.charAt(i + 1) + "";
                String c3 = c1 + c2;
                if(c1.equals(c2)){
                    if(!c3.equals("ee") && !c3.equals("oo")){
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag){
                bw.write("<"+str+"> is not acceptable.\n");
            } else {
                bw.write("<"+str+"> is acceptable.\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}