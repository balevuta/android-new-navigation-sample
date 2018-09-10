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
            val profileId = signup_name.text.toString()

            if (profileId.isNotEmpty()) {
//                val bundle = Bundle()
//                bundle.putString("data", profileId)

                val directions = SignUpFragmentDirections.action_signup_to_home()
                directions.setProfileId(profileId)
                Navigation.findNavController(view).navigate(directions)
            } else {
                Toast.makeText(activity, "name should not empty", Toast.LENGTH_LONG).show()
            }
        }
    }
}
