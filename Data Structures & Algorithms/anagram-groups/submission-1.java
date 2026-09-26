class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
		for (String s : strs) {
			

			char[] sArray = s.toCharArray();
			Arrays.sort(sArray);
			String sSort = new String(sArray);
			
			mp.putIfAbsent(sSort, new ArrayList<>());
			mp.get(sSort).add(s);
		}

		return new ArrayList<>(mp.values());
    }
}
