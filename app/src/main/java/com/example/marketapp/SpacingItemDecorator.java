package com.example.marketapp;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpacingItemDecorator extends RecyclerView.ItemDecoration {

    //Esta classe serve para que eu possa definir o quanto de espaçamento eu quero entre os itens do meu RecyclerView

    private final int verticalSpaceHeight;

    public SpacingItemDecorator(int verticalSpaceHeight) {
        this.verticalSpaceHeight = verticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = verticalSpaceHeight; //Com esta função eu passo o valor da variável instanciada para ser o valor do espaçamento de baixo entre os itens
    }
}
