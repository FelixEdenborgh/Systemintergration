package MyPackage;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/BookService")

public class BookService {
    PBookDao PbookDao = new PBookDao();
    
    @GET
    @Path("/PhoneBookList")
    @Produces(MediaType.TEXT_PLAIN)
    
    // public String getPhoneBooks(){
    //    System.out.println("gdfgdgaaaad");
    //    return "hej";
    //}

    
    public List<PhoneBookList> getPhoneBooks(){
        return Pbookdao.getAllPhoneBooks();
    }

}
