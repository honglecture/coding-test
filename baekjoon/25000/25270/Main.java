// https://www.acmicpc.net/problem/25270
// 99 Problems
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int maxNum = n;
        int minNum = n;
        int answer1 = 0;
        int answer2 = 0;
        while (true) {
            maxNum++;
            String s = String.valueOf(maxNum);
            if(s.length() >= 2){
                char c1 = s.charAt(s.length() - 1);
                char c2 = s.charAt(s.length() - 2);
                if(c1 == '9' && c2 == '9'){
                    answer1 = maxNum;
                    break;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            String s = String.valueOf(i);
            if(s.length() >= 2){
                char c1 = s.charAt(s.length() - 1);
                char c2 = s.charAt(s.length() - 2);
                if(c1 == '9' && c2 == '9'){
                    answer2 = i;
                    break;
                }
            }
        }
        if(answer1 == 0){
            System.out.println(answer2);
        } else if(answer2 == 0){
            System.out.println(answer1);
        } else {
            int result1 = answer1 - n;
            int result2 = n - answer2;
            if(result1 > result2){
                System.out.println(answer2);
            } else if(result1 < result2){
                System.out.println(answer1);
            } else {
                System.out.println(answer1);
            }
        }
        bw.flush();
        bw.close();
    }

}
