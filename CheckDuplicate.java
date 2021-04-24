import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {

        public static void main(String[] args) throws IOException {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line = null;
            line = in.readLine();
            int lenArray = Integer.parseInt(line.split(";")[0]);
            String array = line.split(";")[1];
            String[] strArrays = array.split(",");


            List<String> list = Arrays.asList(strArrays);
            HashSet<String> hs = new HashSet<String>();
            hs.addAll(list);
            int totalDuplicates =list.size() - hs.size();
            System.out.println(totalDuplicates);

            Set<String> set = new HashSet<>();
            for(String str : list) {

                boolean flagForDuplicate = set.add(str);

                if(!flagForDuplicate) {
                    System.out.println(str + " is duplicate element");
                }
            }
        }
     }




