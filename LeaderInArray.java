//An element is leader if it is greater than all the elements to its right side
private static void leadersInAray(Integer [] n) {
		System.out.print("Leads aray:");
		Stream.of(n).forEach(System.out::print);
		int leader = n[n.length-1];
		System.out.println(leader);
		 for(int i = n.length-2; i >=0 ; i--){
			 if(n[i] > leader){
				 System.out.println(n[i]);
				 leader = n[i];
			 }
			 
		 }
	}
