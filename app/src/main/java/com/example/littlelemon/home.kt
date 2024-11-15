package com.example.littlelemon

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navcontroller: NavController) {


val context = LocalContext.current

    Column (verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0XFF495E57))
        ){
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top=20.dp)
        )
        Text(
            text = stringResource(id = R.string.city),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )

        Row (
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Start,
        ){
            Text(
                text = stringResource(id = R.string.description),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp
            )
            Image(
                painter = painterResource(id = R.drawable.biryani),
                contentDescription = "Intro Image",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(40.dp))
            )
        }

        Button(
            onClick = {
                      Toast.makeText(context, "Order Successful", Toast.LENGTH_SHORT).show()
            },
            border = BorderStroke(1.dp, Color.Red),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF)),
            modifier = Modifier.padding(start = 20.dp, bottom = 20.dp),
        ) {
            Text(
                text = stringResource(id = R.string.order),
                color = Color.Black,)
        }
    }
}


/*
@Preview
@Composable
fun homeScreenPreview() {
    HomeScreen()
}
*/