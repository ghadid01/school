package com.example.school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.school.screens.About
import com.example.school.screens.Gallery
import com.example.school.screens.Home
import com.example.school.ui.theme.GreenGN
import com.example.school.ui.theme.SchoolTheme


class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchoolTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomBar()
                }
            }
        }
    }
}

@Composable
fun BottomBar(){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold (
        bottomBar = {
            BottomAppBar(
                containerColor = GreenGN
            ) {
                IconButton(
                    onClick = {
                        selected.value= Icons.Default.Home
                        navigationController.navigate(Screens.Home.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Home,contentDescription = null, modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray )

                }
                IconButton(
                    onClick = {
                        selected.value= Icons.Default.MoreHoriz
                        navigationController.navigate(Screens.About.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.MoreHoriz,contentDescription = null, modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.MoreHoriz) Color.White else Color.DarkGray )

                }
                IconButton(
                    onClick = {
                        selected.value= Icons.Default.Photo
                        navigationController.navigate(Screens.Gallery.screen){
                            popUpTo(0)
                        }
                    },
                    modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Photo,contentDescription = null, modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Photo) Color.White else Color.DarkGray )

                }
            }
        }
    ){paddingValues ->
        NavHost(navController = navigationController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)){
            composable(Screens.Home.screen){ Home()}
            composable(Screens.About.screen){ About()}
            composable(Screens.Gallery.screen){ Gallery()}



        }


    }


}
@Preview
@Composable
fun BottomBarPreview(){
    SchoolTheme {
        BottomBar()
    }
}
//class MainActivity : ComponentActivity() {
//
//    lateinit var navController: NavHostController
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            SchoolTheme {
//                // A surface container using the 'background' color from the theme
//                navController = rememberNavController()
//                Nav(navController = navController)
//            }
//        }
//    }
//}

//package com.example.school
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.navigation.compose.rememberNavController
//import com.example.school.ui.theme.SchoolTheme
//import com.example.school.ui.theme.Nav
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            SchoolTheme {
//                // A surface container using the 'background' color from the theme
//                val navController = rememberNavController()  // Initialize NavController directly here
//                Nav()  // No need to pass navController anymore as it's handled inside Nav composable
//            }
//        }
//    }
//}








