package com.apptreesoftware.barcodescanexample

import de.mintware.barcode_scan.BarcodeScanPlugin
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine


class MainActivity: FlutterActivity() {
  override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
    flutterEngine.plugins.add(BarcodeScanPlugin())
  }
}
