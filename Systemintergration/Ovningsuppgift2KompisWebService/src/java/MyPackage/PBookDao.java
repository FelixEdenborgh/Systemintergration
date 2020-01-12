package MyPackage;

import java.util.ArrayList;
import java.util.List;

public class PBookDao {
   
     public List<BookJava> getAllBooks(){
        
        List<BookJava> PhoneBookList = new ArrayList<>();
        BookJava pb1 = new BookJava(1, "Felix Edenborgh","0735399712");
        BookJava pb2 = new BookJava(2, "Mimmi Edenborgh", "0709525959");
        BookJava pb3 = new BookJava(3, "Hem", "0857019211");
        BookJava pb4 = new BookJava(4, "Joakim Edenborgh", "0735405888");
        BookJava pb5 = new BookJava(5, "Anton Edenborgh", "0735436964");
        
        PhoneBookList.add(pb1);
        PhoneBookList.add(pb2);
        PhoneBookList.add(pb3);
        PhoneBookList.add(pb4);
        PhoneBookList.add(pb5);
       
        return PhoneBookList;
           
       
    }
    
    
    
    
    
    
}
