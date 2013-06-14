package br.com.pos.mackenzie.pizzaria;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class TelaMontagemBasicaActivity extends PizzariaActivity {
	
	private static final Integer ACTIVITY_TELA = R.layout.activity_tela_montagem_basica;
	
	private ImageButton imagemBotao;

	@Override
	public int getLayoutContentView() {
		return ACTIVITY_TELA;
	}

	@Override
	public int getCodigoMenuInflater() {
		return R.menu.tela_montagem_basica;
	}

	@Override
	public void mapeiaComponentes() {
		
		imagemBotao = (ImageButton) findViewById(R.id.botao_tela_montagem_basica);
		
		imagemBotao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				proximaTela();
			}
		});
	}

	public void proximaTela() {
		Intent intent = new Intent(TelaMontagemBasicaActivity.this, TelaIngredienteActivity.class);
		startActivityForResult(intent, ACTIVITY_TELA);
	}
	
	@Override
	public void setaResultadoActivity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtemExtras() {
		// TODO Auto-generated method stub
		
	}

}
