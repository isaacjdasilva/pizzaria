package br.com.pos.mackenzie.pizzaria;

import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;
import br.com.pos.mackenzie.pizzaria.domain.EnumMockItens;
import br.com.pos.mackenzie.pizzaria.domain.Item;

public class TelaIngredienteActivity extends PizzariaActivity {

	private static final Integer ACTIVITY_TELA = R.layout.activity_tela_ingrediente;

	public static final String PARAMETRO_ITEM_SELECIONADO = "item_selecionado";
	public static final String PARAMETRO_ITEM_NOME = "item_nome";
	public static final String PARAMETRO_ITEM_VALOR = "item_valor";
	public static final String PARAMETRO_ITEM_DESCRICAO = "item_descricao";

	private GridviewMontagemBasicaAdapter adapterItem;
	private ArrayList<Item> itens;

	private GridView gridViewItem;

	private ImageButton imagemBotao;

	@Override
	public void mapeiaComponentes() {

		imagemBotao = (ImageButton) findViewById(R.id.botao_tela_ingrediete);

		imagemBotao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				proximaTela();
			}
		});

		configurarItens();

		adapterItem = new GridviewMontagemBasicaAdapter(this, itens);

		gridViewItem = (GridView) findViewById(R.id.gridViewItem);
		gridViewItem.setAdapter(adapterItem);

		// gridViewItem.setOnItemClickListener(new OnItemClickListener() {
		// @Override
		// public void onItemClick(AdapterView<?> arg0, View arg1,
		// int position, long arg3) {
		//
		// if (!Util.isNullOuVazio(getItens())) {
		// // Toast.makeText(MainActivity.this, adapterItem.getItem(position),
		// Toast.LENGTH_SHORT).show();
		//
		// Item escolha = getItens().get(position);
		//
		// Intent intent = new Intent(TelaPrincipalActivity.this,
		// ItemDetalheActivity.class);
		//
		// Bundle extras = new Bundle();
		// extras.putInt(PARAMETRO_ITEM_SELECIONADO, position);
		// extras.putString(PARAMETRO_ITEM_NOME, escolha.getNome());
		// extras.putDouble(PARAMETRO_ITEM_VALOR, escolha.getValor());
		// extras.putString(PARAMETRO_ITEM_DESCRICAO, escolha.getDescricao());
		//
		// intent.putExtras(extras);
		//
		// startActivityForResult(intent, CODIGO);
		// }
		// }
		// });

	}

	public void configurarItens() {

		itens = new ArrayList<Item>();

		for (EnumMockItens enumMockItens : EnumMockItens.values()) {
			itens.add(new Item(enumMockItens.getId(), enumMockItens.getNome(),
					enumMockItens.getValor(), enumMockItens.getDescricao()));
		}
	}

	@Override
	protected void onActivityResult(int codigo, int resultado, Intent intent) {
		if (resultado == ItemDetalheActivity.ACTIVITY_TELA) {
			Toast.makeText(this, "Retornou da Activity ItemDetalheActivity",
					Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "Retornou de outra Activity não definida",
					Toast.LENGTH_SHORT).show();
		}
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public void proximaTela() {

		if (!Util.isNullOuVazio(getItens())) {
			// Toast.makeText(MainActivity.this, adapterItem.getItem(position),
			// Toast.LENGTH_SHORT).show();

			// Item escolha = getItens().get(position);

			// Intent intent = new Intent(TelaPrincipalActivity.this,
			// ItemDetalheActivity.class);
			//
			// Bundle extras = new Bundle();
			// extras.putInt(PARAMETRO_ITEM_SELECIONADO, position);
			// extras.putString(PARAMETRO_ITEM_NOME, escolha.getNome());
			// extras.putDouble(PARAMETRO_ITEM_VALOR, escolha.getValor());
			// extras.putString(PARAMETRO_ITEM_DESCRICAO,
			// escolha.getDescricao());
			//
			// intent.putExtras(extras);

			Intent intent = new Intent(TelaIngredienteActivity.this,
					ItemDetalheActivity.class);
			startActivityForResult(intent, ACTIVITY_TELA);
		}
	}

	@Override
	public int getLayoutContentView() {
		return ACTIVITY_TELA;
	}

	@Override
	public int getCodigoMenuInflater() {
		return R.menu.tela_ingrediente;
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
