package com.example.pz1;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {

    private static final String ARG_TEXT = "arg_text";
    private static final String ARG_BG = "arg_bg";

    public static PageFragment newInstance(String text, int bgColor) {
        PageFragment f = new PageFragment();
        Bundle b = new Bundle();
        b.putString(ARG_TEXT, text);
        b.putInt(ARG_BG, bgColor);
        f.setArguments(b);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page, container, false);
        TextView tv = v.findViewById(R.id.page_text);
        String text = getArguments() != null ? getArguments().getString(ARG_TEXT) : "";
        int bg = getArguments() != null ? getArguments().getInt(ARG_BG) : Color.WHITE;
        tv.setText(text);
        v.setBackgroundColor(bg);
        return v;
    }
}
