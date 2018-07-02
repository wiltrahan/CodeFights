// Given two cells on the standard chess board, determine whether they have the same color or not.

// Example

// For cell1 = "A1" and cell2 = "C3", the output should be
// chessBoardCellColor(cell1, cell2) = true.

boolean chessBoardCellColor(String cell1, String cell2) {
    int c1a = cell1.charAt(0) - 'A', c1b = cell1.charAt(1) - '1';
    // -65, -49
    int c2a = cell2.charAt(0) - 'A', c2b = cell2.charAt(1) - '1';

    return (c1a + c2a) % 2 == (c1b + c2b) % 2;
}
