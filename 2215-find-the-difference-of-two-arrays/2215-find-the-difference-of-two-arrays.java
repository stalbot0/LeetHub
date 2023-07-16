class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> theList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            set2.add(n);
        }
        
        for (Integer n : set1) {
            if (!set2.contains(n)) {
                list1.add(n);
            }
        }
        
        for (Integer n : set2) {
            if (!set1.contains(n)) {
                list2.add(n);
            }
        }
        
        theList.add(list1);
        theList.add(list2);
        
        return theList;
    }
}