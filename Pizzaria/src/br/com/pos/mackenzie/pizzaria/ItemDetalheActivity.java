package br.com.pos.mackenzie.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ItemDetalheActivity extends PizzariaActivity {
	
	public static final Integer CODIGO = R.layout.item_detalhe;

	private TextView nomeItemDetalheSelecionadoTextView;
//	private ImageView imagem_item_detalhe;
	private TextView nomeItemDetalheTextView;
	private TextView valorItemDetalheTextView;
	private TextView descricaoItemDetalheTextView;
	
	
	private Button voltarButton;
	private Button comprarButton;

	@Override
	public void mapeiaComponentes() {
		
		nomeItemDetalheSelecionadoTextView = (TextView) findViewById(R.id.nomeItemDetalheSelecionadoTextView);
//		imagem_item_detalhe = (ImageView) findViewById(R.id.imagem_item_detalhe);
		nomeItemDetalheTextView = (TextView) findViewById(R.id.nomeItemDetalheTextView);
		valorItemDetalheTextView = (TextView) findViewById(R.id.valorItemDetalheTextView);
		descricaoItemDetalheTextView = (TextView) findViewById(R.id.descricaoItemDetalheTextView);

		voltarButton = (Button) findViewById(R.id.voltarButton);
		comprarButton = (Button) findViewById(R.id.comprarButton);
		
		voltarButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setaResultadoActivity();
			}
		});

		comprarButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				telaConfigurarCompra();
			}
		});

	}

	public void setaResultadoActivity() {
		Intent intent = new Intent();
		setResult(getCodigoActivity(), intent);
		finish();
	}

	public void telaConfigurarCompra() {
		Intent intent = new Intent(ItemDetalheActivity.this, TelaPrincipalActivity.class);
		startActivityForResult(intent, CODIGO);
	}

	@Override
	public void obtemExtras() {
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			int itemSelecionado = extras
					.getInt(TelaPrincipalActivity.PARAMETRO_ITEM_SELECIONADO);
			nomeItemDetalheSelecionadoTextView.setText(String.valueOf(itemSelecionado));
			
//			imagem_item_detalhe.setImageResource(extras
//					.getInt(TelaPrincipalActivity.PARAMETRO_ITEM_IMAGE));
			
			nomeItemDetalheTextView.setText(extras
					.getString(TelaPrincipalActivity.PARAMETRO_ITEM_NOME));
			
			valorItemDetalheTextView.setText("Preço: R$".concat(String
					.valueOf(extras
							.getDouble(TelaPrincipalActivity.PARAMETRO_ITEM_VALOR))));
			
			descricaoItemDetalheTextView.setText(extras
					.getString(TelaPrincipalActivity.PARAMETRO_ITEM_DESCRICAO));
		}

	}

	@Override
	public int getLayoutContentView() {
		return CODIGO;
	}

	@Override
	public int getCodigoMenuInflater() {
		return -1;
	}
}
