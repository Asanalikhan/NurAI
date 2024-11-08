package com.example.nurai.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.nurai.R
import com.example.nurai.databinding.FragmentOnboarding1Binding

class OnboardingFragment_1 : Fragment() {

    private lateinit var _binding: FragmentOnboarding1Binding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboarding1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener{
            findNavController().navigate(R.id.action_onboardingFragment_1_to_onboardingFragment_2)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = FragmentOnboarding1Binding.inflate(layoutInflater)
    }
}