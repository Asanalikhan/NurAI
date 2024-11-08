package com.example.nurai.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.nurai.R
import com.example.nurai.databinding.FragmentOnboarding4Binding

class OnboardingFragment_4 : Fragment() {
    private lateinit var _binding: FragmentOnboarding4Binding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboarding4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener{
            findNavController().navigate(R.id.action_onboardingFragment_4_to_onboardingFragment_5)
        }
        binding.skipButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_4_to_onboardingFragment_6)
        }
        binding.root.setOnClickListener{
            val imm = context?.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = FragmentOnboarding4Binding.inflate(layoutInflater)
    }
}