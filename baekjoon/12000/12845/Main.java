// https://www.acmicpc.net/problem/12845
// 모두의 마블
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        while (true) {
            if(list.size() == 1){
                break;
            }
            int maxIndex = 0;
            int maxNum = 0;
            for (int i = 0; i < list.size(); i++) {
                int n = list.get(i);
                if(maxNum < n){
                    maxIndex = i;
                    maxNum = n;
                }
            }
            if(maxIndex == 0){
                answer += list.get(maxIndex) + list.get(1);
                list.remove(1);
            } else if(maxIndex == list.size() - 1){
                answer += list.get(maxIndex) + list.get(list.size() - 2);
                list.remove(list.size() - 2);
            } else {
                answer += list.get(maxIndex) + list.get(maxIndex - 1);
                list.remove(maxIndex - 1);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
