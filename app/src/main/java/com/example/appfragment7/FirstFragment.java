package com.example.appfragment7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.appfragment7.databinding.FragmentFirstBinding;
import com.example.appfragment7.databinding.FragmentSecondBinding;

import java.util.ArrayList;

    public class FirstFragment extends Fragment {

        private FragmentFirstBinding binding;

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @Override
        public View onCreateView(
                LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState
        ) {
            View view=inflater.inflate(R.layout.fragment_first,container,false);
          //  binding = FragmentFirstBinding.inflate(inflater, container, false);
          //  return binding.getRoot();
            return view;

        }

        public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

          String []navne={"Anne","Bent","Carl","Dennis","Erik","Frederik","Karen","Jakob","Lars"};
          ListView listview=(ListView)view.findViewById(R.id.listview1);
          ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,navne);
          listview.setAdapter(adapter);
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }


    }

