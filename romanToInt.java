//罗马转整数  III ： 3
    public static int romanToInt(String s){
        Map<Character,Integer> integerMap = new HashMap<>();
        integerMap.put('M',1000);
        integerMap.put('D',500);
        integerMap.put('C',100);
        integerMap.put('L',50);
        integerMap.put('X',10);
        integerMap.put('V',5);
        integerMap.put('I',1);
        int result = 0;
        int index = 0;
        char[] chars = s.toCharArray();
        while (index<chars.length){
            if(index+1==chars.length){
                result+=integerMap.get(chars[index]);
                index +=1;
            }else{
                int current = integerMap.get(chars[index]);
                int next = integerMap.get(chars[index+1]);
                if(current<next){
                    result = result+next-current;
                    index +=2;
                }else{
                    result+=current;
                    index +=1;
                }
            }
        }
        return result;
    }