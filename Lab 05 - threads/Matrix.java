/* 
V.karikarn
E/16/172
Lab5 
*/

public class Matrix extends Thread { 

    private  int [][] a; 
    private  int [][] b;
    private  int [][] c; 
    private  int column;
    private int val=0; 
    

    /* You might need other variables as well */

	public Matrix(int [][]a,int [][]b,int [][]c,int column) { // need to change this, might need some information 
		this.a=a;
		this.b=b;
		this.c=c;  
		this.column=column;
	}
	
	public void run(){ //override the run method
		 
			for(int j=0;j<this.a.length;j++){               //if one time run method executing one of resulting matrix column values created
				for(int i=0;i<this.b.length;i++){
					this.val=this.val+((this.a[j][i])*(this.b[i][this.column]));
					 
				}

				this.c[j][this.column]=this.val;
				this.val=0;
			}
	 
		
		
	}
	

    public synchronized static int [][] multiply(int [][] a, int [][] b) {        // this method calling run methods in synchronized way 

	/* check if multipication can be done, if not 
	 * return null 
	 * allocate required memory 
	 * return a * b
	 */

	int x = a.length; 
	int y = b[0].length; 

	int z1 = a[0].length; 
	int z2 = b.length; 

	if(z1 != z2) { 
	    System.out.println("Cannnot multiply");
	    return null;
	}
	Matrix [] matRef=new Matrix[x]; //creat matrix  array
	int [][] c = new int [x][y]; 
	for(int i=0;i<y;i++){ //do matrix multiplication column by column, this is use threads to parallelize the operation 
		try{
			matRef[i]=new Matrix(a,b,c,i); 
			matRef[i].start();            //the number of columns equal to number of therads are creating so therads are redusing the time 1/column times 
			matRef[i].join();         //stoping the main therad until the other therads done the work
		}catch(Exception e){
			System.out.println("There is and error on thread creating"+e);
			return null;
		}
		
	} 

	
	return c; 
    }

}