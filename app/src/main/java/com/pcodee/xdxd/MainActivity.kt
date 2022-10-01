package com.pcodee.xdxd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pcodee.xdxd.presentation.screens.Karname
import com.pcodee.xdxd.presentation.screens.modir1
import com.pcodee.xdxd.ui.theme.FizikaFidnesTheme
import com.pcodee.xdxd.util.Date


class MainActivity : ComponentActivity() {
    val date= Date()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FizikaFidnesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Karname(
                        year = date.todayInJalali[0],
                        month = date.todayInJalali[1],
                        day = date.todayInJalali[2],
                        time = date.timeOfDay,
                        name ="کامران اسفندیاری"
                    )
                }
            }
        }
    }
}







