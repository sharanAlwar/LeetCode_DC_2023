//290
class Solution {
    public static void main(String[] args) {
        //HashMap<Character,String> hash = new HashMap();
        System.out.println(wordPattern("abba","dog dog dog dog"));

    }
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        //abba
        //cat fish fish cat
        HashMap<Character,String> hash = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(hash.containsValue(arr[i]) && !Objects.equals(hash.get(pattern.charAt(i)), arr[i])){
                return false;
            }
            if(hash.containsKey(pattern.charAt(i)) && !Objects.equals(hash.get(pattern.charAt(i)), arr[i])) {
                return false;
            }
            hash.put(pattern.charAt(i),arr[i]);
        }
        return true;
    }
}
