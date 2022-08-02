import javax.swing.JFrame;


public class GameFrame extends JFrame {

    //GameFrame frame = new GameFrame();
    GameFrame() {
        //GamePanel panel = new GamePanel();
        //this.add(panel);
        this.add(new GamePanel()); //same as code above
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
