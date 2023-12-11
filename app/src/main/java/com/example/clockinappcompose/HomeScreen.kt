package com.example.clockinappcompose

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.clockinappcompose.model.Guest
import com.example.clockinappcompose.storage.TemporaryStorage
import com.example.clockinappcompose.utilities.Utilities

//lateinit var navController: NavController
@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        EnterYourName(navController)

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterYourName(receivedNav: NavController) {
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
//                toNavigateToDisplayScreen.invoke()
                      receivedNav.navigate(route = Screen.DisplayScreen.route)
            },
            shape = CutCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),

        ) {
            Text(
                text = "View Record",
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    val navController = NavController(LocalContext.current.applicationContext)
    HomeScreen(navController)
}