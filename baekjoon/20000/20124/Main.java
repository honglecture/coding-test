// https://www.acmicpc.net/problem/20124
// 모르고리즘 회장님 추천 받습니다
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int maxScore = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int score = Integer.parseInt(sArray[1]);
            if(maxScore < score){
                maxScore = score;
                list.clear();
                list.add(name);
            } else if(maxScore == score){
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }

}
