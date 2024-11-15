package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun simple_ui(){
    Column {
        Text(text = "Hello World!", color = Color(0xFFF4CE14))
        Text(text = stringResource(id = R.string.title), color = Color(0xFFFFFFFF))
        Row {
            Button(onClick = {}) {
                Text(text = stringResource(id = R.string.order))
            }
            Image(painter = painterResource(id = R.drawable.biryani), contentDescription = "Biryani")
        }
    }


}


@Preview
@Composable
fun simple_ui_preview(){
    simple_ui()
}