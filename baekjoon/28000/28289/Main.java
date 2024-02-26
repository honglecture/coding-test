// https://www.acmicpc.net/problem/28289
// 과 조사하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        int answer4 = 0;
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 == 1){
                answer4++;
            } else {
                if(n2 == 1 || n2 == 2){
                    answer1++;
                } else if(n2 == 3){
                    answer2++;
                } else {
                    answer3++;
                }
            }
        }
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        bw.flush();
        bw.close();
    }

  
}
