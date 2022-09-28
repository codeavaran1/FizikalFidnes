package com.pcodee.xdxd.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pcodee.xdxd.R
import com.pcodee.xdxd.presentation.components.Timer

@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 1280, heightDp = 800)
@Composable
fun E5() {

    var textState1 by remember { mutableStateOf("") }
    val shape = RoundedCornerShape(15.dp)

    Column {

        //Top Bar
        TopAppBar(backgroundColor = Color.White) {

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {

                Text(text = "آزمون دراز نشست", fontSize = 25.sp, fontWeight = FontWeight.Bold)

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

        Surface(color = Color(0xFFF3F5F7)) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(shape)
                    .background(color = Color.White)
            ) {

                Spacer(modifier = Modifier.padding(top = 20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(start = 25.dp, top = 15.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.instruction),
                        contentDescription = ""
                    )

                    Spacer(modifier = Modifier.padding(start = 20.dp, bottom = 20.dp))

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {

                        Row {

                            //bullet (Same as Title)
                            Text(text = "آزمون دراز نشست\t\t", fontSize = 24.sp)

                            Image(
                                painter = painterResource(id = R.drawable.bullet),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding(top = 8.dp)
                            )

                            Spacer(modifier = Modifier.padding(horizontal = 30.dp))

                        }

                        Spacer(modifier = Modifier.absolutePadding(top = 20.dp))

                        Row {

                            Text(
                                text = "رضا رحمانی",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Medium
                            )

                            Text("\t\t:آزمون دهنده\t", fontSize = 30.sp)

                            //Image
                            Image(
                                painter = painterResource(id = R.drawable.baselineperson24px),
                                modifier = Modifier.size(40.dp),
                                contentScale = ContentScale.Crop,
                                contentDescription = ""
                            )

                            Spacer(modifier = Modifier.padding(horizontal = 45.dp))

                        }
                    }
                }

                Spacer(modifier = Modifier.padding(30.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Spacer(modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp))

                        //Timer
                        Timer(
                            totalTime = 15L * 1000L,
                            modifier = Modifier.size(130.dp)
                        )

                        Spacer(modifier = Modifier.padding(vertical = 10.dp))

                        Row(verticalAlignment = Alignment.Top) {

                            //Test Result Text
                            OutlinedTextField(
                                modifier = Modifier
                                    .width(130.dp)
                                    .height(30.dp),
                                value = textState1,
                                onValueChange = {textState1 = it},
                                readOnly = false,
                                singleLine = true,
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    focusedBorderColor = Color.LightGray,
                                    unfocusedBorderColor = Color.LightGray
                                )
                            )

                            Spacer(modifier = Modifier.padding(horizontal = 20.dp, vertical = 50.dp))

                            Text(
                                "تعداد دراز نشست در ۶۰ ثانیه",
                                fontSize = (24.sp),
                                modifier = Modifier.padding(top = 7.dp)
                            )

                            Image(
                                painter = painterResource(id = R.drawable.bullet),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(20.dp)
                            )
                        }
                    }

                    Divider(color = Color.Gray, modifier = Modifier.height(200.dp).width(1.dp))

                    Image(
                        painter = painterResource(id = R.drawable.situp),
                        modifier = Modifier.size(200.dp),
                        contentDescription = ""
                    )

                    Spacer(modifier = Modifier.padding(horizontal = 80.dp))
                }

                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Spacer(modifier = Modifier.padding(horizontal = 20.dp))

                    //Gradient
                    val gradientGreenToGreen = Brush.horizontalGradient(0f to Color(0xFF66EA95), 1000f to Color(0xFF54E459))

                    //Next Level Button
                    Button(
                        modifier = Modifier
                            .width(240.dp)
                            .height(65.dp)
                            .shadow(elevation = 15.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                        contentPadding = PaddingValues(),
                        shape = CutCornerShape(5.dp),
                        onClick = { }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(gradientGreenToGreen),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "<\t\tمرحله بعد", color = Color.White, fontSize = 35.sp)
                        }
                    }
                }
            }
        }
    }
}