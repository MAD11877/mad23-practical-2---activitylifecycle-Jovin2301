package sg.edu.np.mad.mad_w2_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sg.edu.np.mad.madpractical.R;


public class MainActivity extends AppCompatActivity {
    final String Title = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User();

        TextView header = findViewById(R.id.textView);
        header.setText("  MAD Practical");

        TextView userName = findViewById(R.id.textView2);
        userName.setText("Hello World!");

        TextView userDescription = findViewById(R.id.textView3);
        userDescription.setText("The beauty of programming lies in the fact that it constantly challenges you to come up with innovative solutions to complex problems. Programming allows for continuous learning and improvement, where one can constantly discover new technologies and stay up to date with the latest trends.");

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() { //inner class
            @Override
            public void onClick(View v) { //effecting what it would do after u click on the button
                Log.v(Title, "Button is pressed");
                if (myUser.isFollowed() == true){
                    myButton.setText("UNFOLLOW");
                    myUser.setFollowed(false);
                }
                else {
                    myButton.setText("FOLLOW");
                    myUser.setFollowed(true);
                }
            }
        });
    }
}