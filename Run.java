
public class Run {

  public static void main(String[] args){

    Hanoi hanoi = new Hanoi();

    while(hanoi.gameBoard[2].size() != 3) {

      if(hanoi.tryRightMove(hanoi.C)) continue;
      if(hanoi.tryRightMove(hanoi.B)) continue;
      if(hanoi.tryRightMove(hanoi.A)) continue;
      if(hanoi.tryLeftMove(hanoi.A)) continue;
      if(hanoi.tryLeftMove(hanoi.B)) continue;
      if(hanoi.tryLeftMove(hanoi.C)) continue;

      }
      System.out.println("At the bottom is: " + hanoi.gameBoard[2].get(0) + "In the middle is: "
      + hanoi.gameBoard[2].get(1) + "At the top is: " + hanoi.gameBoard[2].get(2));

    }
}
