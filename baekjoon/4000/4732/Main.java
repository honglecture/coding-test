// https://www.acmicpc.net/problem/4732
// 조옮김
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("A", 0);
        map1.put("A#", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("C#", 4);
        map1.put("D", 5);
        map1.put("D#", 6);
        map1.put("E", 7);
        map1.put("F", 8);
        map1.put("F#", 9);
        map1.put("G", 10);
        map1.put("G#", 11);
        map2.put("Ab", "G#");
        map2.put("Bb", "A#");
        map2.put("Cb", "B");
        map2.put("Db", "C#");
        map2.put("Eb", "D#");
        map2.put("Fb", "E");
        map2.put("Gb", "F");
        map2.put("B#", "C");
        map2.put("E#", "F");
        while (true) {
            String str = bf.readLine();
            if(str.equals("***")){
                break;
            }
            int key = Integer.parseInt(bf.readLine());
            String[] sArray = str.split(" ");
            for (int i = 0; i < sArray.length; i++) {
                String s = sArray[i];
                if(map2.get(s) != null){
                    sArray[i] = map2.get(s);
                }
            }
            for (int i = 0; i < sArray.length; i++) {
                int n = map1.get(sArray[i]) + key;
                if(n < 0){
                    n += 12;
                } else if(n > 11){
                    n -= 12;
                }
                sArray[i] = array[n];
            }
            for (int i = 0; i < sArray.length; i++) {
                bw.write(sArray[i] + " ");
            }
            bw.write("\n");
            
        }
        bw.flush();
        bw.close();
    }
    
}