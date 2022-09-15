package com.pcodee.xdxd.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Date {
    private val currentDateInGregorian = LocalDateTime.now()
    private val formatter = DateTimeFormatter.BASIC_ISO_DATE
    private val formatted =currentDateInGregorian.format(formatter).toInt()
    /**Due to our need for 3 separate value for converting function,
    *We will parse the formatted date ,
    *That is like :"20220903" to year = 2022 , month = 9 , day =3*/
    private val year = formatted/10000
    private val month = formatted/100 - year*100
    private val day = formatted-(formatted/100)*100
    val todayInJalali=gregorianToJalali(year,month,day)
    /**In the next variable you have the time of the day base on your timezone , but that is static
     * , i've added a dynamic clock to the ShowDate composable, but if you need to add a time field to your for example docs or
     * your database , here you have it */
    val timeOfDay: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))
    private fun gregorianToJalali(gregorianYear: Int, gregorianMonth: Int, gregorianDay: Int): IntArray {
        val gregorianMonthAndDay: IntArray = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)
        val gy2: Int = if (gregorianMonth > 2) (gregorianYear + 1) else gregorianYear
        var days: Int = 355666 + (365 * gregorianYear) + ((gy2 + 3) / 4) - ((gy2 + 99) / 100) + ((gy2 + 399) / 400) + gregorianDay + gregorianMonthAndDay[gregorianMonth - 1]
        var jalaliYear: Int = -1595 + (33 * (days / 12053))
        days %= 12053
        jalaliYear += 4 * (days / 1461)
        days %= 1461
        if (days > 365) {
            jalaliYear += ((days - 1) / 365)
            days = (days - 1) % 365
        }
        val jalaliMonth: Int
        val jalaliDay: Int
        if (days < 186) {
            jalaliMonth = 1 + (days / 31)
            jalaliDay = 1 + (days % 31)
        } else {
            jalaliMonth = 7 + ((days - 186) / 30)
            jalaliDay = 1 + ((days - 186) % 30)
        }
        return intArrayOf(jalaliYear, jalaliMonth, jalaliDay)
    }
}