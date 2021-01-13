package com.example.ip2021.questions.array;

/**
 * https://leetcode.com/problems/word-search/
 * Given an m x n board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || word.trim().length() == 0) {
            return false;
        }
        char[] wordToFind = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == wordToFind[0] && find(board, wordToFind, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, char[] wordToFind, int i, int j, int index) {
        if (index >= wordToFind.length) {
            return true;
        }
        // more condition
        if (i < 0 || j < 0
                || i >= board.length
                || j >= board[i].length
                || board[i][j] != wordToFind[index]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        boolean isFound = find(board, wordToFind, i + 1, j, index + 1) ||
                find(board, wordToFind, i, j + 1, index + 1) ||
                find(board, wordToFind, i - 1, j, index + 1) ||
                find(board, wordToFind, i, j - 1, index + 1);
        board[i][j] = temp;
        return isFound;
    }

}
