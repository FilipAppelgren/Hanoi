public class Block implements Comparable<Block> {

  int position;
  int previousPosition;
  int size;

  public Block(int position, int size) {
    this.position = position;
    this.size = size;
  }

  public void changestate(int position) {
    this.previousPosition = this.position;
    this.position = position;
  }

  public int position() {
    return this.position;
  }

  public int previousPosition(){
    return this.previousPosition;
  }
  public int compareTo(Block compare){
    if (this.size < compare.size) return -1;
    if (this.size == compare.size) return 0;
    return 1;


  }

}
