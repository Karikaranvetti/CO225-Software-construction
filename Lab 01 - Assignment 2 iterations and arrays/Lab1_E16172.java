class Lab1_E16172{ 

    public static void showMaxima(int [] array) { 
    // implement 
    int i=0;
    int j=0;
    int max=array[0];
    while(i<array.length-2){ // lenth -2 is use for last maxima 
        if((array[i]<array[i+1])&&(array[i+1]>array[i+2])){         // condtion for maxima 
            System.out.println(array[i+1]);  // printing max
            j=j+1;
        }
        i=i+1;
    }
    for(int p:array){      // finding max value in the array 
        if(max<=p){
            max=p;
        }
    }
    if(j==0){       // if there no any peak values then max value is the only maxima 
        System.out.println(max);
    }
    }

    public static void main(String [] args) { 
        int [] array = {0, 1, 2, 1, 0, -1, 2, 3, 5, 6, 7, 4, 3, 4, 6, 5, 4};
        showMaxima(array);
    }
}

