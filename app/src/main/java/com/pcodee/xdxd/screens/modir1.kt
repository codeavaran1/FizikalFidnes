package com.pcodee.xdxd.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 1280, heightDp = 800)
@Composable
fun modir1() {

    val shape = RoundedCornerShape(15.dp)


    //main column
    Column {

        //Top Bar
        TopAppBar(backgroundColor = Color.White) {

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "صفحه مدیریت سامانه", fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(CenterVertically)
                )

            }
        }



        //main row
        Row(Modifier.fillMaxSize()) {


            //Left part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth(0.11f)) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                }
            }


            //center part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth(0.9f)) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                }
            }




            //right part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                }
            }





        }




    }
}