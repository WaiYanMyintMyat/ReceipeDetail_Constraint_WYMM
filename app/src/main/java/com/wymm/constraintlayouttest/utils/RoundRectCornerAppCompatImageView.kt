package com.wymm.constraintlayouttest.utils

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView


/**
 * Created by Wai Yan Myint Myat on 2019-06-14.
 */
class RoundRectCornerAppCompatImageView : AppCompatImageView {

    private val radius = 50.0f
    private var path: Path? = null
    private var rect: RectF? = null

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    private fun init() {
        path = Path()

    }

    override fun onDraw(canvas: Canvas) {
        rect = RectF(0f, 0f, this.getWidth().toFloat(), this.getHeight().toFloat())
        path!!.addRoundRect(rect, radius, radius, Path.Direction.CW)
        canvas.clipPath(path)
        super.onDraw(canvas)
    }
}