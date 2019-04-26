package smktelkom.www.android4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, editHasil, editKeliling;
    private Button btnOk;
    private TextView txtsisi, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI() {
        txtsisi = findViewById(R.id.txtsisi);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
        editSisi = findViewById(R.id.editSisi);
        editHasil = findViewById(R.id.editHasil);
        editKeliling = findViewById(R.id.editKeliling);
        btnOk = findViewById(R.id.btnOk);
    }

    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi * sisi;
        editHasil.setText(luas + "");
    }

    private void hitungKeliling() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4 * sisi;
        editKeliling.setText(keliling + "");
    }

}


