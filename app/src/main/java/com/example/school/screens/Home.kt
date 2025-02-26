package com.example.school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.school.R
import com.example.school.ui.theme.font

@Composable
fun Home() {
    Box(modifier= Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.index),
            contentDescription = "background image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = buildAnnotatedString {
            append("Welcome to")
            withStyle(
                SpanStyle(
                    color = Color.Yellow,
                    fontFamily = font,
                    fontSize = 45.sp
                )
            ){
                append("Faulu")
            }


        },
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold)


    }


}
@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home()

}




//package com.example.school.ui.theme
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import com.example.school.R
//import com.example.school.Screen
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.navigation.compose.rememberNavController
//
//
//@Composable
//fun Home(navController: NavHostController) {
//    Box(modifier = Modifier.fillMaxSize()) {
//        // Background Image
//        Image(
//            painter = painterResource(id = R.drawable.index),
//            contentDescription = "background image",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.matchParentSize()
//        )
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState()),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // Welcome Text with Faulu Highlighted
//        Text(
//            text = buildAnnotatedString {
//                append("Welcome to ")
//                withStyle(
//                    SpanStyle(
//                        color = Color.Yellow,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 45.sp
//                    )
//                ) {
//                    append("Faulu")
//                }
//            },
//            fontSize = 40.sp,
//            fontWeight = FontWeight.SemiBold
//        )
//
//        // Navigation Buttons
//        Button(
//            onClick = { navController.navigate(route = Screen.About.route) },
//            modifier = Modifier.padding(6.dp),
//            colors = ButtonDefaults.buttonColors(Color.Green)
//        ) {
//            Text(text = "About Us", fontSize = 18.sp)
//        }
//
//        Spacer(modifier = Modifier.height(50.dp))
//
//        // Bottom Navigation Bar
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(45.dp)
//                .background(color = Color.Gray),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceAround
//        ) {
//            Button(onClick = { navController.navigate(route = Screen.Home.route) }) {
//                Text(text = "Home")
//            }
//            Button(onClick = { navController.navigate(route = Screen.About.route) }) {
//                Text(text = "About")
//            }
//            Button(onClick = { navController.navigate(route = Screen.Gallery.route) }) {
//                Text(text = "Gallery")
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//fun HomePreview() {
//    Home(navController = rememberNavController()) // Using rememberNavController for preview
//}




