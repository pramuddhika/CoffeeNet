package com.example.testcofee4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;



public class CartFragment extends Fragment {
    // Get a reference to the shared ViewModel using the activity scope
    private CartViewModel viewModel = new CartViewModel();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(CartViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ///////////////////// Inflate the layout for this fragment/////////////////////////////////
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        /////////////////// Get references to the UI elements for espresso/////////////////////////
        Button btn_remove_espresso = view.findViewById(R.id.btn_remove_espresso);
        Button btn_add_espresso = view.findViewById(R.id.btn_add_espresso);
        TextView espresso_num_view = view.findViewById(R.id.espresso_num_view);
        CardView espresso_card = view.findViewById(R.id.espresso_card);

        ////////////////////Get references to the UI elements for caramel///////////////////////////
        Button btn_remove_caramel = view.findViewById(R.id.btn_remove_caramel);
        Button btn_add_caramel = view.findViewById(R.id.btn_add_caramel);
        TextView caramel_num_view = view.findViewById(R.id.caramel_num_view);
        CardView caramel_card = view.findViewById(R.id.caramal_card);

        /////////////////// Get references to the UI elements for ice coffee/////////////////////////
        Button btn_remove_ice_coffee = view.findViewById(R.id.btn_remove_ice_coffee);
        Button btn_add_ice_coffee = view.findViewById(R.id.btn_add_ice_coffee);
        TextView ice_coffee_num_view = view.findViewById(R.id.ice_cofee_num_view);
        CardView ice_coffee_card = view.findViewById(R.id.ice_coffee_card);

        //////////Get references to the UI elements for total amount and order button///////////////
        TextView sub_total = view.findViewById(R.id.sub_total);
        TextView total = view.findViewById(R.id.total);
        Button btn_order = view.findViewById(R.id.btn_order);

        ///////////////////Get reference to the UI element for empty card///////////////////////////
        CardView empty_card = view.findViewById(R.id.empty_card);

        ////////////////////Set up listeners for the buttons for espresso///////////////////////////
        btn_remove_espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeEspresso();
            }
        });
        btn_add_espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addEspresso();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        ///////////////Set up listeners for the buttons for caramel/////////////////////////////////
        btn_remove_caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeCaramel method from the ViewModel
                viewModel.removeCaramel();
            }
        });
        btn_add_caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addCaramel method from the ViewModel
                viewModel.addCaramel();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////Set up listeners for the buttons for ice coffee///////////////////////////
        btn_remove_ice_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeIceCoffee();
            }
        });
        btn_add_ice_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addIceCoffee();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////Set up listener for the order button//////////////////////////////
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset the number of espresso and caramel to zero in the ViewModel
                viewModel.getNumberOfEspresso().setValue(0);
                viewModel.getNumberOfCaramel().setValue(0);
                viewModel.getNumberOfIceCoffee().setValue(0);
                viewModel.getTotalAmount().setValue(0);
                // Move to the ThankActivity activity page using an intent
                Intent intent = new Intent(getActivity(), ThankActivity.class);
                startActivity(intent);
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////

        // Observe the numberOfEspresso data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfEspresso().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_num_view to the number of espresso
                espresso_num_view.setText(String.valueOf(integer));
                // Hide the espresso_card if the number of espresso is zero
                if (integer == 0) {
                    espresso_card.setVisibility(View.GONE);
                } else {
                    espresso_card.setVisibility(View.VISIBLE);
                }
            }
        });

        ///////Observe the numberOfCaramel data from the ViewModel and update the UI accordingly////
        viewModel.getNumberOfCaramel().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the caramel_num_view to the number of caramel
                caramel_num_view.setText(String.valueOf(integer));
                // Hide the caramel_card if the number of caramel is zero
                if (integer == 0) {
                    caramel_card.setVisibility(View.GONE);
                } else {
                    caramel_card.setVisibility(View.VISIBLE);
                }
            }
        });
        // Observe the numberOfEspresso data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfIceCoffee().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_num_view to the number of espresso
                ice_coffee_num_view.setText(String.valueOf(integer));
                // Hide the espresso_card if the number of espresso is zero
                if (integer == 0) {
                    ice_coffee_card.setVisibility(View.GONE);
                } else {
                    ice_coffee_card.setVisibility(View.VISIBLE);
                }
            }
        });

        ///////Observe the totalAmount data from the ViewModel and update the UI accordingly////////
        viewModel.getTotalAmount().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the sub_total and total to the total amount
                sub_total.setText(String.valueOf(integer));
                total.setText(String.valueOf(integer));
            }
        });

        return view;
    }
}