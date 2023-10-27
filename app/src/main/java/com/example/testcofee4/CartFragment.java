package com.example.testcofee4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.widget.Button;
import androidx.lifecycle.Observer;
import android.widget.TextView;


public class CartFragment extends Fragment {
    // Get a reference to the shared ViewModel using the activity scope
    private EspressoViewModel viewModel = new EspressoViewModel();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(EspressoViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        // Get references to the UI elements
        Button btn_remove_espresso = view.findViewById(R.id.btn_remove_espresso);
        Button btn_add_espresso = view.findViewById(R.id.btn_add_espresso);
        TextView espresso_num_view = view.findViewById(R.id.espresso_num_view);
        TextView sub_total = view.findViewById(R.id.sub_total);
        TextView total = view.findViewById(R.id.total);
        CardView espresso_card = view.findViewById(R.id.espresso_card);

        // Set up listeners for the buttons
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

        // Observe the numberOfEspresso data from the ViewModel and update the UI accordingly
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

        // Observe the totalAmount data from the ViewModel and update the UI accordingly
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
