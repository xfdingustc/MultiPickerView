package com.xfdingustc.multipickerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Xiaofei on 2016/5/29.
 */
public class MultiPickerView extends FrameLayout {
    public MultiPickerView(Context context) {
        this(context, null);
    }

    public MultiPickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MultiPickerView);

        View.inflate(context, R.layout.multi_picker_view, this);

        a.recycle();
    }


}
