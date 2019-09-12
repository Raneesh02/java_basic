package baiscjava;

public class MaxInMinColumn {

	public static void main(String[] args) {
		
		/*245
		 * 347
		 * 129
		 */
			int a[][]={{2,4,5},{3,4,7},{1,2,9}};
				int min=a[0][0];
				int mincolumn = 0;
				
				

				for (int i = 0; i <3; i++) 
				{
					for (int j = 0; j <3; j++) 
					{
						if(a[i][j]<min)
						{
							min=a[i][j];
							mincolumn=j;
						}
						
					}
					
				}
				System.out.println(min);
				int x = 0;
				int max=a[0][mincolumn];
				  while(x<3)
	  {
		  if(a[x][mincolumn]>max)
		  {	
		  max=a[x][mincolumn];
	  }
	  x++;
	  } 
				
				System.out.println(max);
	  }
	}

