package uccs.jmccrumm.hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HintsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hints);

        Intent intent = getIntent();
        String hint = intent.getStringExtra(MapsActivity.HINT_EXTRA);

        TextView txtHint = (TextView) findViewById(R.id.txtHint);
        txtHint.setText(hint);

        ImageButton btnClose = (ImageButton) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
