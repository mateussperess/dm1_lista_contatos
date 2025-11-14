package com.example.atividade_lista_contatos;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        gerarContatos();

        RecyclerView rvContatos = findViewById(R.id.rvContatos);
        Adaptador adapter = new Adaptador(contatos);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvContatos.setLayoutManager(layout);
        rvContatos.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void gerarContatos() {
        contatos = new ArrayList<Contato>();
        criarContato("Chico Lito", "chico@lito.com", "111", R.drawable.foto1);
        criarContato("Laércio Nunes", "laercio@nunes.com", "000", R.drawable.foto2);
        criarContato("Picopones", "picopones@email.com", "222", R.drawable.foto3);
        criarContato("Hamilton", "hamilto@email.com", "333", R.drawable.foto4);
        criarContato("Rico Noia", "ricasso@email.com", "444", R.drawable.foto5);
        criarContato("mano brown", "brown@email.com", "555", R.drawable.foto6);
        criarContato("Zezao", "zezo@email.com", "777", R.drawable.foto7);
        criarContato("Facass", "assface@email.com", "888", R.drawable.foto8);
        criarContato("Gru do Grau", "graugrus@email.com", "999", R.drawable.foto9);
        criarContato("Ricardo Mamilos", "mamilos@email.com", "110", R.drawable.foto10);
    }

    private void criarContato(String nome, String email, String fone, int foto) {
        Contato contato = new Contato(nome, email, fone, foto);
        contatos.add(contato);
    }
}