package instructor.lesson_14.linterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

class FunctionLambdaDemo {

    public static void main(String[] args) {

        /*JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // todo
            }
        });*/

        /*
         Function<Integer, Integer> squareInt = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * i;
            }
        };
         */

        Function<Integer, Integer> squareInt = x -> x * x;

        System.out.println("squareInt.apply(2) = " + squareInt.apply(2));
        System.out.println("squareInt.apply(5) = " + squareInt.apply(5));

    }
}

/*class SquareInt implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer i) {
        return i * i;
    }
}*/
