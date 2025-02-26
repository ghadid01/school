package com.example.school.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.school.ui.theme.font
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

import com.example.school.R
import com.google.firebase.Firebase
import com.google.firebase.database.database


@Composable
fun About(){
    val database = Firebase.database

    var name by remember { mutableStateOf("") }
    var email by remember {mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Column(modifier= Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
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
                fontFamily = font,
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
                painter = painterResource(R.drawable.faul),
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
                painter = painterResource(R.drawable.map),
                contentDescription = "School map"
            )

        }
        Box(modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(Color.White)
            .height(250.dp)
            .width(300.dp)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Location : Nairobi, Ngong' Rd")
                Spacer(modifier=Modifier.height(30.dp))
                Text(text="Courses Offered : KCSE & IGCSE")
            }


        }
        Text(
            modifier = Modifier
            .padding(start=40.dp),
            text = "Have a Question?")
        Spacer(modifier = Modifier.height(10.dp))




        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Contact Us", modifier = Modifier.padding(bottom = 20.dp))

            OutlinedTextField(
                value = name,
                onValueChange = { newText->name=newText },
                label = { Text("Name") },
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
            )

            OutlinedTextField(
                value=email ,
                onValueChange = { newText->email=newText },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
            )


            OutlinedTextField(
                value = message,
                onValueChange = { newText->message=newText },
                label = { Text("Message") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .height(150.dp)
            )

            val context= LocalContext.current
            Button(
                onClick = {
                    // Handle form submission
                    val contactsRef = database.reference.child("Contacts")
                    val contactRef=contactsRef.child(name)
                    val contact = com.example.school.screens.Contact(email,message)
                    contactRef.setValue(contact)
                    Toast.makeText(context,"Save Contact",Toast.LENGTH_SHORT).show()
                    name = ""
                    email = ""
                    message = ""

                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Submit")
            }
        }









    }



}
data class Contact(val email : String, val message: String)


@Preview(showBackground = true)
@Composable
fun AboutPreview(){
    About()

}






