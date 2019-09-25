package TestCases;

import org.apache.commons.lang3.tuple.Triple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Solution {


	public static void main(String[] args) throws IOException {
		String fileName = "./src/TestCases/lng.csv";

		List<String> inputStrings = Files.readAllLines(Paths.get(fileName));
		Set<String> uniqueStrings = new HashSet<>();
		System.out.println(inputStrings.size());
		for (String s : inputStrings) {
			if (s.split(";").length == 3) {
				uniqueStrings.add(s);
			}
		}
		System.out.println(uniqueStrings.size());



		}
	}