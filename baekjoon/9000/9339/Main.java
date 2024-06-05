// https://www.acmicpc.net/problem/9339
// 마라토너
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] sArray = bf.readLine().split(" ");
            Set<Integer> keySet = new HashSet<>();
            int count = 0;
            int min = Integer.MAX_VALUE;
            int minKey = 0;
            for (int j = 0; j < sArray.length; j++) {
                keySet.add(Integer.parseInt(sArray[j]));
            }
            size = Integer.parseInt(bf.readLine());
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                int key = Integer.parseInt(sArray[0]);
                int n1 = Integer.parseInt(sArray[1]);
                int n2 = Integer.parseInt(sArray[2]);
                int result = (n1 * 60) + n2;
                if(!keySet.contains(key)){
                    continue;
                }
                if(n1 == -1){
                    continue;
                }
                if(result > 360){
                    continue;
                }
                count++;
                if(min > result){
                    min = result;
                    minKey = key;
                }
            }
            bw.write(minKey + " " + count + "\n");
        }
        bw.flush();
        bw.close();
    }
}