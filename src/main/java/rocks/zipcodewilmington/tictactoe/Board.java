package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [] [] puzzle;
    public Board(Character[][] matrix) {
        this.puzzle = matrix;
    }

    public Boolean isInFavorOfX() {

    for (int i = 0; i < puzzle.length; i++) {
        if (puzzle[i][0] == 'X' && puzzle[i][1] == 'X' && puzzle[i][2] == 'X') {
            return true;
        }
        if (puzzle[0][i] == 'X' && puzzle[1][i] == 'X' && puzzle[2][i] == 'X') {
            return true;
        }

    }
        if (puzzle[0][0] == 'X' && puzzle[1][1] == 'X' && puzzle[2][2] == 'X') {
        return true;
    }
        if (puzzle[0][2] == 'X' && puzzle[1][1] == 'X' && puzzle[2][0] == 'X') {
        return true;
    }
        return false;
}

    public Boolean isInFavorOfO() {

    for (int i = 0; i < puzzle.length; i++) {
        if (puzzle[i][0] == 'O' && puzzle[i][1] == 'O' && puzzle[i][2] == 'O') {
            return true;
        }
        if (puzzle[0][i] == 'O' && puzzle[1][i] == 'O' && puzzle[2][i] == 'O') {
            return true;
        }

    }
        if (puzzle[0][0] == 'O' && puzzle[1][1] == 'O' && puzzle[2][2] == 'O') {
        return true;
    }
        if (puzzle[0][2] == 'O' && puzzle[1][1] == 'O' && puzzle[2][0] == 'O') {
        return true;
    }
        return false;
}

    public Boolean isTie() {

       for (int i = 0; i < puzzle.length; i++) {
        for (int j = 0; j < puzzle.length; j++) {
            if (puzzle[i][j] == ' ') {
                return false;
            }
        }
    }
        return true;
}

    public String getWinner() {


        if (isInFavorOfO()) {
            return "O";
        }
        if (isInFavorOfX()){
            return "X";
        }

        return "";
    }

}
