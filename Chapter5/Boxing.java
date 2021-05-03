public class Boxing {
  public static void main(String[] args) {
    // this is an iteger as seen previously
    int i = 1;
    // Java provides all primitive types as classes
    // so this can also be written as
    Integer a = new Integer(1);
    // Or have the compiler implicitly wrap it for us
    Integer b = 1;

    // Now we can upcast it to `Object` and then downcast to Integer
    // This is referred to as `autoboxing`
    Object ob = (Object)a;
    
    if (ob instanceof Integer) {
      Integer a1 = (Integer)ob;
      System.out.println("Autobox Successful!");
    }

    // We can also convert the object back into a primitive type
    int b1 = b;
    System.out.println(b1 + " Unbox Successful!");

    /*
     * Java provides wrapper classes for the following primitives
     *
     * Primitive | Wrapper Class
     * -------------------------
     * int       | Integer
     * char      | Character
     * double    | Double
     * float     | Float
     * boolean   | Boolean
     * byte      | Byte
     */
  }
}
