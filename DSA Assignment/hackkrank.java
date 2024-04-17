canner sc=new Scanner(System.in);
      
     
        
        while(sc.hasNext())
        {
             String s[]=sc.nextLine().replace("{","").replace(",","").replace("}","").split(" ");//note
            int []a=new int[s.length];
            for(int i=0;i<s.length;i++)
            {
                a[i]=Integer.parseInt(s[i]);
            }
            
            int max=a[0];
            
             for(int j=1;j<a.length;j++)
            {
                
                if(max < a[j])
                {
                    max=a[j];
                }
            }
            System.out.println(max);
            
        }