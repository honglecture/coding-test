// https://www.acmicpc.net/problem/17204
// 죽음의 게임
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int answer = -1;
        int count = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int currentNum = list.get(i);
            if(currentNum == k){
                answer = count;
                break;
            } 
            count++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

   
}
