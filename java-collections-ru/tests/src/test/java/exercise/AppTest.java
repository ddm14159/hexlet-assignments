package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var emptyList = new ArrayList<Integer>();
        assertThat(emptyList).isEqualTo(App.take(emptyList, 0));
        assertThat(emptyList).isEqualTo(App.take(emptyList, 1));

        var list1 = List.of(1, 2, 3, 4, 5);
        var testList1 = List.of(1, 2, 3);
        assertThat(testList1).isEqualTo(App.take(list1, 3));
        assertThat(list1).isEqualTo(App.take(list1, 6));
        // END
    }
}
