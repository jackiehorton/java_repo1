import java.util.Random;
public class ListTester
{

	public static void main(String [] args)
	{
	   long time1,time2;
      Random r = new Random();
      ListInterface list1 = new ListArrayListBased();//new ListReferenceBased();
      ListInterface list2 = new ListReferenceBased();//new ListReferenceBased();

      System.out.printf("%20s%10s%10s\n","Operation","Reference", "ArrayList");
      // add to end of list
      System.out.printf("%20s","Add, beginning");
      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list1.add(i,new Integer(r.nextInt()));
      time2 = System.currentTimeMillis();
      System.out.printf("%10d",time2-time1);

      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list2.add(i,new Integer(r.nextInt()));
      time2 = System.currentTimeMillis();
      System.out.printf("%10d\n",time2-time1);
      
      //remove from beginning of list
      System.out.printf("%20s","Remove, beginning");
      
      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list1.remove(1);
      time2 = System.currentTimeMillis();
      System.out.printf("%10d",time2-time1);

      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list2.remove(1);
      time2 = System.currentTimeMillis();
      System.out.printf("%10d\n",time2-time1);
      
      
      // add to beginning of list
      System.out.printf("%20s","Add, end");
      
      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list1.add(1,new Integer(r.nextInt()));
      time2 = System.currentTimeMillis();
      System.out.printf("%10d",time2-time1);

      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
         list2.add(1,new Integer(r.nextInt()));
      time2 = System.currentTimeMillis();
      System.out.printf("%10d\n",time2-time1);
      
      // remove from end of list
      System.out.printf("%20s","Remove, end");
      int s;
      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
      {
         s=list1.size()  ;
         list1.remove(s);
      }
      time2 = System.currentTimeMillis();
      System.out.printf("%10d",time2-time1);

      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
      {
         s=list2.size()  ;
         list2.remove(s);
      }
      time2 = System.currentTimeMillis();
      System.out.printf("%10d\n",time2-time1);

     // list traversal
      System.out.printf("%20s","Traversal");
      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
      {
         displayList(list1) ;
         
      }
      time2 = System.currentTimeMillis();
      System.out.printf("%10d",time2-time1);

      time1 = System.currentTimeMillis();
      for (int i =1;i<= 100000;i++)
      {
         displayList(list2) ;
      }
      time2 = System.currentTimeMillis();
      System.out.printf("%10d\n",time2-time1);
     

	}
   // Traverse list displaying data in teach item
	public static void displayList(ListInterface list)
	{
		for (int i = 1; i<=list.size();i++)
			System.out.println(list.get(i));

	
	
	}
}