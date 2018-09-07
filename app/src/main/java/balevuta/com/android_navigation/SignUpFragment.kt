package balevuta.com.android_navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sign_up.*


class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signUp.setOnClickListener {
            val name = signup_name.text.toString()
            if (name.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("data", name)
                Navigation.findNavController(view).navigate(R.id.action_signup_to_home, bundle)
            } else {
                Toast.makeText(activity, "name should not empty", Toast.LENGTH_LONG).show()
            }
        }

//        view.findViewById<Button>(R.id.signUp)?.setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.next_action, bundle)
//        )
    }
}
