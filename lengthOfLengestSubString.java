  //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    public static int lengthOfLengestSubStringTwo(String s){
        int maxLength = 0;
        int startIndex = 0;
        char[] sChar = s.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            for (int j = startIndex; j < i; j++) {
                if (sChar[i] == sChar[j]) {
                    startIndex = j + 1;
                    break;
                }
            }
            if (i - startIndex >= maxLength) {
                maxLength = i - startIndex + 1;
            }
        }
        return maxLength;
    }