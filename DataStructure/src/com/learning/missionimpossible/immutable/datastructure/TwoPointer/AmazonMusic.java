package com.learning.missionimpossible.immutable.datastructure.TwoPointer;


/*Amazon Music is working on a new "community radio station" feature which will allow users to iteratively populate
        the playlist with their desired songs. Considering this radio station will also have other scheduled shows to be
        aired, and to make sure the community soundtrack will not run over other scheduled shows, the user-submitted songs
        will be organized in full-minute blocks. Users can choose any songs they want to add to the community list, but
        only in pairs of songs with durations that add up to a multiple of 60 seconds (e.g. 60, 120, 180).

        As an attempt to insist on the highest standards and avoid this additional burden on users, Amazon will let them
        submit any number of songs they want, with any duration, and will handle this 60-second matching internally. Once
        the user submits their list, given a list of song durations, calculate the total number of distinct song pairs that
        can be chosen by Amazon Music.

        n = 3

songs = [37, 23, 60]
One pair of songs can be chosen whose combined duration is a multiple of a whole minute (37 + 23 = 60) and the
return value would be 1. While the third song is a single minute long, songs must be chosen in pairs.

4 -> songs[] size n = 4
10 -> songs = [10, 50, 90, 30]
50
90
30
Sample Output

2
Explanation

The first and second songs pair to 60 seconds. The third and fourth songs pair to 120 seconds. No other pairs
will satisfy the requirement.

3 -> songs[] size n = 3
60 -> songs = [60, 60, 60]
60
60
Sample Output

3
Explanation

There are three pairs of songs that end in whole minutes. They are (0, 1), (1, 2) and (0, 2).
 */


import java.util.HashMap;
import java.util.Map;

public class AmazonMusic {

    public static void main(String [] args){
        int[] nums1 = { 37, 23, 60 };
        int[] nums2 = { 10, 50, 90, 30 };
        int[] nums3 = { 30, 20, 150, 100, 40 };
        int[] nums4 = { 60, 60, 60 };
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve(nums3));
        System.out.println(solve(nums4));
    }

    public static int solve(int [] nums){

        Map<Integer,Integer> hmap = new HashMap();

        int result =0;

        for(int num:nums){

            num =num%60;
            if(hmap.containsKey(60-num==60?0:60-num))
                result = result + hmap.get(60-num==60?0:60-num);

                hmap.put(num,hmap.getOrDefault(num,0)+1);
        }

        return result;
    }
}
