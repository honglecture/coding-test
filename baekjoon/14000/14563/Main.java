// https://www.acmicpc.net/problem/14563
// 완전수
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int result = getAnswer(n);
            if(n > result){
                bw.write("Deficient\n");
            } else if(n < result){
                bw.write("Abundant\n");
            } else {
                bw.write("Perfect\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n){
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                set.add(i);
                set.add(n / i);
            }
        }
        for (int num : set) {
            sum += num;
        }
        sum -= n;
        return sum;
    }


}