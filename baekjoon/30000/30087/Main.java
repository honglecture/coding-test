// https://www.acmicpc.net/problem/30087
// 진흥원 세미나
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        map.put("Algorithm", "204");
        map.put("ArtificialIntelligence", "302");
        map.put("DataAnalysis", "207");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");
        for (int i = 0; i < size; i++) {
            bw.write(map.get(bf.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
