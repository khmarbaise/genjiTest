package org.genji;

import org.genji.annotations.GenjiTest;
import org.genji.annotations.Seed;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FooTest {

    @GenjiTest
    void appendRule(@Seed(25) String s1, String s2) {
        var appended = s1 + s2;
        assertThat(appended.length()).isEqualTo(s1.length() + s2.length());
    }

    @GenjiTest
    void reverseRule(List<List<String>> list) {
        System.err.println(list);
        List<List<String>> original = List.copyOf(list);
        Collections.reverse(list);
        Collections.reverse(list);
        assertThat(list).isEqualTo(original);
    }

}
