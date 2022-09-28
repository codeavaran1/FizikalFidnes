package com.pcodee.xdxd.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Cards(
    backGroundColor1 : Color ,
    backGroundColor2 : Color ,
    text1:String ,
    text2:String ,
    modifier: Modifier = Modifier

) {
    Row(modifier=Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly ) {
        Card(
            modifier = Modifier
                .clickable { }
                .padding(8.dp)
                .border(1.dp,Color(199,202,205,255))

            ,
            shape  = MaterialTheme.shapes.small ,
        ){
            Column(verticalArrangement = Arrangement.SpaceEvenly) {
                Text(text="", modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(50.dp)
                    .border(1.dp, Color(199,202,205,255))
                    .background(color = backGroundColor1))
                Text(text = text1 , modifier = Modifier.padding(8.dp).align(Alignment.CenterHorizontally) )
            }
        }
        Card(
            modifier = Modifier
                .clickable { }
                .padding(8.dp)
                .border(1.dp,Color(199,202,205,255))


            ,
            shape  = MaterialTheme.shapes.small ,
        ){
            Column(verticalArrangement = Arrangement.SpaceEvenly) {
                Text(text="", modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(1.dp,Color(199,202,205,255))
                    .background(color = backGroundColor2))
                Text(text = text2 , modifier = Modifier.padding(8.dp).align(Alignment.CenterHorizontally) )
            }
        }

    }


}