/**
 * javaDocumentation
 * @author Annam Sai Manohar
 * @since 2021 
 */

/**
 * @author annamsaimanohar
 * 
 * Class for Library Book
 */

class Book{
  /**
   * @value 10 default value
   */
  static int val = 10;

  /**
   * Parametrized Constructor
   * @param s Book name
   */
  public Book(String s){}

  /**
   * Issue a Book to a student
   * @param roll roll number of a student 
   * @throws Exception If book is not available, throws Exception
   */
  public void issue(int roll) throws Exception{}

  /**
   * Check if book is available
   * @param str Book Name
   * @return If book is available returns true else false
   */
  public boolean available(String str){
    return true;
  }

  /**
   * Get Book name
   * @param id book id
   * @return returns book name
   */
  public String getName(int id){
    return "";
  }
}

public class javaDocumentation 
{
  public static void main(String[] args) {
    
  }
}
