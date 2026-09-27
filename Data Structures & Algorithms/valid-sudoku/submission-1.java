class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
			HashSet<Character> row = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					continue;
				} else if (!row.add(board[i][j])) {
					return false;
				}

			}
		}

		for (int i = 0; i < 9; i++) {
			HashSet<Character> column = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] == '.') {
					continue;
				} else if (!column.add(board[j][i])) {
					return false;
				}

			}
		}
		for (int i = 0; i < 9; i+=3) {
			for (int j = 0; j < 9; j+=3) {
				HashSet<Character> square = new HashSet<>();

				for(int k=i;k<i+3;k++)
				{
					for(int x=j;x<j+3;x++)
					{
						if (board[k][x] == '.') {
							continue;
						}
						else if (!square.add(board[k][x])) {
							return false;
						}
					}
				}
			}
		}
		return true;
		
    }
}
