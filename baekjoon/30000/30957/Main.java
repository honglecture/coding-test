// https://www.acmicpc.net/problem/30957
// 빅데이터 vs 정보보호 vs 인공지능
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int b = 0;
        int s = 0;
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'S'){
                s++;
            } else if(c == 'B'){
                b++;
            } else if(c == 'A'){
                a++;
            }
        }
        int max = Integer.max(Integer.max(b, s), a);
        List<String> maxList = new ArrayList<>();
        if(b == max){
            maxList.add("B");
        }
        if(s == max){
            maxList.add("S");
        } 
        if(a == max){
            maxList.add("A");
        }
        if(maxList.size() == 3){
            System.out.println("SCU");
        } else if(maxList.size() == 2){
            System.out.println(maxList.get(0) + "" + maxList.get(1));
        } else {
            System.out.println(maxList.get(0));
        }
        bw.flush();
        bw.close();
    }

    

}
