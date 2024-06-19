// https://www.acmicpc.net/problem/24081
// 箱と鍵 (Boxes and Keys)
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < sArray2.length; i++) {
            set.add(Integer.parseInt(sArray2[i]));
        }
        for (int i = 0; i < sArray1.length; i++) {
            if(set.contains(Integer.parseInt(sArray1[i]))){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
