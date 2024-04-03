// https://www.acmicpc.net/problem/31518
// Triple Sevens
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            String[] sArray = bf.readLine().split(" ");
            boolean innerFlag = false;
            for (int j = 0; j < sArray.length; j++) {
                String s = sArray[j];
                if(s.equals("7")){
                    innerFlag = true;
                    break;
                }
            }
            if(!innerFlag){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("777");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    

}
