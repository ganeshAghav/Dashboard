package ganesh.com.dashboard;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Storage
    ProgressBar myprogressBar;
    TextView progressingTextView;
    Handler progressHandler = new Handler();
    int i = 0;


    //Battery
    ProgressBar myprogressBar1;
    TextView progressingTextView1;
    Handler progressHandler1 = new Handler();
    int j = 1;


    //Ram
    ProgressBar myprogressBar2;
    TextView progressingTextView2;
    Handler progressHandler2 = new Handler();
    int k = 0;


    //Performance
    ProgressBar myprogressBar3;
    TextView progressingTextView3;
    Handler progressHandler3 = new Handler();
    int l = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Storage
        myprogressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressingTextView = (TextView) findViewById(R.id.progress_circle_text);

        new Thread(new Runnable() {
            public void run() {
                while (i < 100) {
                    i += 2;
                    progressHandler.post(new Runnable() {
                        public void run() {
                            myprogressBar.setProgress(i);
                            progressingTextView.setText("" + i + " %");
                        }
                    });
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        //Battery
        myprogressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        progressingTextView1 = (TextView) findViewById(R.id.progress_circle_text1);

        new Thread(new Runnable() {
            public void run() {
                while (j < 74) {
                    j += 2;
                    progressHandler1.post(new Runnable() {
                        public void run() {
                            myprogressBar1.setProgress(j);
                            progressingTextView1.setText("" + j + " %");
                        }
                    });
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        //Ram
        myprogressBar2 = (ProgressBar) findViewById(R.id.progressBar3);
        progressingTextView2 = (TextView) findViewById(R.id.progress_circle_text3);

        new Thread(new Runnable() {
            public void run() {
                while (k < 59) {
                    k += 2;
                    progressHandler2.post(new Runnable() {
                        public void run() {
                            myprogressBar2.setProgress(k);
                            progressingTextView2.setText("" + k + " %");
                        }
                    });
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        //Performance
        myprogressBar3 = (ProgressBar) findViewById(R.id.progressBar4);
        progressingTextView3 = (TextView) findViewById(R.id.progress_circle_text4);

        new Thread(new Runnable() {
            public void run() {
                while (l < 84) {
                    l += 2;
                    progressHandler3.post(new Runnable() {
                        public void run() {
                            myprogressBar3.setProgress(l);
                            progressingTextView3.setText("" + l + " %");
                        }
                    });
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}