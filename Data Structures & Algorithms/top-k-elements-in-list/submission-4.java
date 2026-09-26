class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i : nums) {
			mp.put(i, mp.getOrDefault(i, 0) + 1);
		}

		ArrayList<int[]> ans = new ArrayList<>();
		for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
			Integer key = e.getKey();
			Integer val = e.getValue();
			ans.add(new int[] { val, key });
		}
		ans.sort((a, b) -> Integer.compare(b[0], a[0]));
		int[] result = new int[k];
		int i = 0;
		while (i < k) {
			result[i] = ans.get(i)[1];
			i++;
		}

		return result;
    }
}
