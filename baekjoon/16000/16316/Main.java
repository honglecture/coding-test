// https://www.acmicpc.net/problem/16316
// Baby Bites
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            int n = i + 1;
            if(array[i].equals("mumble")){
                continue;
            }
            if(Integer.parseInt(array[i]) != n){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }
        bw.flush();
        bw.close();
    }

}
