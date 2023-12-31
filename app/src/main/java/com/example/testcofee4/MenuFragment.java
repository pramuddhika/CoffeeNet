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
//IM/2020/057

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
        // ////////////////Inflate the layout for this fragment///////////////////////////////////
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        // //////////Get references to the UI elements for espresso////////////////////////////////
        Button btn_menu_remove_espresso = view.findViewById(R.id.btn_menu_remove_espresso);
        Button btn_menu_add_espresso = view.findViewById(R.id.btn_menu_add_espresso);
        TextView espresso_menu_num_view = view.findViewById(R.id.espresso_menu_num_view);

        // ////////////////Get references to the UI elements for caramel//////////////////////////
        Button btn_menu_remove_caramel = view.findViewById(R.id.btn_menu_remove_caramel);
        Button btn_menu_add_caramel = view.findViewById(R.id.btn_menu_add_caramel);
        TextView caramel_menu_num_view = view.findViewById(R.id.caramel_menu_num_view);

        // /////////////////Get references to the UI elements for ice coffee//////////////////////
        Button btn_menu_remove_ice_coffee = view.findViewById(R.id.btn_menu_remove_ice_coffee);
        Button btn_menu_add_ice_coffee = view.findViewById(R.id.btn_menu_add_ice_coffee);
        TextView ice_coffee_menu_num_view = view.findViewById(R.id.ice_coffee_menu_num_view);

        // /////////////////Get references to the UI elements for hot choco//////////////////////
        Button btn_menu_remove_hot_choco = view.findViewById(R.id.btn_menu_remove_hot_choco);
        Button btn_menu_add_hot_choco = view.findViewById(R.id.btn_menu_add_hot_choco);
        TextView hot_choco_menu_num_view = view.findViewById(R.id.hot_choco_menu_num_view);

        // /////////////////Get references to the UI elements for mixed black//////////////////////
        Button btn_menu_remove_mixed_black = view.findViewById(R.id.btn_menu_remove_mixed_black);
        Button btn_menu_add_mixed_black = view.findViewById(R.id.btn_menu_add_mixed_black);
        TextView mixed_black_menu_num_view = view.findViewById(R.id.mixed_black_menu_num_view);

        // /////////////////Get references to the UI elements for espresso2//////////////////////
        Button btn_menu_remove_espresso2 = view.findViewById(R.id.btn_menu_remove_espresso2);
        Button btn_menu_add_espresso2 = view.findViewById(R.id.btn_menu_add_espresso2);
        TextView espresso2_menu_num_view = view.findViewById(R.id.espresso2_menu_num_view);

        /////////////////// Set up listeners for the buttons for espresso/////////////////////////
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

        //////////////////Set up listeners for the buttons for caramel/////////////////////////////
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

        /////////////////// Set up listeners for the buttons for ice coffee/////////////////////////
        btn_menu_remove_ice_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeIceCoffee();
            }
        });
        btn_menu_add_ice_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addIceCoffee();
            }
        });

        /////////////////// Set up listeners for the buttons for hot choco/////////////////////////
        btn_menu_remove_hot_choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeHotChoco();
            }
        });
        btn_menu_add_hot_choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addHotChoco();
            }
        });

        /////////////////// Set up listeners for the buttons for mixed black/////////////////////////
        btn_menu_remove_mixed_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeMixedBlack();
            }
        });
        btn_menu_add_mixed_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addMixedBlack();
            }
        });

        /////////////////// Set up listeners for the buttons for espresso2/////////////////////////
        btn_menu_remove_espresso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the removeEspresso method from the ViewModel
                viewModel.removeEspresso2();
            }
        });
        btn_menu_add_espresso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the addEspresso method from the ViewModel
                viewModel.addEspresso2();
            }
        });



        ////// Observe the numberOfEspresso data from the ViewModel and update the UI accordingly///
        viewModel.getNumberOfEspresso().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                espresso_menu_num_view.setText(String.valueOf(integer));
            }
        });

        ///// Observe the numberOfCaramel data from the ViewModel and update the UI accordingly/////
        viewModel.getNumberOfCaramel().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the caramel_menu_num_view to the number of caramel
                caramel_menu_num_view.setText(String.valueOf(integer));
            }
        });

        ////// Observe the numberOfIceCoffee data from the ViewModel and update the UI accordingly///
        viewModel.getNumberOfIceCoffee().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                ice_coffee_menu_num_view.setText(String.valueOf(integer));
            }
        });

        ////// Observe the numberOfHotChoco data from the ViewModel and update the UI accordingly///
        viewModel.getNumberOfHotChoco().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                hot_choco_menu_num_view.setText(String.valueOf(integer));
            }
        });

        ////// Observe the numberOfMixedBlack data from the ViewModel and update the UI accordingly///
        viewModel.getNumberOfMixedBlack().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                mixed_black_menu_num_view.setText(String.valueOf(integer));
            }
        });

        ////// Observe the numberOfEspresso2 data from the ViewModel and update the UI accordingly///
        viewModel.getNumberOfEspresso2().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // Set the text of the espresso_menu_num_view to the number of espresso
                espresso2_menu_num_view.setText(String.valueOf(integer));
            }
        });

        return view;
    }
}