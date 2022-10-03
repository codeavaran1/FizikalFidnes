package com.pcodee.xdxd.util

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class CheckListNav(
    val checkListNav : MutableList<Int>
): Parcelable