// https://www.acmicpc.net/problem/31712
// 핑크빈 레이드
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[3][2];
        for (int i = 0; i < 3; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        int life = Integer.parseInt(bf.readLine());
        for (int i = 0; i < array.length; i++) {
            life -= array[i][1];
        }
        int count = 0;
        while (true) {
            if(life <= 0){
                break;
            }
            count++;
            for (int i = 0; i < array.length; i++) {
                int n1 = array[i][0];
                int n2 = array[i][1];
                if(count % n1 == 0){
                    life -= n2;
                }
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

    

}
