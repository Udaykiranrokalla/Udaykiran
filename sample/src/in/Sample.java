package in;
import java.io.*;
public class Sample implements Serializable {
 public int id;
 public String name;
 transient int age;
Sample(int id,String name){
this.id=id;
this.name=name;
}
}