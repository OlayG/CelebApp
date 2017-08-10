package com.example.admin.celebapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CelebrityInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CelebrityInfoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private Celebrity mParam1;

    ImageView ivPhotoInfo;
    TextView tvFullNameInfo,tvProfessionInfo,tvDescriptionInfo,
            tvDobInfo,tvHeightInfo,tvSiblingsInfo,tvFunFactInfo;


    public CelebrityInfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment CelebrityInfoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CelebrityInfoFragment newInstance(Celebrity param1) {
        CelebrityInfoFragment fragment = new CelebrityInfoFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_celebrity_info, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivPhotoInfo = view.findViewById(R.id.ivPhotoInfo);
        tvFullNameInfo = view.findViewById(R.id.tvFullNameInfo);
        tvProfessionInfo = view.findViewById(R.id.tvProfessionInfo);
        tvDescriptionInfo = view.findViewById(R.id.tvDescriptionInfo);
        tvDobInfo = view.findViewById(R.id.tvDobInfo);
        tvHeightInfo = view.findViewById(R.id.tvHeightInfo);
        tvSiblingsInfo = view.findViewById(R.id.tvSiblingsInfo);
        tvFunFactInfo = view.findViewById(R.id.tvFunFactInfo);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ivPhotoInfo.setImageResource(mParam1.photo);
        tvFullNameInfo.setText(mParam1.name);
        tvProfessionInfo.setText(mParam1.profesion);
        tvDescriptionInfo.setText(mParam1.discription);
        tvDobInfo.setText(mParam1.dob);
        tvHeightInfo.setText(mParam1.height);
        tvSiblingsInfo.setText(mParam1.siblings);
        tvFunFactInfo.setText(mParam1.funfact);
    }
}
