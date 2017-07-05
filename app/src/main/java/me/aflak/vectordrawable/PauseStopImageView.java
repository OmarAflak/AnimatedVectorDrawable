package me.aflak.vectordrawable;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;

/**
 * Created by Omar on 05/07/2017.
 */

public class PauseStopImageView extends android.support.v7.widget.AppCompatImageView {
    private boolean isShowingPause;

    public PauseStopImageView(Context context) {
        super(context);
        init();
    }

    public PauseStopImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PauseStopImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        isShowingPause = true;
        setImageResource(R.drawable.animated_pause);
    }

    public void morph(){
        setImageResource(isShowingPause?R.drawable.animated_pause:R.drawable.animated_stop);
        isShowingPause = !isShowingPause;
        ((Animatable)getDrawable()).start();
    }
}
