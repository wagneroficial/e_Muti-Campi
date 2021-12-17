package br.edu.ufopa.muticampi.ui.citb;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.edu.ufopa.muticampi.R;
import br.edu.ufopa.muticampi.Relatorio;
import br.edu.ufopa.muticampi.ui.cmal.AcaoCmal;
import br.edu.ufopa.muticampi.ui.cmal.ContatoCmal;
import br.edu.ufopa.muticampi.ui.cmal.DadosCmal;
import br.edu.ufopa.muticampi.ui.cmal.EditaisCmal;
import br.edu.ufopa.muticampi.videos;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CitbFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CitbFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageButton acao, video, dados, editais, relatorio, contato;

    public CitbFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CitbFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CitbFragment newInstance(String param1, String param2) {
        CitbFragment fragment = new CitbFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_citb, container, false);

        acao = view.findViewById(R.id.acao_citb);
        video = view.findViewById(R.id.video_citb);
        dados = view.findViewById(R.id.dados_citb);
        editais = view.findViewById(R.id.editais_citb);
        relatorio = view.findViewById(R.id.relatorio_citb);
        contato = view.findViewById(R.id.contato_citb);

        acao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), acaoCitb.class);
                startActivity(intent);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), videos.class);
                startActivity(intent);

            }
        });
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosCitb.class);
                startActivity(intent);

            }
        });

        editais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditaisCitb.class);
                startActivity(intent);

            }
        });

        relatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Relatorio.class);
                startActivity(intent);

            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ContatoCitb.class);
                startActivity(intent);

            }
        });


        return view;

    }
}