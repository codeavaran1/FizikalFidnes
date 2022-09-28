package com.pcodee.xdxd.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pcodee.xdxd.R
import kotlinx.coroutines.delay

@Composable
fun Timer(
    modifier: Modifier = Modifier,
    totalTime: Long,
    inactiveBarColor: Color = Color(0xFFD8F1F6),
    activeBarColor: Color = Color(0xFFFF9F1A),
    initialValue: Float = 1f,
    strokeWidth: Dp = 5.dp
) {
    var size by remember {mutableStateOf(IntSize.Zero)}
    //value -> what kind of percentage is currently filled in our timer
    var value by remember {mutableStateOf(initialValue)}
    var currentTime by remember {mutableStateOf(totalTime)}
    var isTimerRunning by remember {mutableStateOf(false)}
    val timerStart = if(isTimerRunning && currentTime > 0L ){
            painterResource(id = R.drawable.timerpause) }
             else{ painterResource(id = R.drawable.timerstart)}


    LaunchedEffect(key1 = currentTime, key2 = isTimerRunning) {
        if(currentTime >= 0L && isTimerRunning) {
            delay(100L)
            value = (currentTime) / totalTime.toFloat()
            currentTime -= 100L

        }
    }

    Row(verticalAlignment = Alignment.CenterVertically) {

        Image(painter =  timerStart, contentDescription = "",

            Modifier.size(50.dp).clickable {
                    if (currentTime <= 0L) {
                        currentTime = totalTime
                        isTimerRunning = true
                        value = currentTime / totalTime.toFloat()

                    } else {
                        isTimerRunning = !isTimerRunning
                        value = currentTime / totalTime.toFloat()
                    }
                }
        )

        Spacer(modifier = Modifier.padding(end = 20.dp))

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.onSizeChanged {
            size = it
        }
    )  {

        Canvas(modifier = modifier) {
            drawArc(
                color = inactiveBarColor,
                startAngle = 360f,
                sweepAngle = 360f,
                useCenter = false,
                size = Size(size.width.toFloat(), size.height.toFloat()),
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )

            drawArc(
                color = activeBarColor,
                startAngle = -90f,
                sweepAngle = 360f * value,
                useCenter = false,
                size = Size(size.width.toFloat(), size.height.toFloat()),
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }

        //kharab shod column ro bardar
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = ((currentTime+100L) / 1000L).toString(),
                fontSize = 44.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                //modifier = Modifier.align(Alignment.BottomCenter),
                text = "ثانیه",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray
            )
        }
    }

        Spacer(modifier = Modifier.padding(start = 20.dp))

        Image(painter = painterResource(id = R.drawable.timerreset), contentDescription = "",
            Modifier.size(50.dp).clickable {

                    currentTime = totalTime
                    isTimerRunning = false
                    //recompose the animation
                    value = currentTime / totalTime.toFloat()


                }
        )
    }
}

@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 300, heightDp = 300)
@Composable
fun MyViewPreview() {
    Surface(color = Color.White) {
        Timer(totalTime = 5L * 1000L,modifier = Modifier.size(150.dp))
    }
}