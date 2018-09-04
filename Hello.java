 import javax.swing.JOptionPane;

public class Hello{
   public static void main(String[] args){
    String name = JOptionPane.showInputDialog("what is you name");
    JOptionPane.showMessageDialog(null, "Hello, you are "+ name);
    System.exit(0);
     
}

}
