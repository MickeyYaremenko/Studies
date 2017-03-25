package by.htp.homework;

import java.util.Arrays;

public class Deletemax {
	public static void main (String[] args){
		//creating array matrix with two-dimensional array
		int x = (int)(Math.random()*5+1);
		int y = (int)(Math.random()*5+1);
		int [][] arr = new int [x][y];
		//filling the first array
		for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
			arr[i][j] = (int)(Math.random()*10);
	            }
	        }
	    //printing the first array
		for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                System.out.print(arr[i][j]+"");
	            }
	            System.out.println();
	        }
		
		int max = -1;
		//looking for max values
		for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
			if (max<arr[i][j]){
			max = arr[i][j];
	                }
	            }
	            
	        }
		System.out.println("Maximum value:"+max);
		//counting number of max values
		int quant = 0;
		for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	            if (max==arr[i][j]){
	            	quant = quant+1;
	                }
	            }
	            
	    }
	    System.out.println("Quantity of max elements:"+quant);
	    if (x == 1&&y == 1) {
	     	System.out.println("There was only one array cell, so it has just disappeared.");
			System.exit(0);
	    }

	    //creating array with x an y coordinates of maximum values
	    int [] arr2 = new int [quant*2];
	    int q = 0; //variable used for filling in coordinates of max elements
		for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	        	if (max==arr[i][j]){
	        		arr2[q] = i;
	        		arr2[q+1] = j;
	        		q = q+2;
	            }
	        }
	            
	    }
		/* //print array with positions coordinates
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		System.out.println("");*/
		int [] arrx = new int[arr2.length/2];
		int [] arry = new int[arr2.length/2];
		
		int tempCount = 0;
		for	(int i = 0;i <arr2.length;i+=2){
			arrx[tempCount] = arr2[i];
			tempCount++;
		}
		tempCount = 0;
		for	(int i = 1;i <arr2.length;i+=2){
			arry[tempCount] = arr2[i];
			tempCount++;
		}
		//printing array with x positions coordinates
		for (int i=0;i<arrx.length;i++) {
			System.out.print(arrx[i]);
		}
		System.out.println("");
		Arrays.sort(arry);
		//printing array with y positions coordinates
		for (int i=0;i<arry.length;i++) {
			System.out.print(arry[i]);
		}
		Arrays.sort(arrx);
		
		
		int dc = 1;//number of columns to be deleted
		int dr = 1;//number of rows to be deleted
	  
	    System.out.println("");
	    if (quant>1){
	     
	    dc = 1; 
	    for (int i = 0;i<arry.length-1;i++){
	     	if (arry[i]!=arry[i+1]){
	     		dc = dc+1;
	     	}
	    }
	    if (dc==y){
	     	System.out.println("All the columns have disappeared.");
	     	System.exit(0);
	    }
		
		dr = 1; 
	     for (int i = 0;i<arrx.length-1;i++){     	
	     	if (arrx[i]!=arrx[i+1]){
	     		dr = dr+1;
	     	}
	     }
	     if (dr==x){
	     	System.out.println("All the rows have disappeared.");
	     	System.exit(0);
	     	}
		}
	
		System.out.println("Number of columns to be deleted:"+dc);
		System.out.println("Number of rows to b deleted:"+dr);
		//creating final array
		int finx = x-dr; //number of rows in final array
		int finy = y-dc; //number of columns in final array
		int [][] finarr = new int [finx][finy];
		
		boolean yesx = false; //for checking x coordinate. If it is true, we will skip this row of the first array
		boolean yesy = false; //for checking y coordinate. If it is true, we will skip this column of the first array
		int e = 0; //for counting difference between x coordinates between first and final array
		int r = 0; //for counting difference between y coordinates between first and final array
		for (int i = 0;i<x;i++){
			r=0;
			yesx = false;
			for (int q1 = 0;q1<arrx.length;q1++){
				if (i == arrx[q1]){
					yesx = true;
				}
			}
			if (yesx){
				continue;
			}
			for (int j = 0;j<y;j++) {
				yesy = false;
				for (int q2 = 0;q2<arry.length;q2++){
					if	(j== arry[q2]){
						yesy = true;
					}
				}
				if (yesy){
					continue;
				}
				finarr [e][r] = arr[i][j];
				r++;
			}
			e++;
		}
		//printing final array
		for (int i = 0; i < finx; i++) {
	            for (int j = 0; j < finy; j++) {
	                System.out.print(finarr[i][j]);
	            }
	            System.out.println();
	        }
	}

}
