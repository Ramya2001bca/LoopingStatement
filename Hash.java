public class Hash{
public void print(){
for(int i=3;i>=1;i--)   
       {
           
   for(int j=1;j<=i;j++)
           {
           System.out.println("@");
           }
         for(int k=1;k<=i;k++)
                             {
                            System.out.println();
                           }         
    }
}    
public static void main(String[] args){
      Hash obj =new Hash();
      obj.print();
}
}
