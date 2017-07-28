import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		   int[] nums= new int[6];
			
	        Random rand =new Random();
	
	        
	        System.out.println("오름차순 전");
		       
	  
	        
	        
	        
	         int n=0;
	         
	      while(n<6)
	      {
	    	 boolean flag= false;
	    	  nums[n]=rand.nextInt(200)+1;
	    	  System.out.printf("%d  ", nums[n]);
	    	  
	    	  for(int j=0;j<n;j++)
	        	{
	        		   if(nums[n]==nums[j])
					       		      {
					       		    	 flag=true;
					       		    	  break;
					       		      }
	        	}
	    	  
	    	  if(!flag)
	    		  n++; 	  
	      }
	        
	        
	        
	        
	        
	        /*  for(int i=0; i<6; i++) {
	        	    nums[i]=rand.nextInt(45)+1;
		        	System.out.printf("%d  ", nums[i]);   		        	
			        	for(int j=0;j<i;j++)
			        	{
			        		   if(nums[i]==nums[j])
							       		      {
							       		    	  i--;
							       		    	  break;
							       		      }
			        	}
		        }*/
	      
	        	System.out.println();
	        	
	        	
	        	
		        	for(int j=0;j<5;j++)
		            {
				          for(int i=0;i<5-j;i++)
				       	      {
				       	         int temp;
				       		      if(nums[i]>nums[i+1])
						       		    {
						       			  temp=nums[i];
						       		      nums[i]=nums[i+1];
						       			  nums[i+1]=temp;
						       		    }    
			                    }
		             }
		       	 	    	
		        	 System.out.println("오름차순 중복 제거 후");
				         for(int i=0; i<6; i++)
				    	  System.out.printf("%d  ", nums[i]);

		}

}


