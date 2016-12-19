# CustomFontView
###  Easiest way to include custom fonts in your TextView

![CustomFontView Demo](screenshots.png)

###  How to 

### 1. Include dependency in your build.gradle file
```
compile 'com.md:customfontview:1.0'
```

### 2. Implement `CustomFontView` in your xml file and supply name of your font in `fontName` attribute

```
   <com.md.cfv.CustomFontView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World"
            app:fontName="Lobster.ttf" />
```

### 3. Put that font file in `assets` folder. That's it.

### Quite easy. Isn't it ?
