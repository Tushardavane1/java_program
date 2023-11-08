import java.awt.*;
 class FlowLayoutdemo extends Frame
{
   FlowLayoutdemo()
   {
      Button[] button = new Button[10];
      setLayout(new FlowLayout());
      for(int i=0;i<button.length;i++)
      {
        button[i] = new Button("Button"+1);
        add(button[i]);
      }
   }
}
class GUIinterface{
    public static void main(String args[])
    {
      FlowLayoutdemo obj = new FlowLayoutdemo();
      obj.setTitle("Example of java");
      obj.setSize(400,150);
      obj.setVisible(true);     
    }

}
    

