//2244
class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int min=0;
        HashMap<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            a.put(tasks[i],a.getOrDefault(tasks[i],0)+1);
        }

        for(int i:a.values())
        {
            if(i==1)
            return -1;
            else
            min=min+(i+2)/3;

        }
        return min;
    }
}
