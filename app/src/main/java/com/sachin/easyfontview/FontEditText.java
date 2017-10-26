package com.sachin.easyfontview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by sachin.maske on 10-08-2017.
 */

public class FontEditText extends EditText {

    public FontEditText(Context context) {

        super(context);
    }
    public FontEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context,attrs);
    }

    public FontEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomFont(context,attrs);
    }

    private void setCustomFont(Context ctx, AttributeSet attrs) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.FontTextView);
        String customFont = a.getString(R.styleable.FontTextView_fontName);
        setCustomFont(ctx, customFont);
        a.recycle();
    }

    public boolean setCustomFont(Context ctx, String asset) {
        Typeface tf = null;
        try {
            tf = Typeface.createFromAsset(ctx.getAssets(), asset);
        } catch (Exception e) {
            Log.e("FontView", "Could not get typeface: "+e.getMessage());
            return false;
        }

        setTypeface(tf);
        return true;
    }
}
