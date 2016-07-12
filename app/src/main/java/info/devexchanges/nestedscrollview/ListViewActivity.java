package info.devexchanges.nestedscrollview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

public class ListViewActivity extends AppCompatActivity {

    private LinkedList<String> strings;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view);

        ListView listView = (ListView) findViewById(R.id.list_view);

        setDummyData();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_list_view, R.id.text_view, strings);
        listView.setAdapter(adapter);

    }

    private void setDummyData() {
        strings = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(getString(R.string.long_text));
        }
    }
}
