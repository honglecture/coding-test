// https://www.acmicpc.net/problem/16412
// Heir’s Dilemma
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
        int answer = 0;
        for (int i = n1; i <= n2; i++) {
            boolean result = checkAnswer(i);
            if(result){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static boolean checkAnswer(int n){
        boolean flag = true;
        String str = String.valueOf(n);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(num == 0){
                flag = false;
                break;
            }
            if(set.contains(num)){
                flag = false;
                break;
            }
            set.add(num);
            if(n % num != 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
