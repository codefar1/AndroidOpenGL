package davy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import davy.myapplication.opengl.MyGLSurfaceView;

public class MainActivity extends AppCompatActivity {

    private MyGLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        final ActivityManager activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
//        final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
//
//        final boolean supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000
//                || (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
//                && (Build.FINGERPRINT.startsWith("unknown")
//                || Build.FINGERPRINT.startsWith("generic")));
//
//
//        // 创建一个GLSurfaceView对象，并将其设置为当前Activity的ContentView
//        mGLView = new MyGLSurfaceView(this);
//        setContentView(mGLView);


        setContentView(R.layout.color);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        mGLView.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        mGLView.onPause();
//    }
}
