package io.mobileacademy.tracker_presentation

class NativeLib {

    /**
     * A native method that is implemented by the 'tracker_presentation' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'tracker_presentation' library on application startup.
        init {
            System.loadLibrary("tracker_presentation")
        }
    }
}