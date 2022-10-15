package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D8);
        assertThat(bishopBlack.position()).isEqualTo(Cell.D8);
    }

    @Test
    void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D8);
        Figure copyBishopBlack = bishopBlack.copy(Cell.G5);
        assertThat(copyBishopBlack.position()).isEqualTo(Cell.G5);
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(steps);
    }
}