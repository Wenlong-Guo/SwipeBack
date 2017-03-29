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

### release
#### 0.1.0 You can set whether the covered activity can be linked
#### 0.0.9 Complete the main function
### To-Do List
- [ ] Perfect extensions
- [ ] Perfect samples

## License
```
Copyright 2017 Wenlong-Guo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
