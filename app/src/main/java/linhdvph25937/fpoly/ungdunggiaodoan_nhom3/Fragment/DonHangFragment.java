package linhdvph25937.fpoly.ungdunggiaodoan_nhom3.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import linhdvph25937.fpoly.ungdunggiaodoan_nhom3.Activity.MainActivity;
import linhdvph25937.fpoly.ungdunggiaodoan_nhom3.Adapter.DonHangAdapter;
import linhdvph25937.fpoly.ungdunggiaodoan_nhom3.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DonHangFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DonHangFragment extends Fragment {
    private TextView tvThongBao;
    private RecyclerView rvDs;
    public DonHangFragment() {
        // Required empty public constructor
    }

    public static DonHangFragment newInstance() {
        DonHangFragment fragment = new DonHangFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_don_hang, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvThongBao = view.findViewById(R.id.tvThongBaoDonHang);
        rvDs = view.findViewById(R.id.rvDsDonHang);
        if (MainActivity.listDonHang.size() > 0){
            tvThongBao.setVisibility(View.INVISIBLE);
            rvDs.setVisibility(View.VISIBLE);
            DonHangAdapter donHangAdapter = new DonHangAdapter(getActivity(), MainActivity.listDonHang);
            rvDs.setLayoutManager(new LinearLayoutManager(getActivity()));
            rvDs.setAdapter(donHangAdapter);
        }else{
            tvThongBao.setVisibility(View.VISIBLE);
            rvDs.setVisibility(View.INVISIBLE);
        }
    }
}