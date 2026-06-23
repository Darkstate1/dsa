import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds= new HashMap<>();
        empIds.put("John",123);
        empIds.put("Koral",1234);
        empIds.put("Rick",12344);
        System.out.println(empIds);
    }
    
}
