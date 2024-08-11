// https://www.acmicpc.net/problem/4246
// To and Fro
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
        while (true) {
            int size1 = Integer.parseInt(bf.readLine());
            int size2 = 0;
            if(size1 == 0){
                break;
            }
            String str = bf.readLine();
            size2 = str.length();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < size2 / size1; i++) {
                String s = str.substring(i * size1, i * size1 + size1);
                if(i % 2 != 0){
                    StringBuilder sb = new StringBuilder(s).reverse();
                    list.add(sb.toString());
                } else {
                    list.add(s);
                }
            }
            String answer = "";
            for (int i = 0; i < list.get(0).length(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    answer += list.get(j).charAt(i);
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}