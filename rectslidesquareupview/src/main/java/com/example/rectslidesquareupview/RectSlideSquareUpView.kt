package com.example.rectslidesquareupview

import android.content.Context
import android.app.Activity
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.graphics.Canvas
import android.view.View
import android.view.MotionEvent

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#2196F3",
    "#8BC34A",
    "#FF5722",
    "#3F51B5"
).map {
    Color.parseColor(it)
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
val parts : Int = 2
val scGap : Float = 0.02f / parts
val squareSizeFactor : Float = 5.9f
val rectSizeFactor : Float = 6.9f

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
