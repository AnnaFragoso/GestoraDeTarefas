package com.example.desen.gestoradetarefas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TarefasFragment extends Fragment {


    public TarefasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tarefas, container, false);

        container = (ViewGroup) v.findViewById(R.id.container);
       // titulo = v.findViewById(R.id.txtTitulo);
        //mensagem = v.findViewById(R.id.mensagem);
       /* CardView cardView = (CardView) LayoutInflater.from(this) .inflate(R.layout.card, container, false);
        TextView titulo = (TextView) cardView.findViewById(R.id.titulo);
        TextView mensagem = (TextView) cardView.findViewById(R.id.mensagem);*/


        Tarefas tar = TarefaSingleton.getInstance().getTarefas();

        if (tar != null) {
            CardView cardView = (CardView) LayoutInflater.from(getActivity())
                    .inflate(R.layout.card, container, false);
            cardView.findViewById(R.id.titulo);
            TextView titulo = (TextView) cardView.findViewById(R.id.titulo);
            TextView mensagem = (TextView) cardView.findViewById(R.id.mensagem);

            titulo.setText(tar.getTitulo());
            mensagem.setText(tar.getDescricao());
            container.addView(cardView);
        }

       /* private void addItem(String titulo, String mensagem) {
           // CardView cardView = (CardView) LayoutInflater.from(this) .inflate(R.layout.card, container, false);
            TextView titulo = (TextView) cardView.findViewById(R.id.titulo);
            TextView mensagem = (TextView) cardView.findViewById(R.id.mensagem);
            titulo.setText(titulo);
            mensagem.setText(mensagem);
            container.addView(cardView);
        }

        addItem("Título 1", "Exemplo de mensagem."); */

       return v;
    }


}
