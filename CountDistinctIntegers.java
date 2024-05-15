import java.util.HashSet;
import java.util.Set;

public class CountDistinctIntegers {
    public static String reverse(String s){
        int i = 0;
        int j = s.length()-1;
        char[] temp = s.toCharArray();

        while(i < j){
            char ch = temp[i];
            temp[i] = temp[j];
            temp[j] = ch;
            i++;
            j--;
        }
        String out = new String(temp);
        return out;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            temp.add(nums[i]);
            String s = "" + nums[i];
            s = reverse(s);
            temp.add(Integer.parseInt(s));
        }
        return temp.size();
    }
}
