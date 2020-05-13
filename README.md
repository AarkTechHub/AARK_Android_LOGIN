# AARK_Android_LOGIN
AARK Technology Hub, Login System, Animation, slide_left, slide_right, slide_up, slide_down 

This is the **LOGIN**, **SIGN UP**, and **FORGOT PASSWORD** page project developed in *Android Studio* by **AARK TECHNOLOGY HUB PVT LTD**,
with *Animation Transition* and *Custom Fonts*.

![Working Image](http://aarktechub.com/img/AARK-Login-system-vid.gif)

The designing part can be developed in the *ADOBE XD, ADOBE
ILLUSTRATOR or any other Design platform as per the requirement*. In our case
we have done this in **ADOBE XD** as *it is easily adjustable with the
devices*. We have also used **animation transitions and custom fonts** to provide rich look
and feel.

Animations in android apps can be performed through *XML and
android code*. There are many types of *Animations Techniques* and we have used **slide in, 
slide up, slide down and slide out**.

Here is the sample Code for **slide_in_down.xml**

```
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate
    android:duration="@android:integer/config_mediumAnimTime"
    android:fromYDelta="100%"
    android:toYDelta="0%" >
</translate>
</set>
```

In order to create the animation first we have to create an **android resource directory**. 
In the Dialog we will choose the resource type **anim** and click okay, an *anim* folder** will be created. 
Now inside the **anim folder** we have to create the **animation xml files**.

Inside Java Code as shown below after the start of activity we have to add **overridePendingTransition Method** for the 
animation Transition to take effect.
```
startActivity(new Intent(MainActivity.this,SignUpActivity.class));
overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
```

Now in order of Custom Fonts we have to again create an **android resource directory**. This time we choose the resource type **font** and click okay, 
an *font* folder** will be created. There we will put **TTF, OTF font files**.
Below we have shown how to use **custom font kaushanscript_regular**

```
<TextView
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
   android:layout_marginTop="48dp"
   android:text="SignUp"
   android:textSize="50sp"
   android:textColor="@android:color/white"
   android:paddingLeft="24dp"
   android:fontFamily="@font/kaushanscript_regular"
/>
```

