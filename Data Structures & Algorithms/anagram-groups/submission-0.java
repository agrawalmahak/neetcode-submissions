class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
		List<List<String>> result = new ArrayList<>();
		for (String s : strs) {
			List<String> subList;

			char[] sArray = s.toCharArray();
			Arrays.sort(sArray);
			String sSort = new String(sArray);

			subList = mp.get(sSort);

			if (subList == null) {
				subList = new ArrayList<>();
				subList.add(s);
			} else {
				subList.add(s);
			}

			mp.put(sSort, subList);

		}

		for (Map.Entry<String, List<String>> e : mp.entrySet()) {
			result.add(e.getValue());
		}

		return result;
    }
}
