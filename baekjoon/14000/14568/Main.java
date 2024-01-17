// https://www.acmicpc.net/problem/14568
// 2017 연세대학교 프로그래밍 경시대회
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if(i + j + k > n){
                        break;
                    }
                    if(i + j + k == n){
                        if(getAnswer(i, j, k)){
                            count++;
                        }
                    }
                }
                if(i + j > n){
                    break;
                }
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }


    private static boolean getAnswer(int n1, int n2, int n3){
        boolean flag = false;
        // 택희, 영훈이, 남규
        if(n3 >= n2 + 2){
            if(n1 % 2  == 0){
                flag = true;
            }
        }
        return flag;
    }


}