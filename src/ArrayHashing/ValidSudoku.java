package ArrayHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    Set<Integer>[] rows;
    Set<Integer>[] columns;
    Set<Integer>[] box;

    public boolean isValidSudoku(char[][] board) {
        rows = new HashSet[9];
        columns = new HashSet[9];
        box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Character.getNumericValue(board[i][j]) >= 1 && Character.getNumericValue(board[i][j]) <= 9) {
                    if (!updateRow(i, Character.getNumericValue(board[i][j])))
                        return false;
                    if (!updateColumn(j, Character.getNumericValue(board[i][j])))
                        return false;
                    if (!updateBox(i, j, Character.getNumericValue(board[i][j])))
                        return false;
                }
            }
        }
        return true;
    }

    private boolean updateBox(int row, int col, int c) {
        int boxNo = (row / 3) * 3 + col / 3;

        if (box[boxNo].contains(c)) {
            return false;
        }
        box[boxNo].add(c);
        return true;
    }

    private boolean updateColumn(int col, int c) {
        if (columns[col].contains(c))
            return false;

        columns[col].add(c);
        return true;
    }

    private boolean updateRow(int row, int c) {
        if (rows[row].contains(c))
            return false;

        rows[row].add(c);
        return true;
    }
}
