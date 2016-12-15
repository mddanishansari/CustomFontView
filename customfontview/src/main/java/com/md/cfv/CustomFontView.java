package com.md.cfv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontView extends TextView {
    String fontName;

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
        invalidate();
        requestLayout();
    }

    public CustomFontView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    public CustomFontView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomFontView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        try {
            if (attrs != null) {
                TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomFontView);
                fontName = a.getString(R.styleable.CustomFontView_fontName);
                if (fontName != null) {
                    Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
                    setTypeface(myTypeface);
                }
                a.recycle();
            }
        } catch (Exception e) {

        }

    }

}