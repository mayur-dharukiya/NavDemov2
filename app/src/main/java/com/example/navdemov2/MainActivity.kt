package com.example.navdemov2

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navdemov2.ui.theme.NavDemov2Theme
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavDemov2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                     val navController= rememberNavController()


                }
            }
        }
    }
}
@Composable
fun LoginScreen(navController: NavController)
{
    //Text-LoginScreen
    //Button-Go to Profile
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Login Screen")
        Button(onClick = { /*TODO*/ }) {

            Text(text = "Go to Profile Screen")
        }
    }

}



@Composable
fun ProfileScreen(navController: NavController,name:String,userId:String,created:Long)
{
    //Text- Data from Login Screen
    //Button-Go to Post screen

    val user = rememberSaveable{
        User(
            name = name,
            id = userId,
            created = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(created), ZoneId.systemDefault()
            )
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Profile Screen:$user",textAlign= TextAlign.Center)
        Button(onClick = { /*TODO*/ }) {

            Text(text = "Go to Post  Screen")
        }
    }
}

@Composable
fun PostScreen(showPost:Boolean=false)
{
    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center)
    {
        Text(text = "Post Screen $showPost")
    }
}

