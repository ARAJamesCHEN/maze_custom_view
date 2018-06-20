package nz.ara.game.view.views;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;

import com.example.yac0105.game.R;

/**
 * Created by yac0105 on 20/06/2018.
 */

public class BottomView extends FrameLayout {

    private Spinner level_spinner;

    private Button reset;

    private Button pause;

    private Button save;

    private Button loadByFile;


    public BottomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.bottom_layout, this);

        level_spinner = findViewById(R.id.level_spinner);

        reset = findViewById(R.id.button_reset);

        pause = findViewById(R.id.button_pause);

        save = findViewById(R.id.button_save);

        loadByFile = findViewById(R.id.button_new);

        level_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                ((Activity) getContext()).finish();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        reset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        save.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        loadByFile.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

    }

    public Spinner setItemSelectedListener(AdapterView.OnItemSelectedListener l){

        level_spinner.setOnItemSelectedListener(l);

        return level_spinner;


    }

    public void setLevels(String[] levels){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(),
                android.R.layout.simple_spinner_item, levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        level_spinner.setAdapter(adapter);
    }

    public void setResetButtonListener(OnClickListener l) {
        reset.setOnClickListener(l);
    }

    public void setPauseButtonListener(OnClickListener l) {
        pause.setOnClickListener(l);
    }

    public void setSaveButtonListener(OnClickListener l) {
        save.setOnClickListener(l);
    }

    public void setLoadByFileButtonListener(OnClickListener l) {
        loadByFile.setOnClickListener(l);
    }
}




