class Solution {
    public int mySqrt(int x) {
    int start = 0, end = x, middle = 0;

    while (start < end) {
        middle = (start + end)/2;
        if (middle * middle == x) {
            return middle;
        }
        if (x < middle * middle) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
    }

    return x < end * end ? end - 1 : end;
    }
}