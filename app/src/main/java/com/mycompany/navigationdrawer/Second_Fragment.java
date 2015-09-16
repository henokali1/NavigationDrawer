package com.mycompany.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * This app shows 5 must visit places in Dubai and also it navigates to those 5 places and can convert USD,POUND & EURO in to AED.
 */

public class Second_Fragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonNine;
    Button buttonEight;
    Button buttonZero;
    Button buttonCancleOne;
    Button buttonCancleTwo;

    double currencyValue;
    double currentValue = 0;
    double result = 0;
    Spinner spinner;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String getCurrency = spinner.getSelectedItem().toString();
        String usd = getString(R.string.usd);
        String pound = getString(R.string.pound);

        // changing the value of currencyValue variable based on the selection on the spinner.

        if (getCurrency.equals(usd)) {
            currencyValue = 3.674;
        } else if (getCurrency.equals(pound)) {
            currencyValue = 5.68;
        } else {
            currencyValue = 4.16;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_layout, container, false);


        spinner = (Spinner) view.findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.currency, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

// Initialising buttons for the on click listener

        buttonZero = (Button) view.findViewById(R.id.button_zero);
        buttonZero.setOnClickListener(this);

        buttonOne = (Button) view.findViewById(R.id.button_one);
        buttonOne.setOnClickListener(this);

        buttonTwo = (Button) view.findViewById(R.id.button_two);
        buttonTwo.setOnClickListener(this);

        buttonThree = (Button) view.findViewById(R.id.button_three);
        buttonThree.setOnClickListener(this);

        buttonFour = (Button) view.findViewById(R.id.button_four);
        buttonFour.setOnClickListener(this);

        buttonFive = (Button) view.findViewById(R.id.button_five);
        buttonFive.setOnClickListener(this);

        buttonSix = (Button) view.findViewById(R.id.button_six);
        buttonSix.setOnClickListener(this);

        buttonSeven = (Button) view.findViewById(R.id.button_seven);
        buttonSeven.setOnClickListener(this);

        buttonEight = (Button) view.findViewById(R.id.button_eight);
        buttonEight.setOnClickListener(this);

        buttonNine = (Button) view.findViewById(R.id.button_nine);
        buttonNine.setOnClickListener(this);


        buttonCancleOne = (Button) view.findViewById(R.id.button_cancle_one);
        buttonCancleOne.setOnClickListener(this);

        buttonCancleTwo = (Button) view.findViewById(R.id.button_cancle_two);
        buttonCancleTwo.setOnClickListener(this);

        return view;
    }

    /**
     * This method listens to a button click and calculates currnetValue.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_zero:
                currentValue = (currentValue * 10);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_one:
                currentValue = (currentValue * 10 + 1);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_two:
                currentValue = (currentValue * 10 + 2);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_three:
                currentValue = (currentValue * 10 + 3);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_four:
                currentValue = (currentValue * 10 + 4);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_five:
                currentValue = (currentValue * 10 + 5);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_six:
                currentValue = (currentValue * 10 + 6);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_seven:
                currentValue = (currentValue * 10 + 7);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_eight:
                currentValue = (currentValue * 10 + 8);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_nine:
                currentValue = (currentValue * 10 + 9);
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_cancle_one:
                currentValue = 0;
                result = calculateCurrencyResult();
                displayCurrency();
                break;
            case R.id.button_cancle_two:
                currentValue = 0;
                result = calculateCurrencyResult();
                displayCurrency();
                break;
        }

    }

    /**
     * This method displays the input and converted currency on the screen.
     */
    private void displayCurrency() {
        TextView changeAmountToBeConverted = (TextView) getView().findViewById(R.id.amount_to_be_converted);
        changeAmountToBeConverted.setText("" + currentValue);
        TextView changeAmountConverted = (TextView) getView().findViewById(R.id.amount_converted);
        changeAmountConverted.setText("" + result);
    }

    /**
     * This method calculates the converted currency.
     */

    private double calculateCurrencyResult() {
        return (currencyValue * currentValue);
    }

}