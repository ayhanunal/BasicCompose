package com.ayhanunal.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayhanunal.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }

        testFunction(1){
            //advanced kotlin- lambda
            testFunctionLambda()
        }

    }


    fun testFunction(s1: Int, myfunction: () -> Unit){
        myfunction()
    }

    fun testFunctionLambda(){
        println("TEST")
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Red,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold)
}


@Composable
fun MainScreen(){

    //Column, Row, Box  --> like flutter

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
            CustomText(text = "Test1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test2")
        }

    }


}

@Composable
fun CustomText(text: String){
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
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}