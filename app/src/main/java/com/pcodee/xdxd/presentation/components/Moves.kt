package com.pcodee.xdxd.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Moves(
    backgroundColor : Color,
    title:String,
    time:String,
    amount:String,
    score:String

    ) {

    val title1 =title
    Row(
        Modifier
        .height(60.dp)
        .padding(2.dp)
        .fillMaxWidth()
        .background(backgroundColor),
    //horizontalArrangement = Arrangement.SpaceEvenly,
    verticalAlignment = Alignment.CenterVertically
    ) {
        Text(score, modifier = Modifier.padding(end = 90.dp, start = 90.dp))
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )
        Text(amount, modifier = Modifier.padding(end = 90.dp, start = 90.dp))
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )
        Text(time, modifier = Modifier.padding(end = 90.dp, start = 90.dp))
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )
        Text(title1,modifier = Modifier.padding(start = 90.dp))
    }

}