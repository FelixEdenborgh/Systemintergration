package MyPackage;

public class PBookDao {
     public List<Book> getPhoneBookList(){
        
        List<PhoneBook> PhoneBookList = new ArrayList<>();
        PhoneBook pb1 = new PhoneBook(1, "0735399712", "Felix Edenborgh");
        PhoneBook pb2 = new PhoneBook(2, "0709525959", "Mimmi Edenborgh");
        PhoneBook pb3 = new PhoneBook(3, "0857019211", "Hem");
        PhoneBook pb4 = new PhoneBook(4, "0735405888", "Joakim Edenborgh");
        PhoneBook pb5 = new PhoneBook(5, "0735436964", "Anton Edenborgh");
        
        PhonebookList.add(pb1);
        PhonebookList.add(pb2);
        PhonebookList.add(pb3);
        PhonebookList.add(pb4);
        PhonebookList.add(pb5);
        
        return PhoneBookList;
            
        
    }
}
