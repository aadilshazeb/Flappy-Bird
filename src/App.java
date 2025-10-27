import javax.swing.*;
public class App  {
    public static void main(String args[]) throws Exception {
        int boardWidth=360;
        int boardHeight=640;

        JFrame jf=new JFrame("Flappy Bird");


        jf.setSize(boardWidth,boardHeight);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird =new FlappyBird();
        jf.add(flappyBird);
        jf.pack();
        flappyBird.requestFocus();
        jf.setVisible(true);

    }

}
