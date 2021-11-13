package com.awan.library

import android.content.Context
import com.google.android.exoplayer2.SimpleExoPlayer

/**
 * This class com.awan.library
 * Created by Awan88 on 13/11/2021.
 */


object MediaPlayer{

    var exoPlayer: SimpleExoPlayer? = null

    fun initialize(context: Context?){
        if (context != null)
            exoPlayer = SimpleExoPlayer.Builder(context).build()
    }

    fun pausePlayer() {
        exoPlayer?.playWhenReady = false
        exoPlayer?.playbackState
    }

    fun startPlayer() {
        exoPlayer?.playWhenReady = true
        exoPlayer?.playbackState
    }

    fun stopPlayer() {
        exoPlayer?.stop()
    }

}