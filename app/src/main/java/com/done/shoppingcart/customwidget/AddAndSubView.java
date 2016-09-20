package com.done.shoppingcart.customwidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.done.shoppingcart.R;

/**
 * 自定义布局：中间是可输入的EditText ，两侧分别是加减按钮
 */
public class AddAndSubView extends LinearLayout {

    public AddAndSubView(Context context) {
        super(context);
        init(null, 0);
    }

    public AddAndSubView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public AddAndSubView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        // Load attributes
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.AddAndSubView, defStyle, 0);

    }
}
