package com.example.practica_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleCuentaActivity extends AppCompatActivity {
    private TextView tvNombreCuenta;
    private Button btnRegistrarMovimiento;
    private Button btnVerMovimientos;
    private Button btnSincronizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuenta);

        // Obtener los elementos de la interfaz
        tvNombreCuenta = findViewById(R.id.tv_nombre_cuenta_detalle);
        btnRegistrarMovimiento = findViewById(R.id.btn_registrar_movimiento);
        btnVerMovimientos = findViewById(R.id.btn_ver_movimientos);
        btnSincronizar = findViewById(R.id.btn_sincronizar);


        // Simplemente mostraremos el nombre de la cuenta en el TextView de nombre
        String nombreCuenta = getIntent().getStringExtra("nombre_cuenta"); // Reemplaza con el nombre de la cuenta seleccionada
        tvNombreCuenta.setText(nombreCuenta);

        // Obtener el ID de la cuenta seleccionada
        long cuentaId = getIntent().getLongExtra("cuenta_id", -1);

        // Configurar los listeners de los botones
        btnRegistrarMovimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para registrar un movimiento en la cuenta seleccionada
                // Crea un Intent para abrir la actividad RegistroMovimientoActivity
                Intent intent = new Intent(DetalleCuentaActivity.this, RegistroMovimientoActivity.class);

                // Pasa el cuentaId como extra en el Intent
                intent.putExtra("cuenta_id", cuentaId);

                // Inicia la actividad RegistroMovimientoActivity
                startActivity(intent);

                // Muestra un mensaje o realiza otras acciones si es necesario
                Toast.makeText(DetalleCuentaActivity.this, "Registrar movimiento", Toast.LENGTH_SHORT).show();
            }
        });

        btnVerMovimientos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad ListaMovimientosActivity y pasar el cuentaId
                Intent intent = new Intent(DetalleCuentaActivity.this, ListaMovimientosActivity.class);
                intent.putExtra("cuenta_id", cuentaId);
                startActivity(intent);
                Toast.makeText(DetalleCuentaActivity.this, "Ver movimientos", Toast.LENGTH_SHORT).show();
            }
        });

        btnSincronizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para sincronizar la cuenta con el servicio web
                Toast.makeText(DetalleCuentaActivity.this, "Sincronizar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}