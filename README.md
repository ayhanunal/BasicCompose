# BasicCompose

<p align="center">
✨ Kotlin, Basic Compose 
</p>

<p align="center">
<img src="https://github.com/ayhanunal/BasicCompose/main.png" width="32%"/>

</p>


### CustomText
```gradle
Text(modifier = Modifier
        .clickable {
            println("$text Screen Clicked")
        }
        .background(color = Color.Yellow)
        .padding(5.dp) // all padding
        .padding(top = 10.dp, start = 2.dp) //customize padding
        //.width(100.dp)
        //.height(110.dp)
        //.fillMaxSize(0.5f)
        ,text = "Hello $text",
        color = Color.Blue,
        fontSize = 30.sp,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Center,
    )
```

### MainScreen
```gradle
Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CustomText(text = "Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Compose")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
            ,horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomText(text = "Google")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Java")
        }

    }
```


