# SwipeBack
To achieve a swiping return function, the cover of the Activity can be moved, with shadows
## Getting started

In your ```build.gradle:```

```
dependencies {
    compile 'me.guowenlong.swipeback:swipe-back:0.0.9'
}
```
## Usage
Step 1:make your ```Activity``` extends ```SwipeBackActivity```
```
public class CommonActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSlideEnable(true);//default is true
    }
}
```
Step 2:Make window translucent by adding ```<item name="android:windowIsTranslucent">true</item>``` to your theme.
```
<!-- Application theme. -->
<style name="SwipeTheme" parent="@style/Theme.AppCompat.Light.NoActionBar">
    <item name="android:windowIsTranslucent">true</item>
</style>
```
Step 3:You can set this to control whether you can swipe 
```
//default is true
setSlideEnable(true);
```
### To-Do List
- [ ] Perfect extensions
- [ ] Perfect samples

