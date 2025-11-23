class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElement(mountainArr);
        int firstTry = argonamicBs(mountainArr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return argonamicBs(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    static int peakElement(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int argonamicBs(MountainArray mountainArr, int target, int start, int end){
        boolean isAscending = mountainArr.get(start) <= mountainArr.get(end);
        while(start <= end){
            int mid = start + (end - start) / 2;
            int value = mountainArr.get(mid);

            if(value == target){
                return mid;
            }

            if(isAscending){
                if(value < target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(value > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
