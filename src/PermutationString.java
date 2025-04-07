public class PermutationString {
    /**
     * Non LC
     * Find all permutations of String
     * i/p : ABC
     * o/p : {ABC,BAC,CBA,CAB,BCA,ACB}
     *  -- loop keeps looks at iterating
     *  -- backtrack keeps reference for the next iteration
     *  -- swap moves the char around
    **/

    public void backtrack(String s, int index, int size) {
        if(index == size) {
            System.out.println(s);
        } else {
            for (int i = index; i <= size; i++) {
                s = swap(s, index, i);
                backtrack(s, index+1, size);
                s = swap(s, index, i);
            }
        }
    }

    private String swap(String s, int i, int j) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
