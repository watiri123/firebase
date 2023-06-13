package com.example.firebaseactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.data.UiToolingDataApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firebaseactivity.ui.theme.FirebaseActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, UiToolingDataApi::class)
@Composable
fun Greeting() {
    var texts by remember { mutableStateOf(TextFieldValue("")) }
    var name by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        OutlinedTextField(
            value = texts,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                texts = it
            },
            label = { Text(text = "Full Name") },
            placeholder = { Text(text = "Enter your Full Name") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
                disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )

        OutlinedTextField(
            value = name,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                name = it
            },
            label = { Text(text = "Email") },
            placeholder = { Text(text = "Enter your Username") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor = Color(0XFF9575CD),
                disabledPlaceholderColor = Color(0XFF9575CD)),
            modifier = Modifier
                .background(color = Color.DarkGray)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {},

            modifier = Modifier,
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RectangleShape,
            border = BorderStroke(2.dp, Color.Black),
        )
        {
            Text(
                "SUBMIT", color = Color(0XFF9575CD),
                fontSize = 15.sp
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirebaseActivityTheme {
        Greeting()
    }
}