package MyPackage;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "PBookDao")



public class BookJava  implements Serializable{
    private static long serialVersionUID = 1L;
    private String namn;
    private String nummer;
    private int id;
    PBookDao pbookdao = new PBookDao();
    
    
    public BookJava(){}
    
    public BookJava(int id, String name, String nummer){
        this.id = id;
        this.namn = name;
        this.nummer = nummer;
    }
    
    public int getId(){
        return id;
        
    }
    @XmlElement
    public void setId(int id){
        this.id = id;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the namn
     */
    public String getNamn() {
        return namn;
    }

    /**
     * @param namn the namn to set
     */
    public void setNamn(String namn) {
        this.namn = namn;
    }

    /**
     * @return the nummer
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * @param nummer the nummer to set
     */
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
    
    public int getFriendByID(){
       
       return id;
    }

}
