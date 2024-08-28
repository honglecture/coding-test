// https://www.acmicpc.net/problem/10501
// Ragged Right
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();
        int maxNum = 0;
        int answer = 0;
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            maxNum = Integer.max(maxNum, list.get(i).length());
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int num = list.get(i).length();
            if(num == maxNum){
                continue;
            }
            answer += Math.pow((maxNum - num), 2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    

}