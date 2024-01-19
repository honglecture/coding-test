// https://www.acmicpc.net/problem/25757
// 임스와 함께하는 미니게임
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        String type = sArray[1];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(bf.readLine());
        }
        int result = set.size();
        int answer = 0;
        if(type.equals("Y")){
            answer = result / 1;
        } else if(type.equals("F")){
            answer = result / 2;
        } else {
            answer = result / 3;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
