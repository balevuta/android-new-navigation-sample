package balevuta.com.android_navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_on_boarding.*

class OnBoardingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_on_boarding, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signIn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.signInFragment)
        }
        signUp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.signUpFragment)
        }
//        view.findViewById<Button>(R.id.signIn)?.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.signInFragment)
//        }
//        view.findViewById<Button>(R.id.signUp)?.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.signUpFragment)
//        }
    }
}
