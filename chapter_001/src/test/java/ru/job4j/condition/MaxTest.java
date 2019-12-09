package ru.job4j.condition;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void when1equalsThen2() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax1To2Then2and3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2Then2and3and4() {
        int result = Max.max(1, 2, 3, 0);
        assertThat(result, is(3));
    }
}