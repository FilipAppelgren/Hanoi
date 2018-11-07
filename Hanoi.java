import java.util.*;

public class Hanoi {
  LinkedList<Block>[] gameBoard = new LinkedList[4];
  Block A;
  Block B;
  Block C;

  public Hanoi(){
  this.gameBoard[1] = new LinkedList<Block>();
  this.gameBoard[2] = new LinkedList<Block>();
  this.gameBoard[3] = new LinkedList<Block>();
  this.A = new Block(1, 1);
  this.B = new Block(1, 2);
  this.C = new Block(1, 3);
  this.gameBoard[1].add(A);
  this.gameBoard[1].add(B);
  this.gameBoard[1].add(C);

  }

  public boolean tryRightMove(Block moveBlock){
  //  System.out.println(moveBlock.position);
    if(!(moveBlock == gameBoard[moveBlock.position].getFirst()))
      return false;
    if(moveBlock.position() == 3)
      return false;
    else if(moveBlock.previousPosition == moveBlock.position + 1)
      return false;
    if (!gameBoard[moveBlock.position + 1].isEmpty() && gameBoard[moveBlock.position + 1].getFirst().size < moveBlock.size)
      return false;

    //System.out.println(gameBoard[moveBlock.position].getFirst());
    gameBoard[moveBlock.position + 1].addFirst(moveBlock);
    gameBoard[moveBlock.position].removeFirst();
    moveBlock.changestate(moveBlock.position + 1);
    System.out.println("Position A: " + A.position);
    System.out.println("Position B: " + B.position);
    System.out.println("Position C: " + C.position);
    return true;
  }

  public boolean tryLeftMove(Block moveBlock){
    if(!(moveBlock == gameBoard[moveBlock.position].getFirst()))
      return false;
      if(moveBlock.position() == 1)
        return false;
      else if(moveBlock.previousPosition == moveBlock.position - 1)
        return false;
      if (!gameBoard[moveBlock.position - 1].isEmpty() && gameBoard[moveBlock.position - 1].getFirst().size < moveBlock.size)
        return false;


        gameBoard[moveBlock.position - 1].addFirst(moveBlock);
        gameBoard[moveBlock.position].removeFirst();
        moveBlock.changestate(moveBlock.position - 1);
        System.out.println("Position A: " + A.position);
        System.out.println("Position B: " + B.position);
        System.out.println("Position C: " + C.position);
        return true;
      }

  }
