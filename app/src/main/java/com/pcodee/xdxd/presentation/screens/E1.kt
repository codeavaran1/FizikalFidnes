package com.pcodee.xdxd.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pcodee.xdxd.R
import com.pcodee.xdxd.presentation.components.DropdownMenu


@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 1280, heightDp = 800)
@Composable
fun E1() {

    val shape = RoundedCornerShape(15.dp)

    Column {

        //Top Bar
        TopAppBar(backgroundColor = Color.White) {

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {

                Text(text = "ثبت آزمون", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Rounded.ArrowForward,
                    contentDescription = "Icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {/*TODO*/ }
                )
            }
        }


        Surface(Modifier.fillMaxSize(), color = Color(0xFFF3F5F7)) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(shape)
                    .background(color = Color.White)
            ) {

                Spacer(Modifier.padding(top = 10.dp))

                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)) {

                    Spacer(Modifier.padding(10.dp))

                    //Warning Image
                    Image(
                        painter = painterResource(id = R.drawable.warning),
                        contentDescription = "",
                        Modifier.clickable { }
                    )

                    Spacer(Modifier.padding(5.dp))

                    //Questions Image
                    Image(
                        painter = painterResource(id = R.drawable.question),
                        contentDescription = "",
                        Modifier.clickable { }
                    )

                    Spacer(Modifier.padding(start = 150.dp, top = 30.dp))

                    //Fire Fighter Drop Down Menu
                    Box(
                        Modifier
                            .width(350.dp)
                            .height(90.dp)
                    ) {

                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {

                            Text("آتش نشان", fontSize = 15.sp, fontWeight = FontWeight.Medium)
                            Spacer(Modifier.padding(end = 10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.bullet),
                                contentDescription = ""
                            )
                            Spacer(Modifier.padding(end = 20.dp))
                        }
                        DropdownMenu()
                    }

                    Spacer(modifier = Modifier.padding(start = 150.dp))

                    //Shift Drop Down Menu
                    Box(
                        Modifier
                            .width(350.dp)
                            .height(90.dp)) {

                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {

                            Text("شیفت", fontSize = 15.sp, fontWeight = FontWeight.Medium)
                            Spacer(Modifier.padding(end = 10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.bullet),
                                contentDescription = ""
                            )
                            Spacer(Modifier.padding(end = 20.dp))
                        }
                        DropdownMenu()
                    }
                }


            }
        }
    }
}