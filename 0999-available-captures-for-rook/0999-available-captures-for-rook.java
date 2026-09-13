class Solution {
    public int numRookCaptures(char[][] board) {
        int answer = 0;
        int m = -1;
        int n = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    m = i;
                    n = j;
                    break;
                }
            }
            if (m != -1) {
                break;
            }
        }
        for (int i = m + 1; i < 8; i++) {
            if (board[i][n] == 'B') {
                break;
            }
            if (board[i][n] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            if (board[i][n] == 'B') {
                break;
            }
            if (board[i][n] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = n + 1; i < 8; i++) {
            if (board[m][i] == 'B') {
                break;
            }
            if (board[m][i] == 'p') {
                answer++;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (board[m][i] == 'B') {
                break;
            }
            if (board[m][i] == 'p') {
                answer++;
                break;
            }
        }
        return answer;

    }
}