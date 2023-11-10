package com.example.testcofee4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;



public class CartFragment extends Fragment {
    // Get a reference to the shared ViewModel using the activity scope
    private CartViewModel viewModel = new CartViewModel();

    int totalForbtnOrder;

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

        /////////////////// Get references to the UI elements for hot choco/////////////////////////
        Button btn_remove_hot_choco = view.findViewById(R.id.btn_remove_hot_chocolate);
        Button btn_add_hot_choco = view.findViewById(R.id.btn_add_hot_chocolate);
        TextView hot_choco_num_view = view.findViewById(R.id.hot_chocolate_num_view);
        CardView hot_choco_card = view.findViewById(R.id.hot_chocolate_card);

        /////////////////// Get references to the UI elements for mixed black/////////////////////////
        Button btn_remove_mixed_black = view.findViewById(R.id.btn_remove_mixed_black);
        Button btn_add_mixed_black = view.findViewById(R.id.btn_add_mixed_black);
        TextView black_mixed_num_view = view.findViewById(R.id.mixd_black_num_view);
        CardView mixed_black_card = view.findViewById(R.id.mixed_black_card);

        /////////////////// Get references to the UI elements for espresso/////////////////////////
        Button btn_remove_espresso2 = view.findViewById(R.id.btn_remove_espresso2);
        Button btn_add_espresso2 = view.findViewById(R.id.btn_add_espresso2);
        TextView espresso2_num_view = view.findViewById(R.id.espresso2_num_view);
        CardView espresso2_card = view.findViewById(R.id.espresso2_card);

        //////////Get references to the UI elements for total amount and order button///////////////
        TextView sub_total = view.findViewById(R.id.sub_total);
        TextView total = view.findViewById(R.id.total);
        Button btn_order = view.findViewById(R.id.btn_order);

        ///////////////////Get reference to the UI element for empty card///////////////////////////
        CardView empty_card = view.findViewById(R.id.empty_card);

        ////////////////////Set up listeners for the buttons for espresso//////////////////////////
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

        ////////////////////Set up listeners for the buttons for hot choco//////////////////////////
        btn_remove_hot_choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeHotChoco();
            }
        });
        btn_add_hot_choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addHotChoco();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////Set up listeners for the buttons for mixed black//////////////////////////
        btn_remove_mixed_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeMixedBlack();
            }
        });
        btn_add_mixed_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addMixedBlack();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////Set up listeners for the buttons for espresso2//////////////////////////
        btn_remove_espresso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeEspresso2();
            }
        });
        btn_add_espresso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addEspresso2();
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////



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
        // Observe the numberOfIceCoffee data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfIceCoffee().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the ice_coffee_num_view to the number of espresso
                ice_coffee_num_view.setText(String.valueOf(integer));
                // Hide the ice_coffee_card if the number of espresso is zero
                if (integer == 0) {
                    ice_coffee_card.setVisibility(View.GONE);
                } else {
                    ice_coffee_card.setVisibility(View.VISIBLE);
                }
            }
        });

        // Observe the numberOfHotChoco data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfHotChoco().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the hot_choco_num_view to the number of espresso
                hot_choco_num_view.setText(String.valueOf(integer));
                // Hide the hot_choco_card if the number of espresso is zero
                if (integer == 0) {
                    hot_choco_card.setVisibility(View.GONE);
                } else {
                    hot_choco_card.setVisibility(View.VISIBLE);
                }
            }
        });

        // Observe the numberOfMixedBlack data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfMixedBlack().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the mixed_black_num_view to the number of espresso
                black_mixed_num_view.setText(String.valueOf(integer));
                // Hide the mixed_black_card if the number of espresso is zero
                if (integer == 0) {
                    mixed_black_card.setVisibility(View.GONE);
                } else {
                    mixed_black_card.setVisibility(View.VISIBLE);
                }
            }
        });

        // Observe the numberOfEspresso2 data from the ViewModel and update the UI accordingly//////
        viewModel.getNumberOfEspresso2().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso2_num_view to the number of espresso
                espresso2_num_view.setText(String.valueOf(integer));
                // Hide the espresso2_card if the number of espresso is zero
                if (integer == 0) {
                    espresso2_card.setVisibility(View.GONE);
                } else {
                    espresso2_card.setVisibility(View.VISIBLE);
                }
            }
        });

        // Observe the empty card data from the ViewModel and update the UI accordingly//////
        viewModel.getTotalAmount().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Hide the empty card if the number of total amount is zero
                if (integer == 0) {
                    totalForbtnOrder = 0;
                    empty_card.setVisibility(View.VISIBLE);
                } else {
                    totalForbtnOrder = 1;
                    empty_card.setVisibility(View.GONE);
                }
            }
        });

        //////////////////////////Set up listener for the order button//////////////////////////////
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(totalForbtnOrder==0){
                    Toast.makeText(getContext(),"Cart is Empty!!!",Toast.LENGTH_SHORT).show();
                }else {
                    // Reset the number of espresso and caramel to zero in the ViewModel
                    viewModel.getNumberOfEspresso().setValue(0);
                    viewModel.getNumberOfCaramel().setValue(0);
                    viewModel.getNumberOfIceCoffee().setValue(0);
                    viewModel.getNumberOfHotChoco().setValue(0);
                    viewModel.getNumberOfMixedBlack().setValue(0);
                    viewModel.getNumberOfEspresso2().setValue(0);
                    viewModel.getTotalAmount().setValue(0);
                    // Move to the ThankActivity activity page using an intent
                    Intent intent = new Intent(getActivity(), ThankActivity.class);
                    startActivity(intent);
                }
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////



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