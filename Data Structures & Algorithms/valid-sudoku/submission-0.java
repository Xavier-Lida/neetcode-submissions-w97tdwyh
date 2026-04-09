class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> validator = new HashSet<Character>();

        for (char[] line : board) {
            // Rows
            for (char c : line) {
                if (c == '.') {
                    continue;
                }
                if (validator.contains(c)) return false;
                validator.add(c);
            }
            
            validator.clear();
        }

        for (int i = 0; i < 9; i++) {
            // Columns
            for (char[] line : board) {
                char c = line[i];
                if (c == '.') {
                    continue;
                }
                if (validator.contains(c)) return false;
                validator.add(c);
            }
            validator.clear();
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
    for (int boxCol = 0; boxCol < 9; boxCol += 3) {

        validator.clear();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[boxRow + i][boxCol + j];

                if (c == '.') continue;

                if (validator.contains(c)) return false;
                validator.add(c);
            }
        }
    }
}

        return true;
    }
}
