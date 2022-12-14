package com.pcodee.xdxd.presentation.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pcodee.xdxd.R
import com.pcodee.xdxd.presentation.components.Moves
import com.pcodee.xdxd.util.Date
import com.zachklipp.richtext.ui.printing.Printable
import com.zachklipp.richtext.ui.printing.rememberPrintableController
import com.zachklipp.richtext.ui.printing.responsivePadding


@Composable
fun Karname(year:Int,month:Int,day:Int,time:String,name:String) {
    val date = Date()
    val printableController = rememberPrintableController()
    val document = "ساعت :"+date.timeOfDay
    Surface(
        color = Color(0x9AF3F5F7),
        modifier = Modifier
            .fillMaxSize()
    ) {

        Printable(
            printableController,
            pageDpi = 96,
            modifier = Modifier
                .responsivePadding(
                    600.dp to 32.dp,
                    Dp.Infinity to 90.dp
                )
                .verticalScroll(rememberScrollState())
        ) {//printable

        Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar(backgroundColor = Color.White) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "کارنامه ➞",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .align(CenterHorizontally)
            ) {
                Surface(
                    color = Color(255, 255, 255),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row(modifier = Modifier.padding(8.dp)) {
                            Text(text = "$year/$month/$day")
                            Spacer(modifier = Modifier.padding(end = 16.dp))
                            Text(text = time, modifier = Modifier.padding(end = 280.dp))
                            Spacer(modifier = Modifier.padding(end = 36.dp))
                            Text(text = name + " ")
                            Text(text = ": آزمون دهنده ", fontStyle = FontStyle.Italic)
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = "",
                                modifier = Modifier.padding(end = 50.dp)
                            )
                            Text(
                                text = "کارنامه پایانی",
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier.padding(end = 8.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.bullet),
                                contentDescription = ""
                            )

                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp)
                        )
                        Row(modifier = Modifier.padding(12.dp)) {
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(100.dp)
                            ) {
                                Canvas(modifier = Modifier.fillMaxSize()) {
                                    val canvasWidth = size.width
                                    val canvasHeight = size.height

                                    drawCircle(
                                        color = Color(0xFFEC1414),
                                        center = Offset(x = canvasWidth / 2, y = canvasHeight / 2),
                                        radius = size.minDimension / 2,
                                        style = Stroke(7F)
                                    )
                                }
                                Text(
                                    text = ": نمره",
                                    color = Color.Red,
                                    modifier = Modifier.padding(top = 35.dp, start = 40.dp)
                                )
                            }
                            Text(
                                text = "خوب",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 50.dp, top = 30.dp)
                            )
                            Button(onClick = { printableController.print(document,document)},
                                modifier=Modifier.padding(start = 500.dp,top=25.dp).background(Color.Transparent)) {
                                Text(text = "pdf فایل ",color=Color.Black, )
                            }

                        }
                        Row(
                            Modifier
                                .height(60.dp)
                                .padding(2.dp)
                                .fillMaxWidth()
                                .background(Color(216, 241, 246, 255),),
                            //horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("نمره", modifier = Modifier.padding(end = 83.dp, start = 83.dp))
                            Divider(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(1.dp)
                            )
                            Text("تعداد", modifier = Modifier.padding(end = 83.dp, start = 77.dp))
                            Divider(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(1.dp)
                            )
                            Text("زمان", modifier = Modifier.padding(end = 83.dp, start = 80.dp))
                            Divider(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(1.dp)
                            )
                            Text("عنوان",modifier = Modifier.padding(start = 83.dp))
                        }



                        Column() {

                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "تست حرکات کششی",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "آزمون بارفیکس در 60 ثانیه",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "تست قدرت پنجه",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "نگه داشتن وزنه",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "آزمون دو 1500 متر",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "آزمون دو چابکی و سرعت چهار در نه",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "پرش جفت",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "دراز نشست",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "حمل آتش خاموش کن",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                                Moves(
                                    backgroundColor = Color(243, 248, 254, 255),
                                    title = "شنا خشک",
                                    time = "1",
                                    amount = "1",
                                    score = "1"
                                )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو استقامت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )
                            Moves(
                                backgroundColor = Color(243, 248, 254, 255),
                                title = "دو رفت و برگشت",
                                time = "1",
                                amount = "1",
                                score = "1"
                            )



                        }

                    }

                }
            }


        }
    }

    }

}
