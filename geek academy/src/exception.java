public class exception {
    public static void main(String[] args) {
        try{
           int a =5, b=10, nilai = a*b;
           if(nilai!=50)
           {
               throw new Exception("Salah");
           }
           System.out.println("Benar");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("");
        }
    }
}
