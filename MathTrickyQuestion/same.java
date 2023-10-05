public static int fill(){
	    
	    int temp[]=new int[10000];
	    int opt=0;
	    temp[0]=-1;
	    for(int z=1;z*z<1000007;z++){
	        
	        temp[z]=Math.max(temp[z-1],z);
	        opt+=temp[z];
	    }
	    
	    System.out.print(Arrays.toString(temp));
	    
	    if(opt<0) return -1;
	    return 100;
	}
