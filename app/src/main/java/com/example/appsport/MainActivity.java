package com.example.appsport;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.AppBarLayout;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo, txtResultado;
    private AppBarLayout appBarLayout;
    private EditText edtPassos;
    private RadioGroup radioGroupTpasso;
    private RadioButton rbCurto, rbMedio, rbLongo;
    private CheckBox cbxCorrer;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        appBarLayout = findViewById(R.id.appBarLayout);
        edtPassos = findViewById(R.id.edtPassos);
        radioGroupTpasso = findViewById(R.id.radioGroupTpasso);
        rbCurto = findViewById(R.id.rbCurto);
        rbMedio = findViewById(R.id.rbMedio);
        rbLongo = findViewById(R.id.rbLongo);
        cbxCorrer = findViewById(R.id.cbCorrer);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

                int totalScrollRange = appBarLayout.getTotalScrollRange();
                float percentage = (float) Math.abs(verticalOffset) / totalScrollRange;

                txtTitulo.setAlpha(1 - percentage);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateDistance();
            }
        });
    }

    private void calculateDistance() {
        String stepsStr = edtPassos.getText().toString();
        if (stepsStr.isEmpty()) {
            txtResultado.setText("Por favor, insira a quantidade de passos.");
            return;
        }

        int steps = Integer.parseInt(stepsStr);

        double stepSize = 0;
        int selectedId = radioGroupTpasso.getCheckedRadioButtonId();
        if (selectedId == rbCurto.getId()) {
            stepSize = 0.5; // Tamanho curto
        } else if (selectedId == rbMedio.getId()) {
            stepSize = 0.7; // Tamanho médio
        } else if (selectedId == rbLongo.getId()) {
            stepSize = 1.0; // Tamanho longo
        }

        double distance = steps * stepSize;

        if (cbxCorrer.isChecked()) {
            distance *= 1.1;
        }

        txtResultado.setText("Distância percorrida: " + String.format("%.2f", distance) + " metros");
    }
}
