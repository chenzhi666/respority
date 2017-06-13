package cn.itcast.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component(value="student")
@Scope(value="prototype")*/
public class Student {
     private String  name;
     private String  password;
     void  add(){
    	 System.out.println("Ìí¼ÓÑ§Éú.......");
     }
}
