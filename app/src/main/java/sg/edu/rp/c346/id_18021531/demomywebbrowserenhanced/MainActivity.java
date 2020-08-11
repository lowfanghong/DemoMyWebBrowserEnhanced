package sg.edu.rp.c346.id_18021531.demomywebbrowserenhanced;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btnLoadUrl;
WebView wvMyPage;
EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadUrl = findViewById(R.id.buttonLoad);
        etUrl = findViewById(R.id.editTextURL);
        wvMyPage = findViewById(R.id.WebviewMyPage);
        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Url = etUrl.getText().toString();
                wvMyPage.loadUrl(Url);
            }
        });


    }

}