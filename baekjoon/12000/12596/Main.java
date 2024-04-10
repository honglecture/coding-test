// https://www.acmicpc.net/problem/12596
// Odd Man Out (Large)
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 0; j < array.length; j++) {
                int n = array[j];
                if(set.contains(n)){
                    set.remove(n);
                } else {
                    set.add(n);
                }
            }
            bw.write("Case #"+(i + 1)+": " + set.iterator().next() + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


