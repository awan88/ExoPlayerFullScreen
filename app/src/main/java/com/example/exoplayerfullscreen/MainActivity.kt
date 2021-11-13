package com.example.exoplayerfullscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.awan.library.*
import com.google.android.exoplayer2.ui.PlayerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerView: PlayerView = findViewById(R.id.playerView)

        MediaPlayer.initialize(this)
        MediaPlayer.exoPlayer?.preparePlayer("Play Video", playerView, true)
        MediaPlayer.exoPlayer?.setSource(this, STREAM_URL)
        //MediaPlayer.startPlayer()
    }

    public override fun onPause() {
        super.onPause()
        MediaPlayer.pausePlayer()
    }

    public override fun onDestroy() {
        MediaPlayer.stopPlayer()
        super.onDestroy()
    }

    companion object {
        const val STREAM_URL = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"
    }
}