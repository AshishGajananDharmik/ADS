public class Main1
{
	public static void main(String[] args) {
		
// 		int arr1[]={10,-4,2,0,2,3,7};
//         int arr2[]={7,3,-4,0,3,2} ;

        int arr1[]={-2,5,1,-10,5};
         int  arr2[]={-2,-10} ;

        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr1.length;i++){
            boolean flag=true;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                min=Math.min(arr1[i],min);
            }
        }
        System.out.println(min);
	}
}