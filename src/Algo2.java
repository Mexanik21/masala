public class Algo2 {

    public boolean isCanBeEqualSizes(int[] nums){

        int maxVal = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxVal <= nums[i]){
                maxVal = nums[i];
                maxIndex = i;
            }
        }


        for (int i = 0; i < maxVal; i++) {
            int[] indexes = new int[maxVal+3];
            for (int j = 0; j < nums.length; j++) {
                if (maxIndex!=j){
                    nums[j]++;
                    indexes[nums[j]]++;
                } else {
                    nums[j]--;
                    indexes[nums[j]]++;

                }
            }
            maxVal = 0;

            for (int j = 0; j < nums.length; j++) {
                if (maxVal<=nums[j]){
                    maxVal = nums[j];
                    maxIndex = j;
                }
            }

            for (int j = 0; j < indexes.length; j++) {
                if (maxCount <= indexes[j]){
                    maxCount = indexes[j];
                }
            }
            if (maxCount== nums.length){
                return true;
            }



        }
        return false;




    }
}
