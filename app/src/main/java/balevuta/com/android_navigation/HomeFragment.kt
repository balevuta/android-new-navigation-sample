package balevuta.com.android_navigation

import android.app.Activity
import android.app.Notification
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.NotificationCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavDeepLinkBuilder


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

        val profileId = arguments?.let {
            HomeFragmentArgs.fromBundle(it).profileId
        }
        nameTextx.text = profileId;

    }

    fun onPushNotif() {
        val notificationBuilder = NotificationCompat.Builder(context!!, "1")

        val deepLinkBuilder = NavDeepLinkBuilder(context!!)
                .setGraph(R.navigation.main_navigation)
                .setDestination(R.id.homeFragment)
                .setArguments(bundleOf(Pair("name", "balevuta")))

        val pendingIntent = deepLinkBuilder.createPendingIntent()

        notificationBuilder.setContentIntent(pendingIntent)
    }
}