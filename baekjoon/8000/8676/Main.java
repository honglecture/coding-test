// https://www.acmicpc.net/problem/8676
// Figury
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        boolean flag = false;;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 1; i < array.length - 1; i++) {
            int n1 = array[i - 1];
            int n2 = array[i];
            int n3 = array[i + 1];
            set.add(n1);
            set.add(n2);
            set.add(n3);
            if(set.size() == 3){
                flag = true;
                break;
            }
            set.clear();
        }
        if(flag){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        bw.flush();
        bw.close();
    }
   
}