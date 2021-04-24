import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class PracticeBufferedReader {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = null;
        line = in.readLine();
        float PP = Float.parseFloat(line.split(";")[0]);
        float CP = Float.parseFloat(line.split(";")[1]);
        float cashReturn = CP - PP;
        System.out.print(cashReturn);
        HashMap<String, String> reg = new HashMap<String, String>();


        reg.put("PENNY", ".01");
        reg.put("NICKEL", ".05");
        reg.put("DIME", ".10");
        reg.put("QUARTER", ".25");
        reg.put("HALF DOLLAR", ".50");
        reg.put("ONE", "1.00");
        reg.put("TWENTY", "20.00");
        reg.put("TEN", "10.00");
        reg.put("FIVE", "5.00");
        reg.put("TWO", "2.00");
        reg.put("ONE HUNDRED", "100.00");
        reg.put("FIFTY", "50.00");
        System.out.println(reg);


        if (reg.containsValue(cashReturn)) {
            for (Map.Entry<String, String> entry : reg.entrySet()) {
                if (entry.getValue().equals(cashReturn)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }


}



