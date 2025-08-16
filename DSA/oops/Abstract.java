package oops;

public class Abstract{
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
        
    }
    
}

interface ChessPlayer {
    void moves ();
}

class Queen implements ChessPlayer {
    
    public void moves() {   //implementing the abstract method from the interface
        System.out.println("Queen can move any number of squares in any direction.");
    }
}

class King implements ChessPlayer {
    
    public void moves() {   //implementing the abstract method from the interface
        System.out.println("King can move one square in any direction.");
    }
}