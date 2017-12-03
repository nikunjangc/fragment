package nyc.c4q.fragments2;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TransferQueue;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {
    View rootView;
    TextView text;
    EditText editText;
    Button nextButton;

    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView=inflater.inflate(R.layout.fragment_new,container,false);
        text=(TextView) rootView.findViewById(R.id.fragment_textview);
        editText=(EditText) rootView.findViewById(R.id.fragment_edittext);
        nextButton=(Button) rootView.findViewById(R.id.fragment_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment= new SecondFragment();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Bundle bundle=new Bundle();
                bundle.putString("text01",editText.getText().toString());
                secondFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.frag_container_framelayout,secondFragment);
                fragmentTransaction.addToBackStack("new_fragment");
                fragmentTransaction.commit();
            }
        });
        return rootView;
    }

}
