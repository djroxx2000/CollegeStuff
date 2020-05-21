
 class Commandlineargs {
	public static void main(String[] args) {

		String s1=args[0];
		String s2=args[1];
		if(s1.equalsIgnoreCase(s2))
      System.out.println("Both Strings are equal");
		else
			System.out.println("both strings not equal");
	}

}

/*output
both strings not equal
 * */
