public class Test1{
public static void main(String[]args){
  TicTacToeGame g1=new TicTacToeGame(2,2,2);
  TicTacToeGame g2=new TicTacToeGame(2,2,2);

  g1.play(1);
  g1.play(0);
  g2.play(3);
  g2.play(2);
  System.out.println(g1.equalsWithSymmetry(g2));
}
}
