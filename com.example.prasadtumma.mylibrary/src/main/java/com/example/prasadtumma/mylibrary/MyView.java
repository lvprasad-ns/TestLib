package com.example.prasadtumma.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by prasad.tumma on 24-12-2015.
 */
public class MyView extends LinearLayout {
    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        inflate(context,R.layout.my_view,this);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }
}
