// Moors VOting algoirthm to find dominant member

        int candidateIndx=0;
        int count = 0;
        int i;
        N = n.length;
        // Pahse 1. Find candidate for the leader
        for(i = 0; i < N; i++){
            // change candidate when count reaches 0
            if(count == 0) candidateIndx = i;
            // count occurrences 
            if(n[i] == n[candidateIndx]) count++;
            else count--;          
        }

        // Phase 2. Verify that candidate occurs more than N/2 times
        int leader = n[candidateIndx];
        count = 0;
        for(i = 0; i < N; i++) {
          if(n[i] == leader) count++;
        }

        if (count > N/2) {
        	return leader;
        } else{
        	 return -1;
        	//System.out.println("O(1)space Iteration:"+ -1);
        }
