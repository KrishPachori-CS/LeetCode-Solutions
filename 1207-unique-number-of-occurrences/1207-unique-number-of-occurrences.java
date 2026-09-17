class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

    for(int n: arr)
    {
        map.put(n, map.getOrDefault(n,0)+1);
    }

    HashSet<Integer> set = new HashSet<Integer>();

    for(Map.Entry<Integer,Integer> entry:map.entrySet())
    {
        if(set.contains(entry.getValue()))
        {
            return false;
        }
        else
        {
            set.add(entry.getValue());
        }
    }

    return true;
    
    }
}