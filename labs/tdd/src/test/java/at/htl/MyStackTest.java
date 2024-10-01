package at.htl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack myStack;

    @BeforeEach
    void setUp() {
        myStack = new MyStack();
        System.out.println("BeforeEach");
    }

    @Test
    void givenNewStack_ThenTheStackIsEmpty() {

        //assertThat(myStack.isEmpty()).isTrue();
        assertTrue(myStack.isEmpty());

    }

    @Test
    void givenNewStack_whenPushingOneElement_thenStackIsNotEmpty() {
        myStack.push("hallo");
        assertFalse(myStack.isEmpty());
    }

    @Test
    void givenNewStack_whenPushingOneElementAndPoppingOneElement_thenStackIsEmpty() {
        myStack.push("Hallo");
        var text = myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    void givenNewStack_whenPushingOneElementAndPoppingOneElement_thenReturnValueIsTheSameAsThePushedValue() {
        myStack.push("Hallo");
        var text = myStack.pop();
        assertEquals(text, "Hallo");
    }

    @Test
    void givenNewStack_whenPushingTwoElementsAndPoppingOneElement_thenReturnTheLastValue() {
        myStack.push("1");
        myStack.push("2");
        var head = myStack.pop();
        assertEquals(head,"2");
        head = myStack.pop();
        assertEquals(head,"1");
    }
}
