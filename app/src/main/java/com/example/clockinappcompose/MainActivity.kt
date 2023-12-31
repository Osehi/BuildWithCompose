package com.example.clockinappcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
//import androidx.navigation.NavHostController
import com.example.clockinappcompose.model.Guest
import com.example.clockinappcompose.storage.TemporaryStorage
import com.example.clockinappcompose.ui.theme.ClockInAppComposeTheme
import com.example.clockinappcompose.utilities.Utilities

class MainActivity : ComponentActivity() {

//    private lateinit var temporaryStorage: TemporaryStorage
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClockInAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // initialize storage
//                    temporaryStorage = TemporaryStorage()
                    navController = rememberNavController()
                    SetupNavGraph(navController = navController)


                }
            }
        }
    }
}
/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterYourName() {
    val temporaryStorage = TemporaryStorage()
    val contextForToast = LocalContext.current.applicationContext
    var value by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = value,
            onValueChange = {
                newText -> value = newText
        },
            placeholder = { Text(text = "Enter name")},
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
            )
        Button(
            onClick = {
//                Toast.makeText(contextForToast, value, Toast.LENGTH_LONG).show();
                val capturedDate = Utilities.getInstantDate()
                val capturedTime = Utilities.getInstantTime()
                val myGuest = Guest(value, capturedDate, capturedTime)
                temporaryStorage.addGuest(myGuest);
                Toast.makeText(contextForToast, "My Gust is ${myGuest}", Toast.LENGTH_LONG).show()

                      },
            shape = CutCornerShape(10),
            modifier = Modifier
                .clickable {}
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Save Name",
                color = Color.White,
                fontSize = 20.sp

            )
        }
        Button(
            onClick = {
                      // to navigate to another screen
                      },
            shape = CutCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
            ) {
                Text(
                    text = "View Record",
                    color = Color.White,
                    fontSize = 20.sp
                )
        }
    }
}

 */

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClockInAppComposeTheme {

    }
}