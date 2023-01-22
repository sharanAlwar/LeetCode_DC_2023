class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        
        woodcutter(s, new ArrayList<>());
        return result;
    }

    public void woodcutter(String s, List<String> subResult) {
        // Base case
        if( s.length() == 0 || s == null) {
            result.add(new ArrayList<>(subResult));
            return;
        }
        for(int i = 1; i <= s.length(); i++) {
            String cut = s.substring(0, i);
            if(!isPalindrome(cut)) continue;
            
            subResult.add(cut); 
            woodcutter(s.substring(i, s.length()), subResult);
            subResult.remove(subResult.size() - 1); 
        }
        return;
    }

    public boolean isPalindrome(String s){
        int i = 0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
