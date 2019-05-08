  //整数转罗马数字
    public static String intToRoman(int num) {
        int[] number = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numberStr = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<number.length;i++){
            if(num >= number[i]){
                int count = num/number[i];
                for(int j = 0;j<count;j++){
                    builder.append(numberStr[i]);
                    num-=number[i];
                }
            }
        }
        return builder.toString();
    }