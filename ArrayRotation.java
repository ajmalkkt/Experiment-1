private static void rotateArrayKtimes(int n [], int k){
    int len = n.length;
		int original [] = Arrays.copyOf(n, len);
		int kTimes = k;
		k = k > len ? k%len :k;
		int rotatedArray [] = new int [len];
		int pos = k;
		for(int i = 0; i <= len-1; i++){
			pos = i+k;			
			if( pos > (len-1) )
			{
				pos=(i+k)%(len);
			}
			rotatedArray[pos] = n[i];
		}
		
		System.out.println("After rotating original array "+ Arrays.toString(original)+" "+kTimes+" times-"+ Arrays.toString(rotatedArray));
	}
