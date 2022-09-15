package com.pcodee.xdxd.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pcodee.xdxd.R
import com.pcodee.xdxd.components.Cards


@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 1280, heightDp = 800)
@Composable
fun modir1() {

    val shape = RoundedCornerShape(15.dp)
    var openDialog by remember{mutableStateOf(false)}


    //main column
    Column(modifier = Modifier.fillMaxSize()) {

        //Top Bar
        TopAppBar(backgroundColor = Color.White) {

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "صفحه مدیریت سامانه", fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(CenterVertically)
                )

            }
        }



        //main row
        Row(Modifier.fillMaxSize()) {


            //Left part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth(0.15f)) {
                Column(
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, top = 10.dp, bottom = 10.dp)

                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(modifier=Modifier.align(Alignment.CenterHorizontally),painter = painterResource(id = R.drawable.idepardazan), contentDescription ="Icon" )
                    Spacer(modifier=Modifier.padding(bottom = 150.dp))
                    Button(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(10.dp),
                        colors = ButtonDefaults.buttonColors(Color(255, 177, 41, 255)),

                        onClick = { openDialog = true },
                    ) {
                        Text(text = "درباره ی ما")

                    }
                    Button(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(255, 177, 41, 255)),

                        onClick = { /*TODO*/ },
                    ) {
                        Text(text = "  راهنمایی  ")

                    }
                }
            }


            //center part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth(0.90f)) {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth()
                ) {
                    Cards(backGroundColor1 = Color(103,157,255,255), text1 ="لیست بازرسان", text2 = "تعریف آیتم های بازرسی", backGroundColor2 = Color(234,96,83,255) )
                    Cards(backGroundColor1 = Color(244,245,247,255), text1 ="سوابق بازرسی", text2 = "تعریف بازرس", backGroundColor2 = Color(0,159,57,255) )
                    Cards(backGroundColor1 = Color(213,205,16,255), text1 ="گزارش گیری", text2 = "برنامه بازرسی", backGroundColor2 = Color(212,219,234,255) )
                    Cards(backGroundColor1 = Color(102,234,150,255), text1 ="تعریف واحد", text2 = "تعریف کلاس-زیرکلاس", backGroundColor2 = Color(253,209,160,255) )





                }
            }




            //right part
            Surface(color = Color(0xFFF3F5F7), modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                        .clip(shape)
                        .background(color = Color.White)
                        .fillMaxHeight()
                        .fillMaxWidth()
                    ,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier= Modifier
                        .padding(6.dp)
                        .align(Alignment.CenterHorizontally)) {
                        Image(modifier = Modifier.clickable {},painter= painterResource(id =R.drawable.profile ),contentDescription = "profile")
                        Spacer(modifier = Modifier.padding(top=24.dp))
                        Image(modifier = Modifier.clickable {},painter= painterResource(id =R.drawable.dashboard ),contentDescription = "dashboard")


                    }
                    Column(modifier= Modifier
                        .padding(6.dp)
                        .align(Alignment.CenterHorizontally)) {
                        Image(modifier = Modifier.clickable {},painter= painterResource(id =R.drawable.exit ),contentDescription = "exit")
                        Spacer(modifier = Modifier.padding(top=16.dp))
                        Image(modifier = Modifier.clickable {},painter= painterResource(id =R.drawable.setting ),contentDescription = "setting")

                    }
                }
            }





        }




    }
    if(openDialog){
        AlertDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or on the back
                // button. If you want to disable that functionality, simply use an empty
                // onCloseRequest.
                openDialog = false
            },
            title = {



            },
            text = {
                Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(8.dp)) {
                    Text(text = ": درباره ی ما", fontSize = 25.sp)
                    Text(textAlign = TextAlign.Right,
                        text="خاموش کردن آتش یا اطفاء حریق مجموعه اقداماتی است که برای مقابله با آتش به وسیلهٔ خاموش کردن، کنترل یا هدایت آتش\u200Cهای ناخواسته انجام می\u200Cگیرد. اهداف آتش\u200Cنشانی حفاظت از سلامت افراد، جلوگیری از آسیب به اموال و حفاظت از محیط زیست است.[۱]\n" +
                                "\n" +
                                "خاموش کردن" +
                                " یا اطفای حریق مهارتی" +
                                " بسیار فنی است که احتیاج به دوره\u200C" +
                                "های طولانی چه در زمینه\u200Cهای عمومی مانند مقابله با آتش" +
                                " و چه در زمینه\u200Cهای تخصصی مانند عملیات امداد و نجات دارد. به شخصی که به صورت" +
                                " تخصصی به مهارت\u200Cهای اطفاء حریق آشناست آتش\u200Cنشان می\u200Cگویند." +
                                " در زمان قاجار به آتش\u200Cنشانی «اطفائیه» و به آتش\u200Cنشان نیز «اطفائیه چی» گفته می\u200C" +
                                "شده\u200Cاست. آتش\u200Cنشانی یک شغل بسیار مهم، سخت، خطرناک، حرفه ایی" +
                                " و پر آسیبی است و آتش" +
                                "\u200Cنشان در هر عملیات امکان مجروح شدن یا فوت شدن را دارد" +
                                "آتش\u200Cنشانی هوایی گونه\u200Cای از عملیات مقابله با آتش است که در آن از مسیر هوا و هواگرد به منظور عملیات اطفاء آتش استفاده می\u200Cشود. این گونه عملیات بیشتر در آتش\u200Cسوزی\u200Cهای جنگل\u200Cها و مهار آتش\u200Cسوزیهایی که در مناطقی که از راه\u200Cهای زمینی غیرقابل دسترسی هستند، انجام می\u200Cشود. در این گونه عملیات از اقسام مختلف هواگرد که توانایی حمل مواد ضد آتش را دارند استفاده می\u200Cشود ولی هواپیما و بالگرد دو گونه پر کاربرد در این گونه مأموریت\u200Cها به حساب می\u200Cآیند.\n" +
                                "\n" +
                                "ایده هواپیماهای آتش\u200Cنشان نیز به مانند ایده هواپیمای آب\u200C" +
                                "نشین به منظور کمک رسانی و اطفاء حریق در مناطقی مطرح شد که به شکل" +
                                "\u200Cهای گوناگون دسترسی به آن\u200Cها مشکل است. ایالات متحده آمریکا نخستین " +
                                "پیشگام در این زمینه بود و با بهره\u200Cگیری از الگوی بمب\u200Cهای ناپالم که برای اولین بار در جنگ جهانی دوم مورد استفاده قرار گرفته بود، به طراحی و " +
                                "ساخت بمب\u200Cهای آبی روی آوردند که بر روی محوطه دچار حریق شده پرتاب شود و باعث خاموش شدن آتش شود؛ ولی به دلیل عدم موفقیت این روش، گزینه دیگری مطرح شد که همانا استفاده از مخازن آب است که پس از پر شدن از آب" +
                                " یا مایعات ضد آتش، با استفاده از هواگرد بر روی محل آتش\u200Cسوزی" +
                                " پاشیده می\u200Cشود؛ که این روش موفقیت\u200Cآمیز بوده و تا به امروز به عنوان روشی استاندارد برای" +
                                " اطفاء حریق هوایی به کار می" +
                                "\u200Cرود. ")

                }
            },
            confirmButton = {

            },
            dismissButton = {

            }
        )}

}