import java.util.Scanner;

public class Administrador extends Usuario{
//-|Atributos|--------------------------------------------------------------------------------------------------------//

    private String pinAdmin;

//-|toString|---------------------------------------------------------------------------------------------------------//

    public String toString() {
        return  super.toString()+
                "- Pin/Administrador: " + pinAdmin;
    }
}
