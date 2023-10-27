package com.example.testcofee4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.widget.Button;
import android.widget.TextView;


public class MenuFragment extends Fragment {
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        // Get references to the UI elements for espresso
        Button btn_menu_remove_espresso = view.findViewById(R.id.btn_menu_remove_espresso);
        Button btn_menu_add_espresso = view.findViewById(R.id.btn_menu_add_espresso);
        TextView espresso_menu_num_view = view.findViewById(R.id.espresso_menu_num_view);

        // Get references to the UI elements for caramel
        Button btn_menu_remove_caramel = view.findViewById(R.id.btn_menu_remove_caramel);
        Button btn_menu_add_caramel = view.findViewById(R.id.btn_menu_add_caramel);
        TextView caramel_menu_num_view = view.findViewById(R.id.caramel_menu_num_view);

        // Set up listeners for the buttons for espresso
        btn_menu_remove_espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeEspresso();
            }
        });
        btn_menu_add_espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addEspresso();
            }
        });

        // Set up listeners for the buttons for caramel
        btn_menu_remove_caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeCaramel method from the ViewModel
                viewModel.removeCaramel();
            }
        });
        btn_menu_add_caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addCaramel method from the ViewModel
                viewModel.addCaramel();
            }
        });

        // Observe the numberOfEspresso data from the ViewModel and update the UI accordingly
        viewModel.getNumberOfEspresso().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                espresso_menu_num_view.setText(String.valueOf(integer));
            }
        });

        // Observe the numberOfCaramel data from the ViewModel and update the UI accordingly
        viewModel.getNumberOfCaramel().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the caramel_menu_num_view to the number of caramel
                caramel_menu_num_view.setText(String.valueOf(integer));
            }
        });

        return view;
    }
}