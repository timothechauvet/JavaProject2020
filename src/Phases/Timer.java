package Phases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Timer implements Runnable {
    private JLabel stopwatch;
    private boolean stop;
    private int min,sec,ms;

    public Timer(JLabel stopwatch) {
        this.stopwatch = stopwatch;
        this.stopwatch.setText("00:00.00");
        this.stop = false;
    }

    @Override
    public void run() {
        NumberFormat nf = new DecimalFormat("00");
        for (min = 0; min < 60; min++) {
            for (sec = 0; sec < 60; sec++) {
                for (ms = 0; ms < 100; ms++) {
                    if(stop)
                        break;

                    stopwatch.setText(nf.format(min) + ":" + nf.format(sec) + "." + nf.format(ms));
                    try {Thread.sleep(10);} catch (Exception e) {};
                }
            }
        }
    }

    public int getTime() {
        return (min*60 + sec)*100 + ms;
    }

    public void stopTimer() {
        stop = true;
    }
}
