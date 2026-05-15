class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight : weights) {
            low = Math.max(weight, low);
            high = high + weight;
        }

        int res = high;
        while(low <= high) {
            int mid = (low + high)/2;
            if(canShip(days, weights, mid)) {
                res = Math.min(res, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return res;
    }

    public boolean canShip(int days, int[] weights, int capacity) {
        int dayCount = 1;
        int givenCapacity = capacity;
        for(int weight : weights) {
            if(givenCapacity - weight < 0 ) {
                dayCount++;
                givenCapacity = capacity;
            }
            givenCapacity = givenCapacity - weight;
        }
        return dayCount <= days;
    }
}