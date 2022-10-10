public class LoopingStatement{

public void loop(){

      for(int row=1;row<=3;row++)
                        {
         for(int col=1;col<=row;col++) 
                                     {             
                                         System.out.println(row);
                                   }
        for(int i=0;i<=row;i++)
                    {
                    System.out.println(" ");
                    }

         }
}

public static void main(String[] args){
                  LoopingStatement obj=new LoopingStatement();
                obj.loop();
        }
}
