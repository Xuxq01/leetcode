class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 0; j < list.size() - 1; j++) {
                newList.add(list.get(j) + list.get(j + 1));
            }
            newList.add(1);
            list = newList;
        }
        return list;
    }
}
