package com.example.atividade_lista_contatos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    ArrayList<Contato> contatos;

    public Adaptador(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView txtNome;
        final TextView txtEmail;
        final TextView txtFone;
        final ImageView ivFoto;

        public ViewHolder(View view) {
            super(view);
            txtNome = (TextView) view.findViewById(R.id.txtNome);
            txtEmail = (TextView) view.findViewById(R.id.txtEmail);
            txtFone = (TextView) view.findViewById(R.id.txtFone);
            ivFoto = (ImageView) view.findViewById(R.id.ivFoto);
        }
    }

    @NonNull
    @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contato, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contato contato = contatos.get(position);
        holder.txtNome.setText(contato.getNome());
        holder.txtEmail.setText(contato.getEmail());
        holder.txtFone.setText(contato.getNumero());
        holder.ivFoto.setImageResource(contato.getFoto());
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }
}
