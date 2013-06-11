package br.com.pos.mackenzie.pizzaria;

import java.util.ArrayList;

import br.com.pos.mackenzie.pizzaria.domain.Item;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewItemAdapter extends BaseAdapter {
	private ArrayList<Item> itens;
	private Activity activity;

	public GridviewItemAdapter(Activity activity, ArrayList<Item> itens) {
		super();
		this.activity = activity;
		this.itens = itens;
	}

	@Override
	public int getCount() {
		return itens.size();
	}

	@Override
	public String getItem(int position) {
		return itens.get(position).getNome();
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	public static class ViewHolder {
		public ImageView imagemItemImageView;
		public TextView nomeItemTextView;
		public TextView valorItemTextView;
		public TextView descricaoItemTextView;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder view;
		LayoutInflater inflator = activity.getLayoutInflater();

		if (convertView == null) {
			view = new ViewHolder();
			convertView = inflator.inflate(R.layout.gridview_item_row, null);
			
			view.nomeItemTextView = (TextView) convertView
					.findViewById(R.id.nomeItemTextView);
			view.valorItemTextView = (TextView) convertView
					.findViewById(R.id.valorItemTextView);
			view.descricaoItemTextView = (TextView) convertView
					.findViewById(R.id.descricaoItemTextView);

			convertView.setTag(view);
		} else {
			view = (ViewHolder) convertView.getTag();
		}

		view.nomeItemTextView.setText(itens.get(position).getNome());
		view.valorItemTextView.setText("Preço: R$".concat(itens.get(position).getValor().toString()));
		view.descricaoItemTextView.setText(itens.get(position).getDescricao());

		return convertView;
	}

}
