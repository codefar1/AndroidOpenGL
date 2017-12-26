package davy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.gcacace.signaturepad.views.SignaturePad;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import davy.myapplication.layout.CustomImageView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.image)
    CustomImageView customImageView;

    int i = 0;
    private SignaturePad mSignaturePad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        Glide.with(this).load(R.mipmap.pic1).asBitmap().into(new SimpleTarget<Bitmap>(customImageView.getLayoutParams().width, customImageView.getLayoutParams().height) {
//            @Override
//            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                Drawable drawable = new BitmapDrawable(getResources(), resource);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                    customImageView.setBackground(drawable);
//                }
//            }
//        });

        mSignaturePad = (SignaturePad) findViewById(R.id.signature_pad);
        mSignaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() {

            @Override
            public void onStartSigning() {
                //Event triggered when the pad is touched
            }

            @Override
            public void onSigned() {
                //Event triggered when the pad is signed
            }

            @Override
            public void onClear() {
                //Event triggered when the pad is cleared
            }
        });
    }

    @OnClick(R.id.button)
    public void text(View view) {
        if (i % 2 == 0) {
//            Glide.with(this).load(R.mipmap.pic1).asBitmap().into(customImageView);
//            Glide.with(this).load(R.mipmap.pic1).asBitmap().into(new SimpleTarget<Bitmap>(customImageView.getLayoutParams().width, customImageView.getLayoutParams().height) {
//                @Override
//                public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                    Drawable drawable = new BitmapDrawable(getResources(), resource);
//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                        customImageView.setBackground(drawable);
//                    }
//                }
//            });
            customImageView.setImageResource(R.mipmap.pic1);
        } else {
//            Glide.with(this).load(R.mipmap.pic2).asBitmap().into(customImageView);
//            Glide.with(this).load(R.mipmap.pic2).asBitmap().into(new SimpleTarget<Bitmap>(customImageView.getLayoutParams().width, customImageView.getLayoutParams().height) {
//                @Override
//                public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                    Drawable drawable = new BitmapDrawable(getResources(), resource);
//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                        customImageView.setBackground(drawable);
//                    }
//                }
//            });
            customImageView.setImageResource(R.mipmap.pic2);
        }
        i++;
    }
}
