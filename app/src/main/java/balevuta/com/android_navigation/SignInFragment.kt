package balevuta.com.android_navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_in.*


class SignInFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        skipBtn.setOnClickListener {
//            val intent = Intent(activity, TabActivity::class.java)
//            startActivity(intent)

            findNavController().navigate(R.id.action_signin_to_tabActivity)
        }

        signIn.setOnClickListener {
            val textData: String = email.text.toString();
            if (textData.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("data", textData)
                findNavController().navigate(R.id.action_signin_to_tabFragment, bundle)
            } else {
                Toast.makeText(activity, "name should not empty", Toast.LENGTH_LONG).show()
            }
        }
    }

}
