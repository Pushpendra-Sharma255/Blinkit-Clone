package blink.it.clone.Auth

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import blink.it.clone.R
import blink.it.clone.databinding.FragmentSplashFragBinding

class SplashFrag : Fragment() {
    lateinit var binding: FragmentSplashFragBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashFragBinding.inflate(layoutInflater);
        Handler(Looper.getMainLooper()).postDelayed(
            {
                findNavController().navigate(R.id.action_splash_frag_to_signin_frag)
            }, 3000
        )
        return binding.root
    }


}