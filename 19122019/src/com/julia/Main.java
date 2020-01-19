package com.julia;
import java.util.List;


public class Main {

    public static void main(String[] args) {

    }

    public boolean aa(List<Integer> nums, int n) {
        for (int i = 0; i < nums.size(); i++) {
            int nul1 = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                int mul2 = nums.get(j);
                if (nums.get(i) * nums.get(j) == n)
                    return true;
            }
        }
        return false;

    }
}
