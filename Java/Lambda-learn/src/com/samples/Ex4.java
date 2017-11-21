package com.samples;

interface StringToIntMapper {
	int map(String s);
}

public class Ex4 {

	public static void main(String[] args) {

		StringToIntMapper mapper = s -> s.length(); // function
		StringToIntMapper mapperPlus10 = s -> s.length() + 10; // function
		
		int r=mapper.map("sapient");
		System.out.println(r);

		
		
	}

}
