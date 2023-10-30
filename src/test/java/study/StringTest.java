package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split() {
        // given
        String str = "1,2";
        // when
        String[] result = str.split(",");
        // then
        assertThat(result).contains("2");
        assertThat(result).containsExactly("1", "2");
    }
}
