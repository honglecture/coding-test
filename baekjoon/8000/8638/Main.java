// https://www.acmicpc.net/problem/8638
// Zwycięzcy
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");
        List<String> list = new ArrayList<>();
        String answer = "";
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(array[i]);
            String s = String.valueOf((char)(i + 65));
            if(maxNum < n){
                maxNum = n;
                list.clear();
                list.add(s);
            } else if(maxNum == n){
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}