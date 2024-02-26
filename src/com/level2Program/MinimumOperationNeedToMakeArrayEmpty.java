package com.level2Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumOperationNeedToMakeArrayEmpty {
	
	public static int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int temp = map.get(nums[i]);
                map.put(nums[i],temp+1);
            }
        }
        
        System.out.println(map);
      //  List<Integer> list = convertToList(nums);
        int br=0;
        for (int key : map.keySet()) {
            int repeat = map.get(key);
      
            if(repeat ==1) return -1;
            if(repeat%3==0){
                br+=repeat/3;
            }
            else{
                int temp=repeat/3;
                if(repeat%3 ==1){
                    br+=temp-1;
                    br+=2;
                }else{
                    br+=temp;
                    br+=1;
                }
             }
//            else {
//            	br += (repeat+2)/3;
//            }
         }
        return br;
        }
        
    
    
    static List<Integer> convertToList(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        return list;
    }
	public static void main(String[] args) {
		System.out.println(minOperations(new int [] {2,3,3,2,2,4,2,3,4}));

	}

}
