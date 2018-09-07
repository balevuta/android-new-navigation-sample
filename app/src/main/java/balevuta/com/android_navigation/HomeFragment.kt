package balevuta.com.android_navigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameTextx = view.findViewById<TextView>(R.id.welcome_text_name)
        val welcomeText = view.findViewById<TextView>(R.id.welcome_text)
        //Normal way to get data

//        val username = arguments?.getString("data")

        val username = arguments?.let {
            val safeArgs = HomeFragmentArgs.fromBundle(it)
            safeArgs.data
        }

        val args = HomeFragmentArgs.fromBundle(arguments)

        nameTextx.text = args.data;

    }
}