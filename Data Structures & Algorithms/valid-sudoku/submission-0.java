class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> rows = new HashMap<>(9);
        Map<Integer, HashSet<Character>> cols = new HashMap<>(9);
        Map<String, HashSet<Character>> squares = new HashMap<>(9);

        for(int i = 0 ; i < 9 ; i++) {
            for(int j=0 ; j<9 ; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                String key = i/3 + "," + j/3;
                if(rows.computeIfAbsent(i,k -> new HashSet<>(9)).contains(board[i][j]) ||
                cols.computeIfAbsent(j, k -> new HashSet<>(9)).contains(board[i][j]) ||
                squares.computeIfAbsent(key, k -> new HashSet<>(9)).contains(board[i][j])) {
                          return false;
                }
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squares.get(key).add(board[i][j]);

            }
        }

        return true;
    }
}
