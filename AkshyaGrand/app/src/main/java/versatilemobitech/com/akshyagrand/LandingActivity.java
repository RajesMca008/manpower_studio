package versatilemobitech.com.akshyagrand;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class LandingActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing);



    }

    @Override
    protected void onStart() {
        super.onStart();
        ImageView imgView=(ImageView)findViewById(R.id.imageview);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.wave_anim);
        set.setTarget(imgView);
        set.start();
        set.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

                finish();
                Intent intent=new Intent(LandingActivity.this,MainActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

    }
}
