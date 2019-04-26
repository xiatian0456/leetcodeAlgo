   public static int reverse32(int x) {
       int num = x < 0 ? -x : x;
       String str = new StringBuilder(num).reverse().toString();
       try {
          num = Integer.parseInt(str);
          return x < 0 ? -num : num;
       }catch (Exception e){
          return 0;
       }
    }