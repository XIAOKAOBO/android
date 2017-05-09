/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 */
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int i;
    private int price;
    public TextView quantityTextView;
    public TextView priceTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=0;
        price=0;
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView =(TextView) findViewById(R.id.price_text_view);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        /*i++;
        price=50*i;*/
        display(priceTextView,price);
    }


    /*
     *methods for add and minus the quantity and price
     */
    public void plus(View view){
        i++;
        price=50*i;
        display(quantityTextView,i);
        //display(priceTextView,price);
    }

    public void minus(View view){
        i--;
        price=50*i;
        display(quantityTextView,i);
        //display(priceTextView,price);
    }


    /**
     * This method displays the given quantity value on the screen.
     *
     *
     */
    private void display(TextView view,int number) {
        view.setText(""+number);
        //quantityTextView.setText("" + i);
        //priceTextView.setText("" + price);
    }
}