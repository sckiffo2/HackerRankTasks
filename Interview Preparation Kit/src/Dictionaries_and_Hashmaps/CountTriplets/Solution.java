package Dictionaries_and_Hashmaps.CountTriplets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		int len=arr.size();
		Map<Long, Long> map2 = new HashMap<>();
		Map<Long, Long> map3 = new HashMap<>();

		Long val=0L;
		long count=0;

		if (r==1) {
			for (int i=0; i<len; i++) {
				val = arr.get(i);
				map2.put(val, map2.getOrDefault(val,0L)+1);
			}
			for (Long values: map2.values()){
				count+=values*(values-1)*(values-2)/6; //nCr
			}
			return count;
		}

		for (int i=0; i<len; i++) {
			val = arr.get(i);
			map2.put(val*r, map2.getOrDefault(val*r, 0L)+1);

			if(map2.get(val)!=null) {
				map3.put(val*r, map3.getOrDefault(val*r, 0L)+map2.get(val));
			}

			count+=map3.getOrDefault(val, 0L);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nr[0]);

		long r = Long.parseLong(nr[1]);

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Long::parseLong)
				.collect(toList());

		long ans = countTriplets(arr, r);
		System.out.println(ans);
//		bufferedWriter.write(String.valueOf(ans));
//		bufferedWriter.newLine();

		bufferedReader.close();
//		bufferedWriter.close();
	}
}

