// https://www.acmicpc.net/problem/9584
// Fraud Busters
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        List<String> list = new ArrayList<>();
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String s = bf.readLine();
            boolean flag = true;
            if(str.length() != s.length()){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '*'){
                    continue;
                }
                if(str.charAt(j) != s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(s);
            }
        }
        bw.write(list.size() + "\n");
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
   

}