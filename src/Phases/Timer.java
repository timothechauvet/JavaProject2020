package Phases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Timer implements Runnable {
    private JLabel stopwatch;
    private boolean stop;
    private int ms;

    public Timer(JLabel stopwatch) {
        this.stopwatch = stopwatch;
        this.stopwatch.setText("00:00.00");
        this.stop = false;
    }

    @Override
    public void run() {
        this.stop = false;
        NumberFormat nf = new DecimalFormat("00");
        int ms=0;

        while(!stop)
        {
            stopwatch.setText(GameActions.parseTimer(ms));
            try {Thread.sleep(10);} catch (Exception e) {System.out.println("OH NO");};
            ms++;
        }
    }

    public int getTime() {
        return ms;
    }

    public void stopTimer() {
        stop = true;
    }
}
