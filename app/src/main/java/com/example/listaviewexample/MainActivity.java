package com.example.listaviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listViewMovie;
    private MovieRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = new MovieRepository();
        listViewMovie = findViewById(R.id.listViewMovie);

        ArrayAdapter<Movie> adapter = new ArrayAdapter<>(
           getApplicationContext(),
           android.R.layout.simple_list_item_1,
           android.R.id.text1,
           repository.getAll()
        );

        listViewMovie.setAdapter(adapter);
        listViewMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie movie  = repository.get(position);

                Toast.makeText(
                        getApplicationContext(),
                        movie.toString(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}
