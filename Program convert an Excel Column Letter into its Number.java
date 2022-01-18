public class MyClass {
    
    
    private int ExcelTextNumber(String cell_name) throws NullPointerException 
    {
        
        if(cell_name==null)
        {
            throw new NullPointerException("Null String inputted");
            
        }
        
        int sum = 0;
        
        for(int i = 0; i<cell_name.length(); i++)
        {
            
            sum = sum*26;
            sum = sum + (cell_name.charAt(i)-'A' + 1);
            
            int y = cell_name.charAt(i)-'A';
            System.out.println("cell_name.charAt("+i+")-'A' = " + y);
            
        }
        return sum;
        
    }
    
    public static void main(String args[]) {
      
      MyClass obj = new MyClass();
      
      try
      {
             int x =  obj.ExcelTextNumber(null);
            System.out.println("XFD = " + x);
      }
      catch(NullPointerException e)
      {
          System.out.println("Null Pointer Exception occured | "+ e.getMessage() );
      }
  
    }
}