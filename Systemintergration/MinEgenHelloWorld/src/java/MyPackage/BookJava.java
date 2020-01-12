package MyPackage;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "PBookDao")



public class BookJava  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String namn;
    private String nummer;
    private int id;
    
    
    public BookJava(){}
    
    public BookJava(int id, String name, String nummer){
        this.id = id;
        this.namn = namn;
        this.nummer = nummer;
    }
    
    public int getId(){
        return id;
        
    }
    @XmlElement
    public void setId(int id){
        this.id = id;
    }

}
