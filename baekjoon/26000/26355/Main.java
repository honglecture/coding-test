// https://www.acmicpc.net/problem/26355
// Sorry About That, Chief!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write("Input value: " + n + "\n");
            if(getAnswer(n)){
                bw.write("Would you believe it; it is a prime!\n");
            } else {
                int n1 = n;
                int n2 = n;
                while (true) {
                    if(n1 == 2){
                        break;
                    }
                    if(getAnswer(n1)){
                        break;
                    }
                    n1--;
                }
                while (true) {
                    if(getAnswer(n2)){
                        break;
                    }
                    n2++;
                }
                int answer = Integer.min(Math.abs(n - n1), Math.abs(n - n2));
                bw.write("Missed it by that much ("+answer+")!\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }


    private static boolean getAnswer(int n){
        boolean flag = true;
        if(n == 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
