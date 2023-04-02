class SuccessPairOfSpellLeetcode2300 {
  
  public static main(String[] args){
    // TODO: need to add logic
  }
  
  public int[] successfulPairs(int[] spells, int[] potions, long success) {
      int n = spells.length;
      int m = potions.length;
      int[] pairs = new int[n];
      Arrays.sort(potions);
      for (int i = 0; i < n; i++) {
          int spell = spells[i];
          int left = 0;
          int right = m - 1;
          while (left <= right) {
              int mid = left + (right - left) / 2;
              long product = (long) spell * potions[mid];
              if (product >= success) {
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }
          }
          pairs[i] = m - left;
      }
      return pairs;
  }
  
  public static int[] successfulPairs1(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];

        List<Integer> potionsList = Arrays.stream(potions).boxed().collect(Collectors.toList());

        int k = 0;
        for(int i : spells) {
            List<Integer> successList = potionsList.stream().map(ele -> ele * i).filter( j -> j >= success).collect(Collectors.toList());
            ans[k++] = successList.size();
        }

        return ans;
    }
}
