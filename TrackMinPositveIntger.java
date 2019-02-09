private static void minimumNumNotIntheArray(int [] n){
		//tracking the minimum positive integer so far.
		//[2, 5, 6, 4, 2, 1]  answer is 3
		System.out.print("min number:");
		//Arrays.stream(n).forEach(System.out::println);
		int N = n.length;
		int i = 0;
		int temp [] = new int [N+1];
		for(i = 0; i < N; i++){
			int num =  n[i];
			//use index to store consumed numbers
			temp[num] = -1;
		}
		
		for(i = 1; i < N; i++){
			if(temp[i] == 0){
				System.out.println("Min number not in array: using temp Array "+i);
				break;
			}
		}
	}
