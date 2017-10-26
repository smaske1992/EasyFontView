# EasyFontView
We can use this repository for assigning font to TextView and EditText in xml layout files in android.

1. You can add this in XML layout file like

for TextView :

<com.sachin.easyfontview.FontTextView
        android:id="@+id/txtFont"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="25sp"
        app:fontName="Pacifico.ttf"
        android:text="Hello World !"/>

for EditText :

<com.sachin.easyfontview.FontEditText
        android:id="@+id/txtFont"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="25sp"
        app:fontName="Pacifico.ttf"
        android:text="Hello World !"/>

2. You can add dyanamic font in java code like

for TextView :

FontTextView.setCustomFont(this,"Pacifico.ttf");

for EditText :

FontEditText.setCustomFont(this,"Pacifico.ttf");


