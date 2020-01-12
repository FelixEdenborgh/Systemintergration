package MyPackage;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/BookService")

public class BookService {
    PBookDao pbookdao = new PBookDao();
    List<BookJava> PhoneBookList = pbookdao.getAllBooks();
    //BookJava bookjava = new BookJava();
    
    
    @GET
    @Path("PhoneBookList/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookJava  getFriendByID(@PathParam ("id") int id){
        BookJava res = new BookJava();
        pbookdao.getAllBooks();
        
        for(BookJava b : PhoneBookList){
            if(b.getId() == id){
                res = b;
            }
        }
        return res;
    }
    
    @GET
    @Path("PhoneBookList/{id}/delete")
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteFriendById(@PathParam("id") int id){
        Response res = new Response("Book Deleted", Boolean.FALSE);
        System.out.println("i delete");
        int indexToRemove = -1;
        for(int i = 0; i < PhoneBookList.size(); i++){
            if(PhoneBookList.get(i).getId() == id){
                indexToRemove = i;
            }
        }
        if(indexToRemove != -1){
            PhoneBookList.remove(indexToRemove);
            res.setStatus(Boolean.TRUE);
        }
        return res;
                
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //@GET
    //@Path("/PhoneBookList")
    //@Produces(MediaType.TEXT_HTML)
    //@Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
    
     //public String getPhoneBooks(){
     //   System.out.println("gdfgdgaaaad");
     //   return "hej";
    //}
    
    
    
    
    //public List<BookJava> getBookJavaJSON(){
    //    return pbookdao.getAllBooks();
    //}
    
    //public List<BookJava> getBookJava(){
    //    return pbookdao.getAllBooks();
    //}

}
