// https://www.acmicpc.net/problem/5929
// Awkward Digits
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb1 = new StringBuilder(bf.readLine());
        StringBuilder sb2 = new StringBuilder(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < sb1.length(); i++) {
            char c = sb1.charAt(i);
            if(c == '0'){
                sb1.setCharAt(i, '1');
            } else {
                sb1.setCharAt(i, '0');
            }
            int n = Integer.parseInt(sb1.toString(), 2);
            list.add(n);
            sb1.setCharAt(i, c);
        }
        for (int i = 0; i < sb2.length(); i++) {
            boolean flag = false;
            char c = sb2.charAt(i);
            List<Integer> innerList = new ArrayList<>();
            if(c == '0'){
                innerList.add(1);
                innerList.add(2);
                
                sb2.setCharAt(i, c);
            } else if(c == '1'){
                innerList.add(0);
                innerList.add(2);
            } else {
                innerList.add(0);
                innerList.add(1);
            }
            for (int j = 0; j < innerList.size(); j++) {
                int n1 = innerList.get(j);
                sb2.setCharAt(i, String.valueOf(n1).charAt(0));
                int n2 = Integer.parseInt(sb2.toString(), 3);
                if(list.contains(n2)){
                    flag = true;
                    answer = n2;
                    break;
                }
                sb2.setCharAt(i, c);
            }
            if(flag){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}