import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class CompareReports {

    // Function that returns hashmap objects(Two hashmaps, each for a report are created)
    // This function takes 2 params - the contents of the file and the expected "patterns" apart from numerical values
    public static Map<String, String> populateHashMap(ArrayList<String> report1, List<String> expKey){
        HashMap<String, String> hashMap = new HashMap<>();
        //Extract the contents of the file
        for (String lineItem : report1) {
            // Validation loop : keywords apart from numerical values are validated here and added as "value"
            boolean regX = false;
            String pattern = null;
            for(String value : expKey) {
                if(lineItem.contains(value)) {
                    regX = true;
                    pattern = value;
                    break;
                }
            }
            if(regX){
                String regex = ".*" + pattern + ".*";
                boolean matches = Pattern.matches(regex, lineItem);
                if (matches) {
                    String[] var = lineItem.split(pattern);
                    hashMap.put(var[0], pattern);
                }
            }
            // Numerical values added as "values" here
            else {
                // D represents non digit, d represents digit, . represents decimal
                String[] arr = lineItem.split("(?<=\\D)(?=\\d*\\.)");
                if(arr.length==1) {
                    // This loop is specifically for line items with no decimal numerical(whole numbers)
                    String[] arr2 = lineItem.split("(?<=\\D)(?=\\d)");
                    hashMap.put(arr2[0], arr2[1]);
                }
                else {
                    String[] splitArr = arr[1].split(" ");
                    hashMap.put(arr[0], String.valueOf(Math.round(Double.parseDouble(splitArr[0])*100.0)/100.0));
                }
            }

        }
        System.out.println(Arrays.asList(hashMap));
        return hashMap;

    }

    public static void main(String args[]) {
        ArrayList<String> report1 = new ArrayList<>();
        ArrayList<String> report2 = new ArrayList<>();
        List<String> expKey = Arrays.asList("off", "LV", "RV", "--"); // Expected Keys for comparison apart from numerical values - check validation loop
        HashMap<String, String> items1 = new HashMap<>(); //Populate values in Hashmap
        HashMap<String, String> items2 = new HashMap<>();
        try {
            // Read the contents of the reports
            File txt1 = new File("C:\\Users\\Deepthi\\Desktop\\Report1.txt");
            File txt2 = new File("C:\\Users\\Deepthi\\Desktop\\Report2.txt");
            Scanner myReader1 = new Scanner(txt1);
            Scanner myReader2 = new Scanner(txt2);
            System.out.println("----Report1----");
            while (myReader1.hasNextLine()) {
                String data1 = myReader1.nextLine();
                report1.add(data1);
                System.out.println(data1);
            }
            myReader1.close();
            System.out.println("----Report2----");
            while (myReader2.hasNextLine()) {
                String data2 = myReader2.nextLine();
                report2.add(data2);
                System.out.println(data2);
            }
            myReader2.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Map<String,String> hash1 = populateHashMap(report1,expKey);
        Map<String,String> hash2 = populateHashMap(report2,expKey);

        System.out.println(hash1.equals(hash2));

    }

}
