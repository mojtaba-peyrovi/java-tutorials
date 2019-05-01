### Kotlin Android App Development Tutorial 1
---
__UI Design Intro:__ The fist thing after creating the Hello World project, is to design or edit the UI. 

For this, we need to navigate to this folder:
```
app\res\layout\
``` 
and open this file: `activity_main.xml` and inside the text version, we see under `TextView` tag, there is a section saying:
```
android:text="Hello World!"
```
We can change the title Written in the middle of app to anything we want.

Next, we can get back to `design` view, and design the UI visually by drag/drop `controls` to the screen.

For example, labels in Java are called `TextView`.

__Positioning:__ When we put controls on the screen, we can add `Rules` to them. The 4 circles around the item container, are where we can define the rules. 

The default label that came with the app and said `Hello World` had the rules, and we saw them as spring looking shapes.


#### String Resources:
When we hardcode titles or any text, Android studio gives notifications, (yellow triangles with exclamation point) to say that it wouldn't work with other languages. In order to fix it, we need to add the text values to something called `string resources`.

We do it this way: 

Select the label, then from the right sidebar copy the value, then click the dropdown button next to the value, and it opens all resources. Now, we add a new resource and add the copied value as the `resource value`. This way, the text will be added to resources and later on, we can translate it to different languages using `strings.xml.`

If we go to this file:
```
app\res\values\strings.xml
```
we can see the values we added to resources, are already added to the xml file:
```
<string name="your_score">Your Score: %s</string>
<string name="time_left">Time Left: %s</string>
```

It works also if we type directly inside the xml file.

#### Activity:

Each Android app consists of a bunch of screens doing different things. Each of these actions are called an `activity.` So, an activity is an action that the user of the app may perform. e.g. Logging in, the setting screen is another activity, the account detail screen is another activity.

The main app logic that will be written in Kotlin, is stored at:
```
app\java\com.example.APP_NAME\MainActivity.tk
```
This code comes with the following items:

1) Package name: which is a group of codes and it is almost like the identifier of the code.
2) import: which is reporting other classes.
3) class definition: It is declaring `MainActivity` class, that extends the class `AppMainActivity()`.
4) overriding onCreate function (method). `fun means function`. onCreate method is the entry point of the code.

__R File:__ R file is a resource file Android generates which we can access all the resources through it. 

At the last line of the Kotlin code, we see that we set the content view to `activity_main.xml` which is the address of the UI.

#### Android Manifest: 

Every Android app, has a file called `android.manifest.xml` that shows that which activity is shown first, what are available activities, etc.

It is located here:
```
app\manifests
``` 

#### Adding some logic:

Inside `mainActivity.tk`, on the top of the class, we declare the button, and the score textView like this:
```   

internal lateinit var tapMeButton: Button    // Button class should be imported on the top
internal lateinit var gameScoreTextView : TextView   // TextView class should be imported on the top
internal lateinit var gameScoreTextView : TextView

```
And inside onCreate() method, we can add this:

```
tapMeButton = findViewById<Button>(R.id.tap_btn)   // here we linked the variable, to our tap_btn control on the UI
gameScoreTextView = findViewById<TextView>(R.id.game_score_text_view)
timeLeftTextView = findViewById<TextView>(R.id.time_left_text_view)
```

##### REMINDER:

In oop terminology, data object is named `property` and action object is named `method`.

For example in MainActivity() class, the button and two textViews are properties and onCreate() is method.

In Java, here is how we define variables and constants:
```
var my_var = "player one";   // variables

val my_val = 123;   // constants

```
For making the app work, we need to create a click listener for the button we made, and the best place for it, is inside onCreate() method.

Here is the whole code so far inside MainActivity.tk:
```

    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView : TextView
    internal lateinit var timeLeftTextView: TextView
    internal var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tapMeButton = findViewById<Button>(R.id.tap_btn)
        gameScoreTextView = findViewById<TextView>(R.id.game_score_text_view)
        gameScoreTextView.text = getString(R.string.your_score, score.toString())
        timeLeftTextView = findViewById<TextView>(R.id.time_left_text_view)
        tapMeButton.setOnClickListener {
            view ->
            incrementScore()
        }
    }

    private fun incrementScore() {
       score += 1
       val newScore = getString(R.string.your_score, score.toString())
       gameScoreTextView.text = newScore

    }
```
This line:
```
gameScoreTextView.text = getString(R.string.your_score, score.toString())
```
is used to initialize the score of zero instead of having %s.














