// https://www.acmicpc.net/problem/1251
// 파티
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() - 2; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    String str1 = str.substring(0, j);
                    String str2 = str.substring(j, k);
                    String str3 = str.substring(k, str.length());
                    StringBuilder sb1 = new StringBuilder(str1).reverse();
                    StringBuilder sb2 = new StringBuilder(str2).reverse();
                    StringBuilder sb3 = new StringBuilder(str3).reverse();
                    list.add(sb1.toString() + sb2.toString() + sb3.toString());
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }


}
