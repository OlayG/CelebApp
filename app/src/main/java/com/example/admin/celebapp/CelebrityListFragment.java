package com.example.admin.celebapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CelebrityListFragment extends Fragment {

    ArrayList<Celebrity> celebrities = new ArrayList<>();
    ArrayList<AdapterItems> listCelebrities = new ArrayList<>();

    ListView lvCelebList;
    MyCustomAdapter adapter;

    public CelebrityListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_celebrity_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lvCelebList = view.findViewById(R.id.lvCelebrityList);

        celebrities.clear();
        listCelebrities.clear();
        Celebrity test = new Celebrity(
                "Neymarda Silva Santos Júnior",
                "Professional Footballer",
                "Neymar da Silva Santos Júnior, commonly known as Neymar or Neymar Jr., is a Brazilian professional footballer who plays as a forward for French club Paris Saint-Germain and the Brazil national team.",
                "5′ 9″",
                "February 5, 1992",
                "Rafaella Beckran",
                "He played futsal and street pickup games growing up in Sao Paulo, Brazil, and began his career playing for Santos's junior team when he was 11.",
                "25",
                R.drawable.neymar
        );
        Celebrity test2 = new Celebrity(
                "Olay Gureje",
                "Developer",
                "I eat food and drink water",
                "6′ 1″",
                "December 1, 1991",
                "Fola Gureje",
                "I once fell asleep in class",
                "25",
                R.drawable.neymar
        );
        celebrities.add(test);
        celebrities.add(test2);
        for (int i = 0; i < 2; i++) {
            listCelebrities.add(new AdapterItems(
                    celebrities.get(i).photo, celebrities.get(i).name,
                    celebrities.get(i).age, celebrities.get(i).profesion));
        }

        adapter = new MyCustomAdapter(listCelebrities);
        lvCelebList.setAdapter(adapter);

        lvCelebList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                CelebrityInfoFragment celebrityInfoFragment = CelebrityInfoFragment.newInstance(celebrities.get(i));
                getFragmentManager().beginTransaction().replace(
                        R.id.flFrag1, celebrityInfoFragment).addToBackStack(null).commit();
                Toast.makeText(CelebrityListFragment.this.getActivity(), "WORKS", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private class MyCustomAdapter extends BaseAdapter {
        public ArrayList<AdapterItems> listCelebrities;

        public MyCustomAdapter(ArrayList<AdapterItems> listCelebrities) {
            this.listCelebrities = listCelebrities;
        }


        @Override
        public int getCount() {
            return listCelebrities.size();
        }

        @Override
        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater mInflater = getActivity().getLayoutInflater();
            View myView = mInflater.inflate(R.layout.layout_listview_celebs, null);

            final AdapterItems s = listCelebrities.get(position);

            ImageView ivCelebPhoto = myView.findViewById(R.id.ivCelebPhoto);
            ivCelebPhoto.setImageResource(s.Photo);
            TextView tvFullName = myView.findViewById(R.id.tvFullName);
            tvFullName.setText(s.FullName);
            TextView tvAge = myView.findViewById(R.id.tvAge);
            tvAge.setText(s.Age);
            TextView tvProfession = myView.findViewById(R.id.tvProfession);
            tvProfession.setText(s.Profession);

            return myView;
        }

    }

}
