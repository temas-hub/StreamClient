package benchmark.protocol.temas.com.streamclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.temas.protocols.benchmark.udp.UdpClient

class MainActivity : AppCompatActivity() {

    /**
     * TODO:
     *
     * 1. Client/Server:
     *  1.1 Client send buffer controlled by a setter
     *
     *
     * 2. UI:
     *  2.1 Lag time graph (top screen)
     *  2.2 Data size controller(packets/sec, KB/sec)
     *

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("streamClient","Start Activity");
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            Log.d("streamClient","Creating UDP Client");
            val udpClient = UdpClient("192.168.1.7", 11100)
            Log.d("streamClient","Created...");
            udpClient.init()
            Log.d("streamClient","Init's done");
        } catch (e: Exception) {
            Log.e("streamClient", e.message, e)
        }
    }
}
