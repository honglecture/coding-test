// https://www.acmicpc.net/problem/25631
// 마트료시카 합치기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        Collections.sort(list);
        while (true) {
            boolean flag = false;
            List<Integer> removeList = new ArrayList<>();
            int start = list.get(list.size() - 1);
            removeList.add(list.size() - 1);
            for (int i = list.size() - 2; i >= 0; i--) {
                int n = list.get(i);
                if(start > n){
                    removeList.add(i);
                    start = n;
                }
            }
            if(removeList.size() > 1){
                for (int i = 0; i < removeList.size(); i++) {
                    int index = removeList.get(i);
                    list.remove(index);
                }
                flag = true;
                answer++;
            }
            if(!flag || list.size() == 0){
                answer += list.size();
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
