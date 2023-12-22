// https://www.acmicpc.net/problem/21756
// 지우개
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        while (true) {
            if(list.size() == 1){
                answer = list.get(0);
                break;
            }
            List<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(i % 2 == 1){
                    nextList.add(list.get(i));
                }
            }
            list = nextList;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
