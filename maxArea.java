 public int maxArea(int[] height) {
       //��¼���ֵ
        int max = 0;
        //��¼�м�״̬
        int temp = 0;
        //��¼�м�״̬
        int temp_count = 0;
        if(height.length == 2) {
            int minNum = Math.min(height[0], height[1]);
            return minNum * minNum;
        }
        for(int i = 0;i < height.length;i++){
            for(int j = i+1;j<height.length;j++){
                if(height[i] > height[j]){
                    temp = height[j] * (j-i);

                }else {
                    temp = height[i] * (j-i);
                }
                //��¼����
                temp_count = Math.max(Math.max(temp_count,temp),j-i);
            }
            max = Math.max(max,temp_count);
        }
        return max;
    }
}