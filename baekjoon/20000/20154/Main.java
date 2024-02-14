// https://www.acmicpc.net/problem/20154
// 이 구역의 승자는 누구야?!
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            list.add(array[n]);
        }
        while (true) {
            if(list.size() == 1){
                break;
            }
            List<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i += 2) {
                int n1 = list.get(i);
                int n2 = list.get(i + 1);
                int sum = n1 + n2;
                if(sum > 9){
                    sum -= 10;
                }
                nextList.add(sum);
            }
            if(list.size() % 2 == 1){
                nextList.add(list.get(list.size() - 1));
            }
            list = nextList;
        }
        if(list.get(0) % 2 == 0){
            System.out.println("You're the winner?");
        } else {
            System.out.println("I'm a winner!");
        }
        bw.flush();
        bw.close();
    }

}
