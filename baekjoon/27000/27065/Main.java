// https://www.acmicpc.net/problem/27065
// 2022년이 아름다웠던 이유
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(!getAnswer(n)){
                bw.write("BOJ 2022\n");
            } else {
                bw.write("Good Bye\n");
            }
        }
        bw.flush();
        bw.close();
    }


    private static boolean getAnswer(int n){
        int result = 0; // 과잉수?
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                set.add(i);
                set.add(n / i);
            }
        }
        set.remove(n);
        for (int num : set) {
            result += num;
        }
        if(result > n){
            for (int num : set) {
                Set<Integer> innerSet = new HashSet<>();
                int innerSum = 0;
                for (int i = 1; i <= Math.sqrt(num); i++) {
                    if(num % i == 0){
                        innerSet.add(i);
                        innerSet.add(num / i);
                    }
                }
                innerSet.remove(num);
                for (int innerNum : innerSet) {
                    innerSum += innerNum;
                }
                if(innerSum > num){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }


    
    

}
