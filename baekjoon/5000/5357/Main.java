// https://www.acmicpc.net/problem/5357
//  Dedupe
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
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            List<String> list = new ArrayList<>();
            String str = bf.readLine();
            list.add(String.valueOf(str.charAt(0)));
            for (int j = 1; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(!list.get(list.size() - 1).equals(s)){
                    list.add(s);
                }
            }
            String answer = "";
            for (int j = 0; j < list.size(); j++) {
                answer += list.get(j);
            }
            System.out.println(answer);
        }
        bw.flush();
        bw.close();
    }
}