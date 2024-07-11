// https://www.acmicpc.net/problem/13413
// 오셀로 재배치
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String str1 = bf.readLine();
            String str2 = bf.readLine();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int answer = 0;
            for (int j = 0; j < str1.length(); j++) {
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j);
                if(c1 != c2){
                    if(c1 == 'W'){
                        count1++;
                    } else {
                        count2++;
                    }
                    if(c2 == 'W'){
                        count3++;
                    } else {
                        count4++;
                    }
                }
            }
            bw.write(count1 + " " + count2 + " " + count3 + " " + count4 + "\n");
        }
        bw.flush();
        bw.close();
    }
}