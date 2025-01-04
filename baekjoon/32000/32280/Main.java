// https://www.acmicpc.net/problem/32280
// 지각생
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine()) + 1;
        List<Integer> list = new ArrayList<>();
        int t = 0;
        int s = 0;
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String type = sArray[1];
            sArray = str1.split("\\:");
            int sum = Integer.parseInt(sArray[0]) * 60 + Integer.parseInt(sArray[1]);
            if(type.equals("student")){
                list.add(sum);
            } else {
                t = sum;
            }
        }
        String[] sArray = bf.readLine().split("\\:");
        s = Integer.parseInt(sArray[0]) * 60 +  Integer.parseInt(sArray[1]);
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if(t <= n && s <= n){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
