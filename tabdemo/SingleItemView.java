package learnuptech.tabdemo;

/**
 * Created by Abdul Rehman Bhatti on 12/17/2017.
 */

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtrank;
    TextView txtcountry;
    TextView txtpopulation;
    ImageView imgflag;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get a single position
        position = i.getExtras().getInt("position");
        // Get the list of rank
        rank = i.getStringArrayExtra("rank");
        // Get the list of country
        country = i.getStringArrayExtra("country");
        // Get the list of population
        population = i.getStringArrayExtra("population");
        // Get the list of flag
        flag = i.getIntArrayExtra("flag");

        // Locate the TextViews in singleitemview.xml
        txtrank = (TextView) findViewById(R.id.rank);
        txtcountry = (TextView) findViewById(R.id.country);
        txtpopulation = (TextView) findViewById(R.id.population);

        // Locate the ImageView in singleitemview.xml
        imgflag = (ImageView) findViewById(R.id.flag);

        // Load the text into the TextViews followed by the position
        txtrank.setText(rank[position]);
        txtcountry.setText(country[position]);
        txtpopulation.setText(population[position]);

        // Load the image into the ImageView followed by the position
        imgflag.setImageResource(flag[position]);
    }
}