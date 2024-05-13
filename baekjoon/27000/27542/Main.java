// https://www.acmicpc.net/problem/27542
// 絶対階差数列 (Sequence of Absolute Differences)
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        while (true) {
            if(list.size() == 1){
                break;
            }
            List<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                int n1 = list.get(i);
                int n2 = list.get(i + 1);
                nextList.add(Math.abs(n1 - n2));
            }
            list = nextList;
        }
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }

    

}
