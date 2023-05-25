

RAPPORT: PREFERENCE

## Följande grundsyn gäller dugga-svar:

I denna uppgift ska man göra en second activity vilket är en annan aktivitet som huvud/main activity är kopplad till genom en knapp som går från huvudsidan till second activity.

I koden nedanför i onCreats sätts en layout för vald aktivitet samt textview till knappen via layout, en SharedPreferences-referens skapas även för att göra det möjligt att lagra och hämta data samt satta inställningar som sparas individuellt för varje användare. Genom en onClickListener blir det möjligt att knappen lyssnar efter klick och vid klick skapas en Intent för att starta andra aktiviteten.


```
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        data1 = findViewById(R.id.textView2);
        myPreferenceRef = getSharedPreferences( "preferences", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    } 

```


![](Ha_20230525.png)

