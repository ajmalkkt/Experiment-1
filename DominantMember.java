/**
* THis example uses Java 8 stream and Functions to find the dominant member. O(n)
* THere is Moors voting algorithm which is best known algorithm in terms of space complexity.
*/
private static void findMaxOccupiedValue(Integer [] n) {
		//Using map O(n) and space also O(n)
		System.out.println("All:"+
				Arrays.stream(n).collect(groupingBy(Function.identity(),TreeMap::new,counting()))
				);
		long startTime = System.currentTimeMillis();
		System.out.println("MaxOccupied:"+
				Arrays.stream(n).collect(groupingBy(Function.identity(),  counting()))
				.entrySet().stream().max(Comparator.comparing(Entry::getValue)).map(applyCheck(n.length)).get()
				);
		
 }
 
 private static Function<? super Entry<Integer, Long>, ? extends Object> applyCheck(Integer len) {
		return e-> {
			  if (e.getValue()> (len/2))
				{
				   return e.getKey();
			    }
			    return -1;
				};
	}
