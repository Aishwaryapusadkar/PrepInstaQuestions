class StringDemo4{
	public static void main(String args[]){
		String s = "Aishwarya";
		int length = 0;

		for(char ch : s.toCharArray())
			length++;

		System.out.println("Length of String is "+length);
	}
}