package com.example.school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.school.R

@Composable
fun Gallery(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box (modifier= Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(Color.Blue),
        ){
            Text(modifier = Modifier
                .padding(20.dp)
                .padding(start = 40.dp),
                textAlign = TextAlign.Center,
                text = "Faulu International",
                color = Color.Yellow,
                fontFamily = FontFamily.Cursive,
                fontSize=25.sp
            )
        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.bb),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.bus),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.dining),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.hallway),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.inauma),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.learning),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.library),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.lockers),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.nini),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.LightGray)
            .height(250.dp)
            .width(300.dp)
        ){
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.trophy),
                contentDescription = "School iMAGE",
                contentScale = ContentScale.Crop
            )

        }


    }
}

@Preview(showBackground = true)
@Composable
fun GalleryPreview(){
    Gallery()

}

//package com.example.school.ui.theme
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.school.R
//import com.example.school.Screen
//
//@Composable
//fun Gallery(navController: NavHostController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState())
//            .background(MaterialTheme.colorScheme.primaryContainer),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Box(modifier = Modifier
//            .fillMaxWidth()
//            .height(75.dp)
//            .background(Color.Blue),
//        ) {
//            Text(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .padding(start = 40.dp),
//                textAlign = TextAlign.Center,
//                text = "Faulu International",
//                color = Color.Yellow,
//                fontFamily = font,
//                fontSize = 25.sp
//            )
//        }
//
//        // Reusable Image Card Composable
//        val imageResources = listOf(
//            R.drawable.bb to "School Image",
//            R.drawable.bus to "School Bus",
//            R.drawable.dining to "Dining Area",
//            R.drawable.hallway to "Hallway",
//            R.drawable.inauma to "Inauma",
//            R.drawable.learning to "Learning",
//            R.drawable.library to "Library",
//            R.drawable.lockers to "Lockers",
//            R.drawable.nini to "Nini",
//            R.drawable.trophy to "Trophy"
//        )
//
//        imageResources.forEach { (imageResId, description) ->
//            ImageCard(imageResId = imageResId, contentDescription = description)
//        }
//
//        // Bottom Row with Navigation Buttons
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(45.dp)
//                .background(color = Color.Gray),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Button(
//                onClick = { navController.navigate(route = Screen.Home.route) },
//                modifier = Modifier.padding(horizontal = 8.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
//            ) {
//                Text(text = "Home", fontSize = 16.sp)
//            }
//
//            Button(
//                onClick = {
//                    navController.navigate(route = Screen.About.route)
//                    navController.popBackStack()
//                },
//                modifier = Modifier.padding(horizontal = 8.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
//            ) {
//                Text(text = "About", fontSize = 16.sp)
//            }
//
//            Button(
//                onClick = { navController.navigate(route = Screen.Gallery.route) },
//                modifier = Modifier.padding(horizontal = 8.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
//            ) {
//                Text(text = "Gallery", fontSize = 16.sp)
//            }
//        }
//    }
//}
//
//@Composable
//fun ImageCard(imageResId: Int, contentDescription: String) {
//    Box(
//        modifier = Modifier
//            .padding(5.dp)
//            .clip(RoundedCornerShape(25.dp))
//            .background(Color.LightGray)
//            .height(250.dp)
//            .width(300.dp)
//    ) {
//        Image(
//            modifier = Modifier.fillMaxSize(),
//            painter = painterResource(imageResId),
//            contentDescription = contentDescription,
//            contentScale = ContentScale.Crop
//        )
//    }
//}
//
//@Preview
//@Composable
//fun GalleryPreview() {
//    Gallery(navController = rememberNavController()) // Using rememberNavController for preview
//}


