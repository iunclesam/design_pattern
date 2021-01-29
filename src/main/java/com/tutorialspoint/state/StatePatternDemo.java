package com.tutorialspoint.state;

/**
 * In State pattern a class behavior changes based on its state.
 * This type of design pattern comes under behavior pattern.
 *
 * In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
 *
 * See <a href='https://www.tutorialspoint.com/design_pattern/state_pattern.htm'>State Pattern</a>
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
