package com.example.nurai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.nurai.databinding.FragmentOnboarding2Binding

class OnboardingFragment_2 : Fragment() {

    private lateinit var _binding: FragmentOnboarding2Binding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentOnboarding2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener{
            findNavController().navigate(R.id.action_onboardingFragment_2_to_onboardingFragment_3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = FragmentOnboarding2Binding.inflate(layoutInflater)
    }

}