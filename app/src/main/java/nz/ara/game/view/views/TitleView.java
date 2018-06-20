package nz.ara.game.view.views;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.yac0105.game.R;

/**
 * Created by yac0105 on 20/06/2018.
 */

public class TitleView extends FrameLayout {

    private Button helpButton;

    private TextView textViewName;

    private TextView moveCount;

    public TitleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.title_layout, this);

        helpButton = findViewById(R.id.button_help);

        textViewName = findViewById(R.id.textView_move_name);

        moveCount =  findViewById(R.id.textViewMoveCount);

        helpButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });
    }


    public void setMoveText(String text) {
        moveCount.setText(text);
    }

    public void setHelpButtonListener(OnClickListener l) {
        helpButton.setOnClickListener(l);
    }

}
