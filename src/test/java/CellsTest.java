import Exceptions.InvalidInputException;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

public class CellsTest {
    int SIZE = 5;
    @Test
    public void testPrints() throws InvalidInputException {
        Cell cell = mock(Cell.class);
        Cell[][] cells = new Cell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                cells[i][j] = cell;
        Cells cellsObject = new Cells(cells);
        cellsObject.displayValue();
        verify(cell, times(25)).displayValue();
    }
}