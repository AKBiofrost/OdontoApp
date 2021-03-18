package com.example.proto_hd_odontologia;

import android.content.Context;
//import android.graphics.Color;
//import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.appcompat.app.AlertController;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

private List<ListElement> mData;
private LayoutInflater mInflater;
private Context context;


    public ListAdapter(List<ListElement> itemList, Context context){

    this.mInflater= LayoutInflater.from(context);
    this.context= context;
    this.mData= itemList;


}

@Override
    public int getItemCount(){ return mData.size();}

@Override

    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

    View view=mInflater.inflate(R.layout.list_element, null);

    return new ListAdapter.ViewHolder(view);


}

@Override

    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){

    holder.bindData(mData.get(position));

}

public void setItems(List<ListElement> items){ mData = items; }


public class ViewHolder extends RecyclerView.ViewHolder{

    ImageView iconImage;
    TextView Nombrepaciente, tratamiento, dia;

    ViewHolder( View itemView){

        super(itemView);

        iconImage= itemView.findViewById(R.id.iconImageView);
        Nombrepaciente=itemView.findViewById(R.id.nombrePaciente);
        tratamiento=itemView.findViewById(R.id.dia);

    }

void bindData(final ListElement item){


        //iconImage.setColorFilter(Color.parseColor(item.getColor(), PorterDuff.Mode.SRC_IN));// es para apis mayores o iguales a 30
        Nombrepaciente.setText(item.getName());
        tratamiento.setText(item.getTratamiento());
        dia.setText(item.getDia());
}




}



}
